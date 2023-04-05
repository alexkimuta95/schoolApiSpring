package com.aleki.school.controller;


import com.aleki.school.model.StudentDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentApiService {

    StudentDetails studentDetails;

    @GetMapping("{studentId}")
public StudentDetails getStudentDetails(String studentId){
    return new StudentDetails("sid1","Alex Kimutai","Address 1","0726794142");
}

@PostMapping
public String createStudentDetails(@RequestBody StudentDetails studentDetails){
this.studentDetails = studentDetails;
return "Student Created Successfully";
}

@PutMapping
    public String updateStudentDetails(@RequestBody StudentDetails studentDetails){
        this.studentDetails = studentDetails;
        return "Student Updated Successfully";
    }
    @DeleteMapping("{studentId}")
    public String deleteStudentDetails(String studentId){
        this.studentDetails = null;
        return "Student Deleted Successfully";
    }
}
