package com.jdev.Jdev.controller.exception;

import com.jdev.Jdev.model.Course;
import com.jdev.Jdev.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    public CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        System.out.println(course.getCategory());
        return courseRepository.save(course);
    }
}
