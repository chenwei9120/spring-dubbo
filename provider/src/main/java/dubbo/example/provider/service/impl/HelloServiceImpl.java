package dubbo.example.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dao.SalaryMapper;
import dubbo.example.api.service.HelloService;
import model.Salary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServiceImpl implements HelloService {

    @Autowired(required = false)
    public SalaryMapper salaryMapper;

    //private static  final Logger logger = Logger.getLogger(HelloServiceImpl.class.getName());
    @Override
    public String sayHello(String nickName) {
        //System.out.println(nickName);
        // logger.info("function sayHello");
        return "Hello " + nickName;
    }

    @Override
    public Salary getSalary(Long id) {
        try {
            return salaryMapper.selectByPrimaryKey(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Salary> getAll() {
        return salaryMapper.selectAll();
    }
}
