package dubbo.demo.consumer;

import dubbo.demo.consumer.util.SpringManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = {"dubbo.demo.consumer.controller", "dubbo.demo.consumer.util"},
        exclude= {DataSourceAutoConfiguration.class})
public class ConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        SpringManager.setApplicationContext(context);
 //       SpringApplication.run(ConsumerApplication.class, args);
    }
}
