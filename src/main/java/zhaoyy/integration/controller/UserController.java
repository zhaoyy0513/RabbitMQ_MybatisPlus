package zhaoyy.integration.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zhaoyy.integration.dto.UserDTO;
import zhaoyy.integration.entity.User;
import zhaoyy.integration.service.IUserService;

import javax.annotation.Resource;
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
@RequestMapping("/user")
public class UserController {
    @Resource
    IUserService userService;

    @GetMapping
    public ResponseEntity listUser(@RequestParam(required = false,defaultValue = "1")int current,
                                   @RequestParam(required = false,defaultValue = "5")int size){
        Page<UserDTO>  page = new Page<>(current,size);
        IPage<UserDTO> dto = userService.listAllUser(page);
        return ResponseEntity.ok().body(dto);
    }
}
