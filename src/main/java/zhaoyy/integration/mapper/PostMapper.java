package zhaoyy.integration.mapper;

import org.apache.ibatis.annotations.Mapper;
import zhaoyy.integration.entity.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-24
 */
@Mapper
public interface PostMapper extends BaseMapper<Post> {

}
