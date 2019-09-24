package zhaoyy.integration.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zhaoyy.integration.entity.Post;
import zhaoyy.integration.service.IPostService;

import javax.annotation.Resource;

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

//    @Autowired
//    public PostController(IPostService postService) {
//        this.postService = postService;
//    }

    @RequestMapping("/getAllPosts")
    public ResponseEntity getAllPosts(){
        return ResponseEntity.ok().body(postService.getAllPost());
    }

    @RequestMapping("/getAllPost")
    public ResponseEntity getAllPost(){
        return ResponseEntity.ok().body(postService.getMap(new QueryWrapper<Post>().lambda().ne(Post::getId,0)));
    }

}
