package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.FeedbackRequest;
import edu.miu.cs425swerentcar.entity.Feedback;

import java.util.List;

public interface FeedbackService {
    public Feedback createFeedback(FeedbackRequest newFeedbackRequest);
    public List<Feedback> getAllFeedbacks();

    public List<Feedback> getFeedbackByCustomerId(Long customerId) throws NoSuchFieldException, IllegalAccessException;

}
