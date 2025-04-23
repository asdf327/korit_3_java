package ch11_access_modifier;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int pinNumber, int balance, String accountHolder, int accountNum) {
        this.pinNumber = pinNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
    }
}
