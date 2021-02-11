import java.util.Scanner;

class StudentTest {
        int rollNumber;
        int mathMrk;
        int chemMrk;
        StudentTest(int rollNumber, int mathMrk, int chemMrk){
                this.rollNumber = rollNumber;
                this.mathMrk = mathMrk;
                this.chemMrk = chemMrk;
        }
        void getRollNumber(int rollNumber){this.rollNumber = rollNumber;}
        void getMarks(int mathMrk, int chemMrk){
                this.mathMrk = mathMrk;
                this.chemMrk = chemMrk;
        }

        void displayRollNumber(){
                System.out.println("Roll Number: "+rollNumber);
        }
        void displayMarks(){
                System.out.println("Math mark: "+mathMrk+"\n"+"Chemistry Mark: "+chemMrk);

        }
}
interface Sports{
        int sportWt = 90;
        void displayWt();
}
class Result extends StudentTest implements Sports{
        Result(int rollNumber,int mathMrk,int chemMrk){
                super(rollNumber, mathMrk, chemMrk);
        }
        @Override
        public void displayWt() {
                System.out.println("Sports: "+sportWt);
        }
        
        public void displayResult() {
                System.out.println("<>__RESULT__<>");
                displayRollNumber();
                displayMarks();
                displayWt();
        }

}
public class student_test {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Student Roll Number: ");
                int StuRollNum = sc.nextInt();
                System.out.println("Enter Marks in Math: ");
                int stuMathMark = sc.nextInt();
                System.out.println("Enter Marks in Chemistry: ");
                int stuChemMark = sc.nextInt();

                Result st = new Result(StuRollNum,stuMathMark,stuChemMark);
                st.displayResult();

                sc.close();
        }
}