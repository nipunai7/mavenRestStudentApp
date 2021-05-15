package com.example.studentapp;

public class StuClassController {

    StuRepo repository = new InMemoryStuRepoImpl();

    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable String id){
        repository.delete(id);
        return repository.get(id).getName() +" is deleted successfully";
    }

    @PostMapping("/student/update")
    public String updateStudent(@RequestBody Student student){
        Student updatedStudent=repository.update(student);

        return "Student details updated " +student + "to :" + updatedStudent;
    }

}
