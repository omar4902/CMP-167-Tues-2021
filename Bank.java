import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    public int code;
    public String address;
    private String name;
   // private ArrayList<CheckingAccount> checkingAccountList = new ArrayList<CheckingAccount>();
    private HashMap<String, CheckingAccount> accountsWithOwner = new HashMap<String, CheckingAccount>();
    public Bank (String name, String address){
    this.address = address;
    this.name = name;
        System.out.println("Bank has been created");
    }
    public void openCheckingAcct(String owner){
        CheckingAccount acct = new CheckingAccount();
        accountsWithOwner.put(owner, acct);
        // checkingAccountList.add(acct); //how to add array list
        System.out.println("Account # " + acct.number + " has been created");
    }
    public void displayAllAccts(){
        for(Map.Entry<String, CheckingAccount> entry : accountsWithOwner.entrySet()){ //how to loop through
            System.out.println("Owner ;" + entry.getKey() + " Account " + entry.getValue().toString());
        }
        }

        public void findAccountInfo(String owner){
            if(accountsWithOwner.containsKey(owner)){
                System.out.println(accountsWithOwner.get(owner));
            }
            else{
                System.out.println("Account info not found");
            }
        }
        public void depositMoney(String owner, double amount){
            if(accountsWithOwner.containsKey(owner)){
                accountsWithOwner.get(owner).deposit(amount);
            }
            else{
                System.out.println("User not found");
            }
        }
        public void withdrawMoney(String owner, double amount){
        if(accountsWithOwner.containsKey(owner)){
            accountsWithOwner.get(owner).withdraw(amount);
        }
        else{
            System.out.println("User not found");
            }
        }
        @Override
        public String toString(){
            return "Bank " + name + " address " + address + " number of clients " + accountsWithOwner.size();
    }
}
