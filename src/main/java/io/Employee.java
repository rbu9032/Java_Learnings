package io;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

    private int empId;
    //private List<String> skills;

    private Set<String> skills;
    private Map<Integer, String> hobbies;
    public Employee(){

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

//    public List<String> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(List<String> skills) {
//        this.skills = skills;
//    }


    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public Map<Integer, String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Map<Integer, String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", skills=" + skills +
                ", hobbies=" + hobbies +
                '}';
    }
}
