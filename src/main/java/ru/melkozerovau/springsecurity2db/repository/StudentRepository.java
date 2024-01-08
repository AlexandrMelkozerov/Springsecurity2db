package ru.melkozerovau.springsecurity2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.melkozerovau.springsecurity2db.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
