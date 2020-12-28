
public class ObjectOriented{
    public static void main(String[] args) {
        Account acc = new Account(20,100);
        
        // Deposit balance
        acc.account_balance += 100;
        acc.showData(acc.account_number, acc.account_balance);

        // Withdraw balance
        acc.account_balance -= 50;
        acc.showData(acc.account_number, acc.account_balance);
    }
}