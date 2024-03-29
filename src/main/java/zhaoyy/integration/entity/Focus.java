package zhaoyy.integration.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Focus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关注索引
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户索引id
     */
    private Integer userId;

    /**
     * 被关注者的索引id
     */
    private String focusedId;

    private Integer deleted;

    @Version
    private Integer version;


}
