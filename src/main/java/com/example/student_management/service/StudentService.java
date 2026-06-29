package com.example.student_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.entity.Student;
import com.example.student_management.exception.ResourceNotFoundException;
import com.example.student_management.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existing = getStudentById(id);
        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());
        existing.setCourse(updatedStudent.getCourse());
        existing.setAge(updatedStudent.getAge());
        return studentRepository.save(existing);
    }

    public void deleteStudent(Long id) {
        getStudentById(id);
        studentRepository.deleteById(id);
    }

    public List<Student> searchByCourse(String course) {
        return studentRepository.findByCourseIgnoreCase(course);
    }
}