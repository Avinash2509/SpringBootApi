package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiApi")
public class QuestionController {

	public Questions getQuestion() {
		Questions question=new Questions();
		question.setQuestionText("is uing spring boot");
		question.setOption1("yes");
		question.setOption2("no");
		question.setCorrectoption("yes");
		question.setExplaination("njoy");
		return question;
	}
}
