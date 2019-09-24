package zhaoyy.integration.service;

import zhaoyy.integration.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-24
 */
public interface IPostService extends IService<Post> {

    /**
    * 获取所有Post
    *
    * @param
    * @return java.util.List<zhaoyy.integration.entity.Post>
    * @author zhaoyuyang
    * @since 2019/9/24 0024 17:48
    */
    List<Post> getAllPost();

}
