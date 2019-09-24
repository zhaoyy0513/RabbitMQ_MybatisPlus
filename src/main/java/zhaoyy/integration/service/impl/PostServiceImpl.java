package zhaoyy.integration.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import zhaoyy.integration.entity.Post;
import zhaoyy.integration.mapper.PostMapper;
import zhaoyy.integration.service.IPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-24
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {
    @Resource
    PostMapper mapper;

    @Override
    public List<Post> getAllPost() {
        return mapper.selectList(new QueryWrapper<Post>().lambda().ne(Post::getId,1));
    }
}
