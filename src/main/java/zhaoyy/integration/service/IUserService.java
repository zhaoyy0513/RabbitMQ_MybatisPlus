package zhaoyy.integration.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import zhaoyy.integration.dto.UserDTO;
import zhaoyy.integration.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-25
 */
public interface IUserService extends IService<User> {

    /**
    * 获取所有用户
    *
    * @param
    * @return java.util.List<zhaoyy.integration.dto.UserDTO>
    * @author zhaoyuyang
    * @since 2019/9/25 0025 17:59
    */
    IPage<UserDTO> listAllUser(Page<User> page);
}
