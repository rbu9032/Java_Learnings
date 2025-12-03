package cmd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate jdbcTemplate = container.getBean("jdbcTemplate", JdbcTemplate.class);
        //jdbcTemplate.update("Insert into employee values(?,?,?)",2,"Ram","ram@gmail.com");
        //jdbcTemplate.update("Update employee set email=?, name=? where empId=?","ram@gmail.com","Ram",2);
        //jdbcTemplate.update("Delete from employee where empId=2");
        Employee employee = jdbcTemplate.queryForObject("select * from employee where empId=1", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        });
        System.out.println("Use queryForObject to select a single row from the table");
        System.out.println(employee);
        List<Employee> employee1 = jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        });
        System.out.println("----------------------------------------------");
        System.out.println("Use query to select all rows from a table using anonymous inner class");
        System.out.println(employee1);
        List<Employee> employee2 = jdbcTemplate.query("select * from employee",(rs, num) -> new Employee(rs.getInt(1 ),rs.getString(2), rs.getString(3)));
        System.out.println("----------------------------------------------");
        System.out.println("Use query to select all rows from a table using Lambda");
        System.out.println(employee2);
    }
}
