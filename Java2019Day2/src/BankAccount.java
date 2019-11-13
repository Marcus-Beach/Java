public class BankAccount {
    private int accountNumber;
    private float balance;
    private boolean overdrawn;

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public boolean isOverdrawn() {
        return overdrawn;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setOverdrawn(boolean overdrawn) {
        this.overdrawn = overdrawn;
    }

    public BankAccount(int accountNumber, float balance, boolean overdrawn) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdrawn = overdrawn;
    }

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0f;
        this.overdrawn = false;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nOverdrawn: " + overdrawn;
    }

    public boolean deposit(float amount){
        try {
            this.balance += amount;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
        if (this.balance > 0f){
            this.overdrawn = false;
        }
        else {
            this.overdrawn = true;
        }
        return true;
    }

    public boolean withdraw(float amount){
        try {
            this.balance -= amount;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
        if (this.balance < 0f){
            this.overdrawn = true;
        }
        else {
            this.overdrawn = false;
        }
        return true;
    }

    public boolean transfer(float amount, BankAccount toAccount){
        try {
            this.balance -= amount;
            toAccount.deposit(amount);
            if(toAccount.getBalance() < 0f){
                toAccount.setOverdrawn(true);
            }else {
                toAccount.setOverdrawn(false);
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
        if (this.balance < 0f){
            this.overdrawn = true;
        }
        else {
            this.overdrawn = false;
        }
        return true;
    }
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
