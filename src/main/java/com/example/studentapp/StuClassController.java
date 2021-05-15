package com.example.studentapp;

public class StuClassController {

    StuRepo repository = new InMemoryStuRepoImpl();

    @PostMapping("/student")
    public void createStudent(@Request Student student){
        repository.save(student);
    }

}
