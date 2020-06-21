package com.jbk.controller;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Questions {
    
	String option1;
	String option2;
	String option3;
	String option4;
	String correctoption;
	String explaination;
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(String option1, String option2, String option3, String option4, String correctoption,
			String explaination, String questionText) {
		super();
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctoption = correctoption;
		this.explaination = explaination;
		QuestionText = questionText;
	}
	@Override
	public String toString() {
		return "Questions [option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4="
				+ option4 + ", correctoption=" + correctoption + ", explaination=" + explaination + ", QuestionText="
				+ QuestionText + "]";
	}
	
	
	String QuestionText;
	
	public String getQuestionText() {
		return QuestionText;
	}
	public void setQuestionText(String questionText) {
		QuestionText = questionText;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrectoption() {
		return correctoption;
	}
	public void setCorrectoption(String correctoption) {
		this.correctoption = correctoption;
	}
	public String getExplaination() {
		return explaination;
	}
	public void setExplaination(String explaination) {
		this.explaination = explaination;
	}
	
}
