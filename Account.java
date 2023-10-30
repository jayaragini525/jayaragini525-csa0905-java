class Account {
    double balance;
    double interestRate;

    Account(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting balance to $0.");
            balance = 0;
        } else {
            balance = initialBalance;
        }
        interestRate = 0.03;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please provide a positive amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("$" + amount + " withdrawn. New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. A $5 penalty will be charged.");
                balance -= 5;
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please provide a positive amount.");
        }
    }
    double getBalance() {
        return balance;
    }
    void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of $" + interest + " added. New balance: $" + balance);
    }

    public static void main(String args[]) {
        Account myAccount = new Account(2000);

        myAccount.deposit(1000);
        myAccount.withdraw(550);
        myAccount.withdraw(2000); 
        myAccount.computeInterest();

        System.out.println("Current balance: $" + myAccount.getBalance());
    }
}
