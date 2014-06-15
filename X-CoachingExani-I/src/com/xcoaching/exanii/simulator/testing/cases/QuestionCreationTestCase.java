package com.xcoaching.exanii.simulator.testing.cases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.xcoaching.exanii.simulator.data.models.Question;

public class QuestionCreationTestCase {

	@Test
	public void testQuestionConstructor() {
		
		Question parsedQuestion = new Question(1, "hv", true, true, false, 'd');
		assertEquals("hv" + parsedQuestion.getSubjectQuestionNumber() + parsedQuestion.QUESTION_IDENTIFIER + parsedQuestion.IMAGE_FILE_EXTENSION, parsedQuestion.getQuestionImageFileName());			
		assertEquals("hv" + parsedQuestion.getSubjectQuestionNumber(), parsedQuestion.getQuestionText());				
		assertEquals(generateAnswersArray(parsedQuestion.getSubject(), parsedQuestion.getSubjectQuestionNumber(), parsedQuestion.AVAILABLE_ANSWERS), Arrays.toString(parsedQuestion.getAnswerChoices()));
		assertEquals(null, parsedQuestion.getAnswerImageFileName());
		
		parsedQuestion = new Question(1, "hm", true, true, false, 'b');
		assertEquals("hm" + parsedQuestion.getSubjectQuestionNumber() + parsedQuestion.QUESTION_IDENTIFIER + parsedQuestion.IMAGE_FILE_EXTENSION, parsedQuestion.getQuestionImageFileName());			
		assertEquals("hm" + parsedQuestion.getSubjectQuestionNumber(), parsedQuestion.getQuestionText());				
		assertEquals(generateAnswersArray(parsedQuestion.getSubject(), parsedQuestion.getSubjectQuestionNumber(), parsedQuestion.AVAILABLE_ANSWERS), Arrays.toString(parsedQuestion.getAnswerChoices()));
		assertEquals(null, parsedQuestion.getAnswerImageFileName());
		
		
		parsedQuestion = new Question(1, "hm", false, true, true, 'b');
		assertEquals(null, parsedQuestion.getQuestionImageFileName());			
		assertEquals("hm" + parsedQuestion.getSubjectQuestionNumber(), parsedQuestion.getQuestionText());				
		assertEquals("[]", Arrays.toString(parsedQuestion.getAnswerChoices()));
		assertEquals("hm" + parsedQuestion.getSubjectQuestionNumber() + parsedQuestion.ANSWER_IDENTIFIER + parsedQuestion.IMAGE_FILE_EXTENSION, parsedQuestion.getAnswerImageFileName());
	}
	
	private String generateAnswersArray(String subject, int subjectQuestionNumber, char[] availableAnswers){
		StringBuilder formattedAnswersArray = new StringBuilder("[");
		for (char c : availableAnswers) {
			formattedAnswersArray.append(new String(subject + subjectQuestionNumber + c + ", "));
		}
		formattedAnswersArray.delete(formattedAnswersArray.length() - 2, formattedAnswersArray.length());	
		return formattedAnswersArray.toString() + "]";
	}

}
