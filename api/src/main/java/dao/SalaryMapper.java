package dao;

import model.Salary;
import org.apache.ibatis.annotations.Mapper;
import util.MyMapper;
//import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SalaryMapper extends MyMapper<Salary> {

}
