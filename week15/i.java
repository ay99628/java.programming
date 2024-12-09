package p1;
import java.util.Date;
public class i {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    public i(){
        this(2.5,1,1000);
    }
    public i(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }
        public int getNumberOfYears(){
        return numberOfYears;
        }
        public void setNumberOfYears(int numberOfYears) {
                this.numberOfYears = numberOfYears;
            }
            public void setLoanAmount(double loanAmount) {
                    this.loanAmount = loanAmount;
                }
                public double getMonthlyPayment() {
                        double monthlyInterestRate = annualInterestRate / (12 * 100);
                        double f = (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
                        double monthlyPayment = loanAmount * monthlyInterestRate / f;
                        return monthlyPayment;
                    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
        public Date getLoanDate() {
            return loanDate;
        }

}
