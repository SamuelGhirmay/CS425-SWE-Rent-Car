package edu.miu.cs425swerentcar.controller;

import edu.miu.cs425swerentcar.dto.FeedbackRequest;
import edu.miu.cs425swerentcar.entity.Feedback;
import edu.miu.cs425swerentcar.repository.FeedbackRepository;
import edu.miu.cs425swerentcar.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/car-rental/v1/api/feedback"})
public class FeedBackController {

    @Autowired
    FeedbackService feedBackService;
    @Autowired
    private FeedbackRepository feedBackRepository;

    @PostMapping(value = {"/create"})
    public Feedback createNewFeedbacks(@RequestBody FeedbackRequest newFeedBackRequest){
        return feedBackService.createFeedback(newFeedBackRequest);

    }

    @GetMapping(value = "/list")
    public List<Feedback> getAllFeedbacks(){
        return feedBackRepository.findAll();
    }
//    @GetMapping("/list-by-id/{customerId}")
//    public List<Feedback> getListOfFeedbackByCustomerId(@Valid @PathVariable Long customerId) throws NoSuchFieldException, IllegalAccessException {
//        return feedBackService.getFeedbackByCustomerId(customerId);
//    }


}

