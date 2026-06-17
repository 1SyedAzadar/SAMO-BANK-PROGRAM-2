public class BankAccounts {

    private int accountNumber;
    private String holdersName;
    private int pin;
    private double balance;

    BankAccounts(int accountNumber,String holdersName,int pin,double balance){
        this.accountNumber = accountNumber;
        this.holdersName = holdersName;
        this.pin = pin;
        this.balance = balance;

    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Amount must be positive!");
        }
    }

    public void withdraw(double amount){
        if(amount < 0) {
            System.out.println("Amount must be positive!");
        }

        else if(amount > balance){
            System.out.println("Insufficient balance!");

        }
        else{
            balance = balance - amount;
            System.out.println("Withdraw" + amount);
        }
    }

    public void displayInfo(){
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Holder's Name  : " + this.holdersName);
        System.out.println("Balance        : " + this.balance);
        System.out.println();
        System.out.println();
    }
}

class CurrentAccount extends BankAccounts{

    CurrentAccount(int accountNumber,String holdersName,int pin,double balance){
            super(accountNumber, holdersName, pin, balance);
    }
}

class SavingsAccount extends BankAccounts{

    private double interestRate;

    SavingsAccount(int accountNumber,String holdersName,int pin, double balance,double interestRate){
            super(accountNumber, holdersName, pin, balance);
            this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance()*interestRate/100;
        setBalance(getBalance() + interest);
        System.out.println("Balance with Interest : " + getBalance());
    }
}

