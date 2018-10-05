package dao;

import model.Salary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface SalaryMapper {

    Salary selectByPrimaryKey(@Param("id") Long id, @Param("ss") double salary);

}
