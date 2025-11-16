package com.example.demo.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Person")
public class Person {
    private String id;
    private String name;
    private int age;

    public Person() {}

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters et Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
