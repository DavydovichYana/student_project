public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        while (true) {
            if (so == null) {
                break;
            } else {
                AnswerCityRegister cityAnswer = checkCityRegister(so);
                if (!cityAnswer.success) {
                    continue;
                }
                AnswerChildren ansChild = checkChildren(so);
                AnswerWedding wedAnswer = checkMarrige(so);
                AnswerStudent answerStudent = checkStudent(so);

                sendMail(so);
            }
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
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

/*Функция отправки оповещения о завершении проверки документа студенту*/
    static void sendMail(StudentOrder so) {

    }
}
