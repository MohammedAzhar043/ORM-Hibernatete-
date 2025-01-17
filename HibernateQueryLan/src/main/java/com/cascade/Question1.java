package com.cascade;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question1 {

	@Id
	private int questionId;
	private String questionDetails;
	@OneToMany(mappedBy = "question",cascade = CascadeType.ALL)//,fetch = FetchType.EAGER)
	private List<Answer1> answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionDetails() {
		return questionDetails;
	}

	public void setQuestionDetails(String questionDetails) {
		this.questionDetails = questionDetails;
	}

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}

	public Question1(int questionId, String questionDetails, List<Answer1> answer) {
		super();
		this.questionId = questionId;
		this.questionDetails = questionDetails;
		this.answer = answer;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question1 [questionId=" + questionId + ", questionDetails=" + questionDetails + ", answer=" + answer
				+ "]";
	}

}
