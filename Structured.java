public class Structured{

    static void showData(int acc_num, int acc_bal){
        System.out.println("Account Number: "+acc_num);
        System.out.println("Account Balance: "+acc_bal);
    }
    public static void main(String[] args) {
        int account_number = 20;
        int account_balance = 100;
        
        // Deposit balance
        account_balance += 100;
        showData(account_number, account_balance);

        // Withdraw balance
        account_balance -= 50;
        showData(account_number, account_balance);
    }
}