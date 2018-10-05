package dubbo.example.api.service;

import model.Salary;

public interface HelloService {

    String sayHello(String nickName);

    Salary getSalary(Long id);
}
