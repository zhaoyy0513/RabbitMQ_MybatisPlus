package zhaoyy.integration.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import zhaoyy.integration.dto.FocusDTO;
import zhaoyy.integration.entity.Focus;
import zhaoyy.integration.mapper.FocusMapper;
import zhaoyy.integration.service.IFocusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zhaoyy.integration.util.PageEntity;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-25
 */
@Service
public class FocusServiceImpl extends ServiceImpl<FocusMapper, Focus> implements IFocusService {

    @Resource
    private FocusMapper mapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insertFocus(Focus focus) {
        mapper.insert(focus);
        //获取插入之后返回的数据id
        return focus.getId();
    }


    @Transactional(readOnly=true,rollbackFor = Exception.class)
    @Override
    public IPage<FocusDTO> getAllFocus(Page<FocusDTO> page) {
        //查询所有Focus
        IPage<FocusDTO> focusDTOIPage = mapper.listFocus(page);
        System.out.println("service"+ JSONObject.toJSONString(focusDTOIPage.getRecords()));
        return mapper.listFocus(page);
    }
}
