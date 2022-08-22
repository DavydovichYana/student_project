package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.wedding.AnswerWedding;

public class WeddingValidator {
    public AnswerWedding checkMarrige(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
