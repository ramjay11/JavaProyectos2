package com.ramjava.student.service.application.repo;

import com.ramjava.student.service.application.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
