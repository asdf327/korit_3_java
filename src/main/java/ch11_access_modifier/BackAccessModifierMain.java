package ch11_access_modifier;

import java.util.Scanner;

public class BackAccessModifierMain {
    public static void main(String[] args) {
        BackAccessModifier backAccess1 = new BackAccessModifier(1234, 100000,"홍길동",123456789);
        BackAccessModifier backAccess2 = new BackAccessModifier(3001, 500000,"신사임당",987654321);

        backAccess1.showAccountInfo();
        backAccess2.showAccountInfo();

        backAccess1.deposit(50000, 1234);
        backAccess1.withdraw(200000, 1234);
        backAccess1.withdraw(100000, 1234);
        System.out.println();

        backAccess2.withdraw(100000, 3001);
        backAccess2.deposit(200000,3001);;

        backAccess1.showAccountInfo();
        backAccess2.showAccountInfo();
    }
}
