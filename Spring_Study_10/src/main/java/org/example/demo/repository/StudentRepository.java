package org.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}