package br.com.erudio.rest_with_spring_boot_and_java_erudio.Model;



import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name="person")
public class Person {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(name = "name_complete",nullable = false,length=90)
    private String name;

    @Column(nullable = false,length=85)
    private String email;

    @Column(nullable = false,length=16)
    private String dateOfBirth;

    @Column(nullable = false,length=10)
    private String gender;

    @Column(nullable = false,length=90)
    private String addres;

    @Column(nullable = false,length=90)
    private int age;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public Long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getAddres() {
        return addres;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return getId() == person.getId() && getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getDateOfBirth(), person.getDateOfBirth()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getAddres(), person.getAddres());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getDateOfBirth(), getGender(), getAddres(), getId(), getAge());
    }
}
