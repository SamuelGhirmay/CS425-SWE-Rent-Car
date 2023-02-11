package edu.miu.cs425swerentcar.service.impl;

import edu.miu.cs425swerentcar.dto.FeedbackRequest;
import edu.miu.cs425swerentcar.entity.Customer;
import edu.miu.cs425swerentcar.entity.Feedback;
import edu.miu.cs425swerentcar.repository.CustomerRepository;
import edu.miu.cs425swerentcar.repository.FeedbackRepository;
import edu.miu.cs425swerentcar.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.Optional;

@Service
public class FeedBackServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackRepository feedBackRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Feedback createFeedback(FeedbackRequest newFeedbackRequest){
        Optional<Customer> customer = this.customerRepository.findById(newFeedbackRequest.getCustomerId());
        Feedback feedbackRequest= new Feedback(null, newFeedbackRequest.getRating(),newFeedbackRequest.getComment(),
                customer.get());
        return feedBackRepository.save(feedbackRequest);
    }

    @Override
    public List<Feedback> getAllFeedBack() {
        return feedBackRepository.findAll();
    }

    @Override
    public List<Feedback> getFeedbackByCustomerId(Long customerId) {
    return null;
    }
}
