package abstraction;

public class Class5 {
    public static void main(String[] args) {
        BankApp app = new BankApp();
        app.showBalance();
        app.updatePassword();
    }
}

class Bank {
    private String accountHolder = "Arun";
    private long balance = 25000;
    private String password = "arun123";

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}

class BankApp extends Bank {
    void showBalance() {
        System.out.println("Balance: " + getBalance());
    }

    void updatePassword() {
        System.out.println("Old Password: " + getPassword());
        setPassword("newpass456");
        System.out.println("Updated Password: " + getPassword());
    }

    void updateHolderName() {
        setAccountHolder("ARUN KUMAR");
        System.out.println("Updated Holder Name: " + getAccountHolder());
    }
}
