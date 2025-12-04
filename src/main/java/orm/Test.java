package orm;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import orm.config.Config;
import orm.dao.EmployeeDao;
import orm.model.Employee;

public class Test {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        EmployeeDao employee = container.getBean("employeeDao", EmployeeDao.class);
        Employee employee1 = employee.getEmployee(1);
        System.out.println(employee1);
//        employee.saveEmp(new Employee("Tom","tom@gmail.com"));
        Employee employee2 = employee.getEmployee(4);
        employee2.setName("Taylor");
        employee2.setEmail("taylor@gmail.com");
        employee.updateEmp(employee2);

    }
}
