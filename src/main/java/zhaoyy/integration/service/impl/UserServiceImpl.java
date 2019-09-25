package zhaoyy.integration.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import zhaoyy.integration.dto.UserDTO;
import zhaoyy.integration.entity.User;
import zhaoyy.integration.mapper.UserMapper;
import zhaoyy.integration.service.IUserService;
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
 * @since 2019-09-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    UserMapper mapper;

    @Override
    public IPage<UserDTO> listAllUser(Page<User> page) {
        return mapper.listAllUser(page);
    }
}
