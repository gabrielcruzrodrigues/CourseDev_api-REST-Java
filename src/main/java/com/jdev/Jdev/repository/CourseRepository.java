package com.jdev.Jdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jdev.Jdev.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
