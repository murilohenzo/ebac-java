package br.com.murilo.modules.course;

import br.com.murilo.domain.Course;
import br.com.murilo.repository.ICourseRepository;
import br.com.murilo.repository.implement.CourseRepository;
import org.junit.Test;

public class CourseTest {

    private final ICourseRepository courseRepository;

    public CourseTest() {
        courseRepository = new CourseRepository();
    }

    @Test
    public void whenNewCourseInformedThenShouldBeCreated() {
        Course course = new Course();
        course.setCode("A1");
        course.setName("Curso de Java Backend");
        course.setDescription("Curso teste");

        courseRepository.create(course);

    }
}
