package com.telusko.quizservice.feign;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.quizservice.model.Car;
import com.telusko.quizservice.model.QuestionWrapper;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuizInterface {
	// As it is interface we will have to define methods from quiz service

	@GetMapping("question/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String categoryName, @RequestParam Integer numQuestions);

	@PostMapping("question/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds);

	@PostMapping("question/getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
	
    @GetMapping("question/getAllCars")
    public List<Car> getAllCars();
}
