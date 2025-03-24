package ch11_access_modifier;
/*
    접근 제한다 ㅣ
        클래스 메서드 변수 등에 대한 접근 제한 권한을 제어하는데 사용되는 명령어
*/

public class BackAccessModifier {
    // 필드
    int accountNum;
    String accountHolder;
    int balance;
    int pinNumber;

    //생성자
    public BackAccessModifier() {
    }

//    public BackAccessModifier(int accountNum) {
//        this.accountNum = accountNum;
//    }
//
//    public BackAccessModifier(int accountNum, String accountHolder) {
//        this.accountNum = accountNum;
//        this.accountHolder = accountHolder;
//    }
//
//    public BackAccessModifier(int accountNum, String accountHolder, int balance) {
//        this.accountNum = accountNum;
//        this.accountHolder = accountHolder;
//        this.balance = balance;
//    }

    public BackAccessModifier(int pinNumber, int balance, String accountHolder, int accountNum) {
        this.pinNumber = pinNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
    }

    //메서드 Setter
//    public void setAccountNum(int accountNum) {
//        this.accountNum = accountNum;
//    }
//
//    public void setAccountHolder(String accountHolder) {
//        this.accountHolder = accountHolder;
//    }
//
//    public void setPinNumber(int pinNumber) {
//
//    }
//
//    public void setBalance(int balance) {
//
//    }

    //메서드 Getter
    public int getPinNumber() {
        return pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }


    //메서드
    public void deposit(int amount, int inputPin){
        if (inputPin == pinNumber){
            if (amount > 0){
                balance += amount;
                System.out.println("입금 성공! 현재 잔액 : " + balance);
            } else {
                System.out.println("불가능한 입력 금액입니다");
                return;
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다");
        }
    }

    public void withdraw(int amount, int inputPin){
        if (inputPin == pinNumber){
            int charge = balance - amount;
            if(charge >= 0) {
                //                    balance = charge;
                balance -= amount;
                System.out.println("출금 성공! 현재 잔액 : " + balance );
            } else {
                System.out.println("불가능한 출금 금액입니다.");
                return;
            }
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
    }

    public void showAccountInfo(){
//        System.out.println(accountHolder + " 님의 계좌번호는 " + accountNum + "이며, 현재 잔액은 "+ balance + "원입니다.");
        System.out.println("\n계좌 번호 : " + accountNum);
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("현재 잔액 :" + balance + "원");
    }

}
