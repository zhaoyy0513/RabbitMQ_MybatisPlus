package zhaoyy.integration.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import zhaoyy.integration.dto.FocusDTO;
import zhaoyy.integration.entity.Focus;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaoyy
 * @since 2019-09-25
 */
public interface FocusMapper extends BaseMapper<Focus> {

    /**
    * 插入Focus，并且可以获得插入之后的id
    *
    * @param focus
    * @return int
    * @author zhaoyuyang
    * @since 2019/9/25 0025 9:58
    */
    int insertGetId(Focus focus);

}
