package zhaoyy.integration.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import zhaoyy.integration.constants.enums.DeletedEnum;
import zhaoyy.integration.dto.FocusDTO;
import zhaoyy.integration.entity.Focus;
import zhaoyy.integration.entity.User;
import zhaoyy.integration.exception.BaseWebException;
import zhaoyy.integration.rabbitMq.producer.FocusProducerService;
import zhaoyy.integration.service.IFocusService;
import zhaoyy.integration.vo.ErrorResponseEntity;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-25
 */
@RestController
@RequestMapping("/focus")
public class FocusController {
    @Resource
    private IFocusService focusService;
    @Resource
    private FocusProducerService focusProducerService;

    @PostMapping
    public ResponseEntity insertFocus(@RequestBody JSONObject jsonObject){
        Focus focus = new Focus();
        Integer userId = jsonObject.getInteger("userId");
        if(userId==null){
            throw new BaseWebException(new ErrorResponseEntity(HttpStatus.BAD_REQUEST,"userId不能为空"));
        }
        focus.setUserId(userId);
        String focusId = jsonObject.getString("focusId");
        if(StringUtils.isBlank(focusId)){
            throw new BaseWebException(new ErrorResponseEntity(HttpStatus.BAD_REQUEST,"focusId不能为空"));
        }
        focus.setFocusedId(focusId);
        focus.setDeleted(DeletedEnum.NO.value);
        return ResponseEntity.ok().body(focusService.insertFocus(focus));
    }

    @GetMapping
    public ResponseEntity listFocus(@RequestParam(required = false,defaultValue = "1")int current,
                                    @RequestParam(required = false,defaultValue = "5")int size)
    {
        Page<FocusDTO> page = new Page<>(current,size);
        IPage<FocusDTO> pages = focusService.getAllFocus(page);
        focusProducerService.listAllFocus();  //给MQ队列发消息
        return ResponseEntity.ok().body(pages);
    }

    @PutMapping
    public ResponseEntity updateFocus(@RequestBody JSONObject jsonObject){
        Integer id = jsonObject.getInteger("id");
        Integer userId = jsonObject.getInteger("userId");
        String focusId = jsonObject.getString("focusId");
        Focus focus = new Focus();
        focus.setId(id);
        focus.setUserId(userId);
        focus.setFocusedId(focusId);
        //查看乐观锁是否成功
        focus.setVersion(1);
        return ResponseEntity.ok().body(focusService.updateById(focus));
    }

}
