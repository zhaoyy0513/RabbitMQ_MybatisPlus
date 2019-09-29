package zhaoyy.integration.dto;

import lombok.Data;
import zhaoyy.integration.entity.Focus;

/**
 * @author zhaoyuyang
 * @createTime 2019/9/25 0025 15:40
 */
@Data
public class FocusDTO extends Focus {
    String roleName;
    String userName;
    String userCollege;

    public FocusDTO(Focus focus) {
        this.setId(focus.getId());
        this.setUserId(focus.getUserId());
        this.setDeleted(focus.getDeleted());
        this.setFocusedId(focus.getFocusedId());
        this.setId(focus.getId());
    }

    public FocusDTO() {
    }
}
