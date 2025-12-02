package core;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${id}")
    private int studentId;
    @Value("${name}")
    private String name;

    @Autowired
    private Address address;

    public Student() {
    }

    public Student(int studentId, String name, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    @PostConstruct
    public void init(){
        System.out.println("Post Constructor Called");
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}
