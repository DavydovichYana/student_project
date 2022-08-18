public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerChildren ansChild = checkChildren(so) ;
        AnswerWedding wedAnswer = checkMarrige(so);
        AnswerStudent answerStudent = checkStudent(so);

        sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return new StudentOrder();
    }
    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("City Register is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkMarrige(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children checking is running");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student checking is running");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so) {

    }
}
