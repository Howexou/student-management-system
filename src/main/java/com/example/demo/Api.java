package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class Api {
    private final List<Student> students = new ArrayList<>();
    private final List<Course> courses = new ArrayList<>();
    private final StudentController studentController = new StudentController();
    private final CourseController courseController = new CourseController();

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
        }
    

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courses;
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        courses.add(course);
        return course;
    }
    @PostMapping("/enroll")
    public Enrollment enrollStudent(@RequestBody Enrollment enrollment) {
        Student student = studentController.getStudentById(enrollment.getStudent());
        Course course = courseController.getCourseByCode(enrollment.getCourse());
        course.enrollStudent(student);
        return enrollment;
    }
}
