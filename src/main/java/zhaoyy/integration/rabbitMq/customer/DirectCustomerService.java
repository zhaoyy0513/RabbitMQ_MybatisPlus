package zhaoyy.integration.rabbitMq.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaoyuyang
 * @createTime 2019/9/25 0025 14:17
 */
@Component
public class DirectCustomerService {

    @RabbitListener(queues = "insertFocus")
    //@RabbitHandler
    public void insertFocus(String focus){
        System.out.println("插入的内容为:"+focus);
    }

    @RabbitListener(queues = "getAllFocus")
    //@RabbitHandler
    public void getAllFocus(){
        System.out.println("查询时间为"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
