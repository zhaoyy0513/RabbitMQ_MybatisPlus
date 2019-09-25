package zhaoyy.integration.rabbitMq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;
import zhaoyy.integration.entity.Focus;

import javax.annotation.Resource;

/**
 * @author zhaoyuyang
 * @createTime 2019/9/25 0025 14:11
 */

@Component
public class FocusProducerService {
    @Resource
    AmqpTemplate template;

    public void insertFocus(Focus focus) {
        this.template.convertAndSend("insertFocus", focus.toString());
    }

    public void listAllFocus(){
        this.template.convertAndSend("getAllFocus");
    }
}
