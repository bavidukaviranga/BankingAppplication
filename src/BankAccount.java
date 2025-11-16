public class BankAccount {
    public String name;
    public String birthday;
    public String address;
    public String accountNumber;
    public String accountType;
    public int balance;
    public BankAccount(String name,String birthday ,String address ,String accountNumber ,String accountType){
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = -0;

    }
    public void depositCash(int amount){
        this.balance+=amount;
        System.out.println("Deposit is Successful . Your balance is : "+getBalance());

    }
    public void withdrawCash(int amount){
        if (this.balance>=amount){
            this.balance-= amount;
            System.out.println("withdrawal is successful . Your balance is : "+getBalance());

        }else {
            System.out.println("No sufficient balance .Your balance is : "+getBalance());
        }

    }

    public int getBalance() {
        return this.balance;
    }
}
