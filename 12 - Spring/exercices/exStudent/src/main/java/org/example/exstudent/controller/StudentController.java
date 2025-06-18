package org.example.exstudent.controller;

import org.example.exstudent.model.Student;
import org.example.exstudent.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String homePage(){
        return "accueil";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("students",studentService.getAllStudent());
        return "studentList";
    }

    @GetMapping("/register")
    public String formRegister(Model model){
        model.addAttribute("student",new Student());
        return "studentRegisterOrUpdate";
    }

    @PostMapping("/registerOrUpdate")
    public String register (@ModelAttribute("student")Student student){
        if (student.getId() == null){
            student.setId(UUID.randomUUID());
        }
        studentService.saveOrUpdate(student);
        return "redirect:/list";
    }

    @GetMapping("/update/{id}")
    public String updateForm (@PathVariable("id") UUID id , Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "studentRegisterOrUpdate";
    }

    @GetMapping("/details/{id}")
    public String detailStudent (@PathVariable("id") UUID id , Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "studentDetail";
    }

    @GetMapping("/filter")
    public String filterStudent (@RequestParam (value = "lastname") String lastname , Model model){
        model.addAttribute("students",studentService.getStudentByName(lastname));
        return "studentList";
    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable("id") UUID id){
        studentService.deleteStudent(id);
        return "redirect:/list";
    }



}
