import java.util.Scanner;

abstract class Loan{
        double loanAmount;
        double interestRate;  
        double noOfYears;

        Loan(double loanAmount, double interestRate, double noOfYears){
                this.loanAmount = loanAmount;
                this.interestRate = interestRate;
                this.noOfYears = noOfYears;
        }

        abstract double calculateInterest();
}

class EducationLoan extends Loan{

        EducationLoan(double loanAmount, double interestRate, double noOfYears){
                super(loanAmount,interestRate,noOfYears);
        }

        @Override
        double calculateInterest() {
                return loanAmount*(interestRate/100)*noOfYears;

        }
        
}
class HomeLoan extends Loan{
        HomeLoan(double loanAmount, double interestRate, double noOfYears){
                super(loanAmount,interestRate,noOfYears);
        }
        @Override
        double calculateInterest() {
                return(loanAmount*Math.pow((1+(interestRate/100)),noOfYears));

        }
}

public class loan1 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter LoanAmount: ");
                int loanAmount = sc.nextInt();
                System.out.println("Enter rate of interest: ");
                int rateOfIn = sc.nextInt();
                System.out.println("Enter time in year:  ");
                int time = sc.nextInt();

                EducationLoan el = new EducationLoan(loanAmount,rateOfIn,time);
                System.out.println("Simple Interest: "+el.calculateInterest()+" Rs");

                HomeLoan hl = new HomeLoan(loanAmount,rateOfIn,time);
                System.out.println("Compound Interest: "+hl.calculateInterest()+" Rs");

                sc.close();
        } 
}