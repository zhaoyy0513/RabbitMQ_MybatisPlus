package zhaoyy.integration.dto;

import lombok.Data;
import zhaoyy.integration.entity.User;

/**
 * @author zhaoyuyang
 * @createTime 2019/9/25 0025 17:57
 */
@Data
public class UserDTO extends User {
    private String roleName;
}
