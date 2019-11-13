public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount test1 = new BankAccount(1);
        BankAccount test2 = new BankAccount(2, 10.01f, false);
        BankAccount test3 = new BankAccount(3,-2.03f, true);

        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());

        test1.deposit(5.0f);
        test2.withdraw(12.0f);
        test3.deposit(100.0f);

        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());

        System.out.println((test1.getBalance() > test3.getBalance() ? test1.getBalance() : test3.getBalance()));

        test1.deposit(1000000f);

        System.out.println(String.format("Bank Account " + test1.getAccountNumber() + " has a balance of $%,.2f", test1.getBalance()));

        test3.transfer(100.0f, test2);

        System.out.println(test2.toString());
        System.out.println(test3.toString());
    }
}
