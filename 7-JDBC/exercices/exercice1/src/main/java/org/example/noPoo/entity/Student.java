package org.example.noPoo.entity;

public class Student {
    private int id ;
    private String firstname;
    private String lastname;
    private int class_number;
    private String diplome_date;

    public Student(int id, String firstname, String lastname, int class_number, String diplome_date) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.class_number = class_number;
        this.diplome_date = diplome_date;
    }

    public Student(String firstname, String lastname, int class_number, String diplome_date) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.class_number = class_number;
        this.diplome_date = diplome_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getClass_number() {
        return class_number;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }

    public String getDiplome_date() {
        return diplome_date;
    }

    public void setDiplome_date(String diplome_date) {
        this.diplome_date = diplome_date;
    }

    @Override
    public String toString() {
        return getId()+"etudiant :"+getFirstname()+" "+getLastname()+" de la classe "+getClass_number()+" diplome le "+getDiplome_date();
    }
}
