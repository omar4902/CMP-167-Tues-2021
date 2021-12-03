public class CheckingAccount extends Account {

    private double interest = 0.075;
    private int wCounter = 1;
    private int limit = 4;


    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount();
        System.out.println(acct);
        acct.deposit(400.99);
        System.out.println(acct);

        System.out.println();
        acct.withdraw(2500);
        acct.withdraw(250.00);
        acct.withdraw(50);
        acct.withdraw(100);
    }

    @Override
    public void withdraw(double amount){
        if(wCounter < 4){
            super.withdraw(amount);
            ++wCounter;
        }
        else{
            double interestCharge = amount * interest;
            System.out.println("Interest :" + interestCharge);
            amount = amount + interestCharge;
            super.withdraw(amount);
            wCounter = 1;
        }
    }
    @Override
    public String toString(){
        return "Type: Checking, " + super.toString() + ",Interest %" + interest * 100;
    }
}
