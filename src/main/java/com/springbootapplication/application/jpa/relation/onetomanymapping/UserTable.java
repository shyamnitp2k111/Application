package com.springbootapplication.application.jpa.relation.onetomanymapping;

import com.springbootapplication.application.jpa.relation.onetoonemapping.UserAddress;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserTable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<UserAddressTable> userAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserAddressTable> getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(List<UserAddressTable> userAddress) {
        this.userAddress = userAddress;
    }
}
