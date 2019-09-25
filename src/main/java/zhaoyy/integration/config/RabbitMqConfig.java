package zhaoyy.integration.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaoyuyang
 * @createTime 2019/9/25 0025 14:15
 */
@Configuration
public class RabbitMqConfig {
    @Bean
    public Queue queue1(){
        //定义一个简单队列，队列名为insertFocus
        return new Queue("insertFocus");
    }

    @Bean
    public Queue queue2(){
        //定义一个简单队列，队列名为insertFocus
        return new Queue("getAllFocus");
    }

}
