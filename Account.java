class Account {
    int account_number = 0;
    int account_balance = 0;

    public Account(int number, int balance){
        this.account_number=number;
        this.account_balance=balance;
    }

    void showData(int acc_num, int acc_bal){
        System.out.println("Account Number: "+acc_num);
        System.out.println("Account Balance: "+acc_bal);
    }
}
