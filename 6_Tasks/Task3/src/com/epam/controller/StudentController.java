package com.epam.controller;

import com.epam.entity.Student;
import com.epam.service.StudentService;

public class StudentController {

    // get all
    public static void getAll() {
        StudentService.getAll();
    }

    // add
    public static void addStudent(Student student) {
        StudentService.addStudent(student);
    }

    // edit
    public static void editStudent(Student student) {
        StudentService.editStudent(student);
    }

}
