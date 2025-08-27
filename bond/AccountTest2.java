package bond;

public class AccountTest2 {
    public static void main(String[] args) {
        SavingsAccount2 sa0001 = new SavingsAccount2();
        sa0001.balance = 1000;
        sa0001.name = "Damien";
        sa0001.interestRate = 0.02;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sa0001.displayCustomer();
        sa0001.deposit(500);
        sa0001.displayCustomer();
        sa0001.balance += sa0001.calcInterest();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sa0001.displayCustomer();
        sa0001.withdraw(200);
        sa0001.displayCustomer();
        sa0001.withdraw(2000);
        sa0001.displayCustomer();

        System.out.println("--------------------------");

        SavingsAccount2 sa0002 = new SavingsAccount2();
        sa0002.balance = 2000;
        sa0002.name = "Bill";
        sa0002.interestRate = 0.07;
        sa0002.displayCustomer();
        sa0002.deposit(1000);
        sa0002.displayCustomer();
        sa0002.balance += sa0002.calcInterest();
        sa0002.displayCustomer();
        sa0002.withdraw(500);

        System.out.println("----------------------------");
    }
}



