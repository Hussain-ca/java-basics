public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account1=new BankAccount("Ali", 1000);
        System.out.println(account1.getBalance());
        account1.deposit(500);
        System.out.println(account1.getBalance());
        account1.withdraw(200);
        System.out.println(account1.getBalance());
        account1.withdraw(2000);
        System.out.println(account1.getBalance());

        BankAccount account2=new BankAccount("Sara", -500);
        System.out.println(account2.getBalance());
    }
}






