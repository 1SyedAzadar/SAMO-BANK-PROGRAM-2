public class SAMO_Bank_Management_system {
    public static void main(String[] args){

        BankAccounts acc1 = new BankAccounts(3456,"Azadar Hussain",1234,10000 );
        acc1.deposit(3000);
        acc1.withdraw(4000);
        BankAccounts acc2 = new BankAccounts(3457,"Hanan Umrani",4567,30000);
        acc2.deposit(7000);
        acc2.withdraw(5000);
        BankAccounts acc3 = new BankAccounts(3458,"Adil Soomro",8910,5000);
        acc3.deposit(3000);
        acc3.withdraw(4000);
        BankAccounts acc4 = new BankAccounts(3459,"Saif Ali Samo",1112,100000000);
        acc4.deposit(300);
        acc4.withdraw(400);

        BankAccounts[] accounts ={acc1,acc2,acc3,acc4};
        for (BankAccounts a : accounts){
            a.displayInfo();
        }

        SavingsAccount acc5 = new SavingsAccount(3410,"Hamza dp",1113,7000,5.0);
        acc5.withdraw(1000);
        acc5.deposit(5000);
        acc5.addInterest();
        acc5.displayInfo();


    }
}