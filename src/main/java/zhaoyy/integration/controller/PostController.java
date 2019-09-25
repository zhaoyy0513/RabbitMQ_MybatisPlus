package zhaoyy.integration.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import zhaoyy.integration.entity.Post;
import zhaoyy.integration.service.IPostService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-24
 */
@Controller
@RequestMapping("/post")
public class PostController {

    @Resource
    private IPostService postService;

    @GetMapping
    public ResponseEntity listPosts(){
        return ResponseEntity.ok().body(postService.getAllPost());
    }

}
