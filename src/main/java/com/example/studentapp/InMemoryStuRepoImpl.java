package com.example.studentapp;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStuRepoImpl implements StuRepo {

    Map<String,Student> database= new HashMap<>();

    @Override
    public void save(Student student) {
        database.put(student.getId(),student);
    }

    @Override
    public Student get(String id) {
        return database.get(id);
    }

    @Override
    public void delete(String id) {
        database.remove(id);
    }

    @Override
    public Student update(Student student) {
        database.replace(student.getId(),student);
        return student;
    }
}
