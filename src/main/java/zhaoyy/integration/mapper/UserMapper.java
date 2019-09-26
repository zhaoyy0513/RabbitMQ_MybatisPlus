package zhaoyy.integration.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import zhaoyy.integration.dto.UserDTO;
import zhaoyy.integration.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-25
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<UserDTO> listAllUser(Page<UserDTO> page);
}
