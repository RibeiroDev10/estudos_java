package entities;

public class SavingsAccountPlus extends SavingsAccount{
    
    @Override
    public void withDraw(Double amount){
        balance -= amount + 2.0;
    }
}
