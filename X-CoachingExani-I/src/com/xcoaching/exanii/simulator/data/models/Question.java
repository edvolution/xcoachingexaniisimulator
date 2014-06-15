package com.xcoaching.exanii.simulator.data.models;

public class Question {

	private int subjectQuestionNumber;
	private String subject;
	private String questionImageFileName;
	private String questionText;
	private String[] answerChoices;
	private String answerImageFileName;
	private char correctAnswer;
	public final String IMAGE_FILE_EXTENSION = ".png";
	public final char[] AVAILABLE_ANSWERS = new char[]{'a','b','c','d'};
	public final char QUESTION_IDENTIFIER = 'q';
	public final char ANSWER_IDENTIFIER = 'a';

	public Question(int questionNumber, String subject,
			boolean isQuestionImage, boolean isQuestionText,
			boolean isAnswerImage, char correctAnswer) {
		
		this.subjectQuestionNumber = questionNumber;
		this.subject = subject;
		this.questionImageFileName = isQuestionImage ? new String(subject + subjectQuestionNumber + QUESTION_IDENTIFIER + IMAGE_FILE_EXTENSION) : null;
		this.questionText = isQuestionText ? new String(subject + subjectQuestionNumber) : null;
		this.answerChoices = !isAnswerImage ? new String[AVAILABLE_ANSWERS.length] : new String[0];
		for (int i = 0; i < answerChoices.length; i++) {
			this.answerChoices[i] = new String(subject + subjectQuestionNumber + AVAILABLE_ANSWERS[i]);
		}
		this.answerImageFileName = isAnswerImage ? new String(subject + subjectQuestionNumber + ANSWER_IDENTIFIER + IMAGE_FILE_EXTENSION) : null;
		this.correctAnswer = correctAnswer;
	}
	
	public int getSubjectQuestionNumber() {
		return subjectQuestionNumber;
	}

	public void setSubjectQuestionNumber(int subjectQuestionNumber) {
		this.subjectQuestionNumber = subjectQuestionNumber;
	}
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getQuestionImageFileName() {
		return questionImageFileName;
	}

	public void setQuestionImageFileName(String questionImageFileName) {
		this.questionImageFileName = questionImageFileName;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String[] getAnswerChoices() {
		return answerChoices;
	}

	public void setAnswerChoices(String[] answerChoices) {
		this.answerChoices = answerChoices;
	}

	public String getAnswerImageFileName() {
		return answerImageFileName;
	}

	public void setAnswerImageFileName(String answerImageFileName) {
		this.answerImageFileName = answerImageFileName;
	}

	public char getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(char correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
}
