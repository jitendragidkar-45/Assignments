package in.xenosis.IntermediateAssignment;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(1500.0);
        bankAccount.display();
        bankAccount.withdraw(1000.0);
        bankAccount.display();
    }
}
