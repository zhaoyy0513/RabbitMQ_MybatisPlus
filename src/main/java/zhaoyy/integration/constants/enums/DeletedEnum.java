package zhaoyy.integration.constants.enums;

/**
 * @author zhaoyuyang
 * @createTime 2019/9/25 0025 11:24
 */
public enum DeletedEnum {
    /**
    * 已删除
    *
    * @param null
    * @return
    * @author zhaoyuyang
    * @since 2019/9/25 0025 11:31
    */
   YES(1),

    /**
    * 未删除
    *
    * @param null
    * @return
    * @author zhaoyuyang
    * @since 2019/9/25 0025 11:31
    */
    NO(0);

    public final int value;
    DeletedEnum(int value) {
        this.value = value;
    }
}
