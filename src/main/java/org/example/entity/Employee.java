package org.example.entity;

import java.util.Objects;

public class Employee {
    private Integer id;
    private String firstname;
    private String lastname;

    public Employee(Integer id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", firstname='" + firstname + "', lastname='" + lastname + "'}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee that = (Employee) o;
        return Objects.equals(id, that.id);
    }
    @Override
    public int hashCode() { return Objects.hash(id); }
}
