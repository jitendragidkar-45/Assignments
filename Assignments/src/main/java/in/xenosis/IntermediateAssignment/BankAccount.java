package in.xenosis.IntermediateAssignment;

public class BankAccount {
    double totalBalance=500.0;

    public double deposit(Double deposit){
        totalBalance+=deposit;
        System.out.println("Deposited Rs : "+deposit);
        return deposit;
    }

    public double withdraw(Double withdrawl){
        totalBalance-=withdrawl;
        System.out.println("Withdrawl Rs : "+withdrawl);
        return withdrawl;
    }
    public void display(){
        System.out.println("Total Account Balance is : "+totalBalance);
    }


}
