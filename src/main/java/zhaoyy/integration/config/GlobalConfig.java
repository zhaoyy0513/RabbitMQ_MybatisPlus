package zhaoyy.integration.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaoyuyang
 * @createTime 2019/9/20 0020 13:49
 */
@Configuration
public class GlobalConfig {
    /**
     * 分页配置
     *
     * @param
     * @return com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     * @author zhaoyuyang
     * @since 2019/9/20 0020 13:47
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        //指定 MySQL 方言，否则它可能不知道怎么写分页函数，就无法获取total和pages
        page.setDialectType("mysql");
        return page;
    }

    /**
    * 乐观锁配置
    *
    * @param
    * @return com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor
    * @author zhaoyuyang
    * @since 2019/9/26 0026 9:41
    */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }

}
