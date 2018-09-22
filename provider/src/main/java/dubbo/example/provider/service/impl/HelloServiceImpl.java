package dubbo.example.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.example.api.service.HelloService;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServiceImpl implements HelloService {

    //private static  final Logger logger = Logger.getLogger(HelloServiceImpl.class.getName());
    @Override
    public String sayHello(String nickName) {
        //System.out.println(nickName);
       // logger.info("function sayHello");
        return "Hello " + nickName;
    }
}
