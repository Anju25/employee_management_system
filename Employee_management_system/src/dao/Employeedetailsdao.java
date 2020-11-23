package dao;

import java.sql.SQLException;
import java.util.List;

import model.Employee;

public interface Employeedetailsdao 
{
   int add(Employee emp) throws SQLException;
   int delete(String id);
   Employee select(String email);
   List<Employee> display();
}
