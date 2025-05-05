package com.code.FeedbackPortalAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code.FeedbackPortalAPI.entity.Feedback;
import com.code.FeedbackPortalAPI.repository.FeedbackRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;

    // creating the feedback
    public Feedback addFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    // getting all the feedback
    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    // getting feedback by id
    public Feedback updateFeedback(int id, Feedback feedback) {
        feedback.setId(id);
        return feedbackRepository.save(feedback);
    }

    // deleting feedback by id
    public void deleteFeedback(int id) {
        feedbackRepository.deleteById(id);
    }

}