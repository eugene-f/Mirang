package com.frolov.mirang.entity;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private List<Wish> created;
    private List<Wish> performed;
    private int coins;
    
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
