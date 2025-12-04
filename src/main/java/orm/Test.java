package orm;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import orm.dao.EmployeeDao;
import orm.model.Employee;

public class Test {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeDao employee = container.getBean("employeeDao", EmployeeDao.class);
        Employee employee1 = employee.getEmployee(1);
        System.out.println(employee1);
        employee.saveEmp(new Employee("Tom","tom@gmail.com"));

    }
}
