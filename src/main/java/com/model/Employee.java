package main.java.com.model;

import java.util.Set;

/**
 * Created by gayathri on 6/7/17.
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private float salary;
    private Set certificates;

    public Employee(){}

    public Employee(String firstName, String lastName,
                    float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Set getCertificates() {
        return certificates;
    }

    public void setCertificates(Set certificates) {
        this.certificates = certificates;
    }
}
