package br.com.tddjava.tddjava.modules.course.controller;

import br.com.tddjava.tddjava.modules.course.entities.Course;
import br.com.tddjava.tddjava.modules.course.repositories.CourseRepository;
import br.com.tddjava.tddjava.modules.course.services.CreateCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/")
    public Course createCourse(@RequestBody Course course){
        CreateCourseService createCourseService = new CreateCourseService(this.courseRepository);
        return createCourseService.execute(course);
    }
}
