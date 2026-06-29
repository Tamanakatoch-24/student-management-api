package com.example.student_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student_management.entity.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Bonus: Search by course
    List<Student> findByCourseIgnoreCase(String course);
}