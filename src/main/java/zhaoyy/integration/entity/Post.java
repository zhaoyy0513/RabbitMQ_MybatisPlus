package zhaoyy.integration.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 帖子id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 发帖用户的索引id
     */
    private Integer postUserId;

    /**
     * 发帖id
     */
    private String postUserName;

    /**
     * 帖子标题
     */
    private String postTitle;

    /**
     * 帖子标签(分类)
     */
    private Integer postTabId;

    /**
     * 帖子标签名
     */
    private String postTabName;

    /**
     * 帖子标签的父标签名
     */
    private Integer tabParentid;

    /**
     * 帖子内容
     */
    private String postContent;

    /**
     * 发帖时间 
     */
    private String postTime;

    /**
     * 发帖附带的图片
     */
    private String postContentImg;

    /**
     * 发帖人照片
     */
    private String postUserIcon;

    /**
     * 帖子点击数
     */
    private Integer postClickCount;

    /**
     * 帖子回复数
     */
    private Integer postReplyCount;

    /**
     * 帖子最后回复者
     */
    private String postLastReply;

    /**
     * 帖子最后回复时间
     */
    private String postLastReplyTime;

    /**
     * 帖子最后回复时间(差值)用来显示在页面上
     */
    private String postLastReplyTimeSimple;


}
