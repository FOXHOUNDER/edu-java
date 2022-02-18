package com.unimib.labprog.repository;

import com.unimib.labprog.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    /* CRUD ops out-of-the.box from JpaRepository */
}
