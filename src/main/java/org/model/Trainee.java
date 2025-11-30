package org.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Trainee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int traineeId;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "trainees_courses",
            joinColumns = {@JoinColumn(name = "traineeId")},
            inverseJoinColumns = {@JoinColumn(name = "courseId")})
    private List<Course> courses;
    public Trainee() {
    }

    public Trainee(String name) {
        this.name = name;
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "traineeId=" + traineeId +
                ", name='" + name + '\'' +
                '}';
    }
}
