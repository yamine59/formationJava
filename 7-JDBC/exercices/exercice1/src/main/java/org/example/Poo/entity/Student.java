package org.example.Poo.entity;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String dateDegree;
    private int classNumber;

    public Student(String firstName, String lastName, String dateDegree, int classNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateDegree = dateDegree;
        this.classNumber = classNumber;
    }

    public Student(int id, String firstName, String lastName, String dateDegree, int classNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateDegree = dateDegree;
        this.classNumber = classNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateDegree() {
        return dateDegree;
    }

    public void setDateDegree(String dateDegree) {
        this.dateDegree = dateDegree;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateDegree='" + dateDegree + '\'' +
                ", classNumber=" + classNumber +
                '}';
    }
}
