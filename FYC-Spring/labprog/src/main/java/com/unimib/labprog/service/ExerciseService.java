package com.unimib.labprog.service;

import com.unimib.labprog.model.Exercise;
import com.unimib.labprog.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> getAllExercises() {
        List<Exercise> recordset = new ArrayList<>();
        exerciseRepository.findAll()
                .forEach(recordset::add);
        return recordset;
    }

    public Optional<Exercise> getExercise(Long id) {
        return exerciseRepository.findById(id);
    }

    public void addExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
    }


    public void updateExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
    }

    public void deleteExercise(Long id) {
        exerciseRepository.deleteById(id);
    }
}
