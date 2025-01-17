package com.mapping2;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer1 {

	@Id
	private int answerId;
	private String answerDetails;
	@ManyToOne(fetch = FetchType.EAGER)
	private Question1 question;

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer1(int answerId, String answerDetails, Question1 question) {
		super();
		this.answerId = answerId;
		this.answerDetails = answerDetails;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer1 [answerId=" + answerId + ", answerDetails=" + answerDetails + ", question=" + question + "]";
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswerDetails() {
		return answerDetails;
	}

	public void setAnswerDetails(String answerDetails) {
		this.answerDetails = answerDetails;
	}

	public Question1 getQuestion() {
		return question;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}

}
