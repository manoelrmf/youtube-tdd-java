package br.com.tddjava.tddjava.modules.course.repositories;

import br.com.tddjava.tddjava.modules.course.entities.Course;

public interface ICourseRepository {

    public Course findByName(String name);

    public Course save(Course course);
}
