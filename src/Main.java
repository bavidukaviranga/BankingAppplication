//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AccountHolder jane =new AccountHolder("Jane Anderson","06/05/1998","22/4,New York");
        AccountHolder mary =new AccountHolder("mary Anderson","20/05/2000","225/4,New York");

        BankAccount janesBankAccount = new BankAccount(jane,"4546464","sa");
        BankAccount marysBankAccount = new BankAccount(mary,"4546465","FD");

        System.out.println(marysBankAccount.accountHolder.name);
        janesBankAccount.depositCash(1400);
        janesBankAccount.withdrawCash();
        janesBankAccount.withdrawCash();
        janesBankAccount.withdrawCash();
        janesBankAccount.getAllWithdrawals();

        marysBankAccount.depositCash(1000);

        System.out.println(janesBankAccount.getBalance());



        System.out.println(janesBankAccount.getTotalValueAfterForAPeriod(7));

        System.out.println(marysBankAccount.getTotalValueAfterForAPeriod(4));
    }
}