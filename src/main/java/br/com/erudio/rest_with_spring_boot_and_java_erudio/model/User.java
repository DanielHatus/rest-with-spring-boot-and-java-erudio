package br.com.erudio.rest_with_spring_boot_and_java_erudio.model;

public class User {
    private String name;
    private String city;
    private int age;
    private String country;


    public User(String name,String city,int age,String country){
        this.name=name;
        this.city=city;
        this.country=country;
        this.age=age;
    }

    public User(){}

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getCity(){
        return this.city;
    }

    public String getCountry(){
        return this.country;
    }
}
