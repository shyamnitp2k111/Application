package com.springbootapplication.application.jpa.relation.onetoonemapping;

import jakarta.persistence.*;

@Entity
public class UserData {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private UserAddress userAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
