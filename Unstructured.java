public class Unstructured{
    public static void main(String[] args) {
        int account_number = 20;
        int account_balance = 100;
        
        // Deposit balance
        account_balance += 100;
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Balance: "+account_balance);

        // Withdraw balance
        account_balance -= 50;
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Balance: "+account_balance);
    }
}