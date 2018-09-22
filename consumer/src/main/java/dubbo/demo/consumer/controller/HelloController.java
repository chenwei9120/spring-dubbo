package dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.example.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345",
            timeout = 3000
    )
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {

            return helloService.sayHello(name);
    }

    @RequestMapping("/")
    public String home() {
        return "index.html";
    }
}


//@RestController
//public class DemoConsumerController {
//
//    @Reference(version = "${demo.service.version}",
//            application = "${dubbo.application.id}",
//            url = "dubbo://localhost:12345")
//    private DemoService demoService;
//
//
//
//
//
//}