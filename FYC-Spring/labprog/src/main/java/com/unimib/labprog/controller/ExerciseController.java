package com.unimib.labprog.controller;

import com.unimib.labprog.model.Exercise;
import com.unimib.labprog.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("/database/exercises")
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }

    /**
     * by adding {} in the path and @PathVariable in the method, I'm specifying a variable url
     */
    @GetMapping("/database/exercises/{id}")
    public Optional<Exercise> getExercise(@PathVariable Long id) {
        return exerciseService.getExercise(id);
    }

    @PostMapping("database/exercises")
    public void addExercise(@RequestBody Exercise exercise) {
        exerciseService.addExercise(exercise);
    }
}
