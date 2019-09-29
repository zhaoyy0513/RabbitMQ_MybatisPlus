package zhaoyy.integration.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import zhaoyy.integration.dto.FocusDTO;
import zhaoyy.integration.entity.Focus;
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
public interface IFocusService extends IService<Focus> {

    /**
    * 添加关注
    *
    * @param focus 要插入的focus
    * @return int  返回插入成功后的id值
    * @author zhaoyuyang
    * @since 2019/9/25 0025 9:22
    */
    int insertFocus(Focus focus);

   /**
   * 获取所有focus
   *
   * @param page
   * @return com.baomidou.mybatisplus.core.metadata.IPage<zhaoyy.integration.entity.Focus>
   * @author zhaoyuyang
   * @since 2019/9/25 0025 17:41
   */
    IPage<FocusDTO> getAllFocus(Page<FocusDTO> page);

}
