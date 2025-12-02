package io;

public class Student {

    private int studentId;
    private String name;

    private Address addr;
    public Student(){
        System.out.println("Student Object Created");
    }

    public Student(int studentId, String name, Address addr) {
        this.studentId = studentId;
        this.name = name;
        this.addr = addr;
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

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", address=" + addr +
                '}';
    }
}
