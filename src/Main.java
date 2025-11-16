//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountHolder jane =new AccountHolder("Jane Anderson","06/05/1998","22/4,New York");
        BankAccount janesBankAccount = new BankAccount("Jane Anderson","06/05/1998","22/4,New York","4546464","sa");
        janesBankAccount.depositCash(5000);
        janesBankAccount.withdrawCash(4000);
        janesBankAccount.withdrawCash(2000);
    }
}