//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountHolder jane =new AccountHolder("Jane Anderson","06/05/1998","22/4,New York");
        BankAccount janesBankAccount = new BankAccount("Jane Anderson","06/05/1998","22/4,New York","4546464","sa");
        BankAccount janesBankAccount2 = new BankAccount("Jane Anderson","06/05/1998","22/4,New York","4546465","FD");


        janesBankAccount.depositCash(1400);
        janesBankAccount.withdrawCash(400);
        janesBankAccount2.depositCash(1000);

        System.out.println(janesBankAccount.getBalance());
        System.out.println(janesBankAccount.getTotalValueAfterForAPeriod(7));

        System.out.println(janesBankAccount2.getTotalValueAfterForAPeriod(4));
    }
}