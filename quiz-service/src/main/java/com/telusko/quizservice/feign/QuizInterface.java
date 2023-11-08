package com.telusko.quizservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.telusko.quizservice.model.QuestionWrapper;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuizInterface {
	  @PostMapping("question/getQuestions")
	    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);
}
