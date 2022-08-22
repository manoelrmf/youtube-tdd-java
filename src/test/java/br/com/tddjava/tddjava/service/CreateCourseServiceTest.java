package br.com.tddjava.tddjava.service;

import br.com.tddjava.tddjava.modules.course.entities.Course;
import br.com.tddjava.tddjava.modules.course.repositories.CourseInMemoryRepository;
import br.com.tddjava.tddjava.modules.course.services.CreateCourseService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateCourseServiceTest {

    @Test
    public void should_be_able_to_create_a_new_course(){

        Course course = new Course();
        course.setDescription("Curso_description_test");
        course.setName("Curso_name");
        course.setWorkload(100);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        CreateCourseService createCourseService = new CreateCourseService(repository);
        Course createdCourse = createCourseService.execute(course);

        assertNotNull(createdCourse.getId());
    }

}
