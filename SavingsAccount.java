public class SavingsAccount extends Account{

    public double APY;

    public void interest(double depositAmount){
        if(depositAmount > 0){
            APY = depositAmount * 0.05;
            System.out.println("APY earned");
        }
        else{
            System.out.println("No interested paid");
        }

    }

    public static void main(String[] args) {
        SavingsAccount acct = new SavingsAccount();
        System.out.println(acct);
        acct.interest(1000);
        System.out.println(acct);
    }
}
