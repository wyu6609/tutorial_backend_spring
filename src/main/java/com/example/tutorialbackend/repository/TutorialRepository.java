package com.example.tutorialbackend.repository;

import com.example.tutorialbackend.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);


}


//    Now we can use JpaRepository’s methods: save(), findOne(), findById(), findAll(), count(), delete(), deleteById()… without implementing these methods.
//
//        We also define custom finder methods:
//        – findByPublished(): returns all Tutorials with published having value as input published.
//        – findByTitleContaining(): returns all Tutorials which title contains input title.
//
//        The implementation is plugged in by Spring Data JPA automatically.