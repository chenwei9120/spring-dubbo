package dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dao.SalaryMapper;
import dubbo.demo.consumer.util.SpringManager;
import dubbo.example.api.service.HelloService;
import model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345",
            timeout = 3000
    )
    private HelloService helloService;

    @Autowired(required = false)
    public SalaryMapper salaryMapper;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        //HelloService helloService = SpringManager.getBean("helloService", HelloService.class);
        return helloService.sayHello(name);
    }

    @GetMapping("/getSalary")
    public Salary getSalaryById(@RequestParam Long id) {
        //HelloService helloService = SpringManager.getBean("helloService", HelloService.class);
        Salary salary = helloService.getSalary(id);
        return salary;
    }

    @GetMapping("/getAll")
    public List<Salary> getAll() {
        List<Salary> listSalary = helloService.getAll();
        return listSalary;
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
//}