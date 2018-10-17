package dubbo.example.api.service;

import model.Salary;

import java.util.List;

public interface HelloService {

    String sayHello(String nickName);

    Salary getSalary(Long id);

    List<Salary> getAll();
}
