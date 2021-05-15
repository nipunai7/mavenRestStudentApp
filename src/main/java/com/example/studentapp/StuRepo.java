package com.example.studentapp;

public interface StuRepo {

    void save(Student student);
    Student get(String id);
    void delete(String id);
    void update(Student Student);
}
