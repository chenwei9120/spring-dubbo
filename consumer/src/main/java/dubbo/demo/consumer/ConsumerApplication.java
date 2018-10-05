package dubbo.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

//@ImportResource("classpath:transaction.xml")
//@ComponentScan(basePackages ={"dubbo.demo.consumer.controller"} )
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"dubbo.demo.consumer.controller"},
        exclude= {DataSourceAutoConfiguration.class})
public class ConsumerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        SpringManager.setApplicationContext(context);
 //       SpringApplication.run(ConsumerApplication.class, args);
    }
}
