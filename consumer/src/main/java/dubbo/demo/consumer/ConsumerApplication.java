package dubbo.demo.consumer;

import dubbo.example.api.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ImportResource("classpath:dubbo-consumer.xml")
//@ComponentScan(basePackages ={"dubbo.demo.consumer.controller"} )
@SpringBootApplication(scanBasePackages = "dubbo.demo.consumer.controller")
public class ConsumerApplication {

    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
//       // ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
//        Object obj = ctx.getBean("helloService");
//        HelloService helloService = null;
//        try {
//            helloService = (HelloService) obj;
//        } catch (Exception e){
//
//        }
//        System.out.println(helloService.sayHello("12345"));
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
