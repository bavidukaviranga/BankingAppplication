import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    public AccountHolder accountHolder;
    public String accountNumber;
    public String accountType;
    public int balance;
    public ArrayList<Integer> deposits =new ArrayList<>();
    public ArrayList<Integer> withdrawals =new ArrayList<>();


    public BankAccount(AccountHolder accountHolder, String accountNumber , String accountType){
        this.accountHolder= accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = -0;

    }
    public void depositCash(int amount){
        this.balance+=amount;
        this.deposits.add(amount);

        System.out.println("Deposit is Successful . Your balance is : "+getBalance());

    }
    public void withdrawCash(){
        boolean runWhile = true;
        while (runWhile){

            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter amount you want withdraw :"+getBalance());
                int amount = sc.nextInt();

                if (this.balance>=amount){
                    this.balance-= amount;
                    System.out.println("withdrawal is successful . Your balance is : "+getBalance());
                    this.withdrawals.add(amount);
                    runWhile = false;
                }else {
                    System.out.println("No sufficient balance .Your balance is : "+getBalance());

                }

            }catch (Exception e){
                System.out.println(e);
                System.out.println("Enter integer value");
            }


        }



    }

    public int getBalance() {
        return this.balance;
    }
    public double getTotalValueAfterForAPeriod(int period){
        if (this.accountType.equals("sa")){
            if (period > 0){
                double totalValue = this.balance + this.balance*0.02*period;
                return totalValue;
            }else {
                System.out.println("Wrong period");
                return this.balance;
            }
        }else if(this.accountType.equals("FD")){
            if (period<=0){
                System.out.println("Wrong period");
               return this.balance;
            }
            if (period<=2){
                double totalValue = this.balance + this.balance*0.125*period;
                return totalValue;
            } else if (period<=5) {
                double totalValue = this.balance + this.balance*0.125*period;
                return totalValue;

            }else{
                double totalValue = this.balance + this.balance*0.2*period;
                return totalValue;
            }
        }
        return this.balance;
    }
    public void getAllWithdrawals(){
        for (int i=withdrawals.size()-1; i>=0; i--){
            System.out.println(this.withdrawals.get(i));
        }
    }
}
