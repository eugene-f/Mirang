package com.frolov.mirang.entity;

import java.util.List;
import java.util.UUID;

public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String city;
    private List<Wish> created;
    private List<Wish> performed;
    private int coins;

    public User() {
        uuid = UUID.randomUUID();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Wish> getCreated() {
        return created;
    }

    public void setCreated(List<Wish> created) {
        this.created = created;
    }

    public List<Wish> getPerformed() {
        return performed;
    }

    public void setPerformed(List<Wish> performed) {
        this.performed = performed;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
