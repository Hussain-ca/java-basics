public class BankAccount {
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        if(balance>0){
            this.balance=balance;
        }
        else {
            this.balance=0;
        }
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }

    }
    void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
        }
        else { System.out.println("Enter a valid amount");}
    }
    double getBalance(){
        return balance;
    }
    String getAccountHolder(){
        return accountHolder;
    }

}
