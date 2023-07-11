package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanlimit() {
        return this.loanLimit;
    }

    public void setLoanlimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
    
    @Override
    public void withDraw(Double amount){
        super.withDraw(amount);
        balance -= 2.0;
    }

}