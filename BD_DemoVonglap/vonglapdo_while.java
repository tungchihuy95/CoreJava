package BD_DemoVonglapWhile;

import java.util.Scanner;

public class vonglapdo_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do {
            password = sc.nextLine();
        } while (!password.equals("vung oi mo ra"));
    }
}
