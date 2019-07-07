package com.example.sprinit;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    //getAllCourses()
    //getCourse(String id)
    //updateCourse(Course t)
    //deleteCourse(String id)

    public List<Course> findByTopicId(String topicId) ;


}
