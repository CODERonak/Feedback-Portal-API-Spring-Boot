package com.code.FeedbackPortalAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.FeedbackPortalAPI.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}