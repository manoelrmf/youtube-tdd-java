package br.com.tddjava.tddjava.modules.course.repositories;

import br.com.tddjava.tddjava.modules.course.entities.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CourseInMemoryRepository implements ICourseRepository {

    private List<Course> courses;

    public CourseInMemoryRepository(){
        this.courses = new ArrayList<>();
    }


    @Override
    public Course findByName(String name) {
        Optional<Course> optionalCourse = this.courses.stream().filter(c -> c.getName().equals(name))
                .findFirst();
        return optionalCourse.orElse(null);
    }

    @Override
    public Course save(Course course) {
        this.courses.add(course);
        course.setId(UUID.randomUUID());
        return course;
    }
}
