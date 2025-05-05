package com.code.FeedbackPortalAPI.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.FeedbackPortalAPI.entity.Feedback;
import com.code.FeedbackPortalAPI.service.FeedbackService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/feedback")
@RequiredArgsConstructor
public class FeedbackController {

    private final FeedbackService feedbackService;

    @PostMapping("/add")
    public ResponseEntity<String> addFeedback(@RequestBody Feedback feedback) {
        feedbackService.addFeedback(feedback);
        return ResponseEntity.status(HttpStatus.CREATED).body("Feedback created");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Feedback>> getAllFeedbacks() {
        return ResponseEntity.ok(feedbackService.getAllFeedbacks());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateFeedback(@PathVariable int id, @RequestBody Feedback feedback) {
        feedbackService.updateFeedback(id, feedback);
        return ResponseEntity.status(HttpStatus.OK).body("Feedback updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFeedback(@PathVariable int id) {
        feedbackService.deleteFeedback(id);
        return ResponseEntity.status(HttpStatus.OK).body("Feedback deleted");
    }

}