
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asshuu
 */
class bank_system {

    String user_name, acc_type, acc_no;
    double balance;
//ArrayList<bank_sytem> al =new ArrayList<bank_system>();
    bank_system(String name, String acc_type, String acc_no, double balance) {
        this.user_name = name;
        this.acc_type = acc_type;
        this.balance = balance;
        this.acc_no = acc_type;
    }

    void infoAboutProduct(int n) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        switch (n) {

            case 1: {
                checkBalance();
                break;
            }
            case 2: {
                double amount = 0.0;
                System.out.println("enter the amount u want to deposited");
                amount = Double.parseDouble(br.readLine());
                depositMoney(amount);
                break;
            }
            case 3: {
                double amount;
                System.out.println("enter the amount u want to withDrawl");
                amount = Double.parseDouble(br.readLine());
                withDrawl(amount);
                break;
            }
            case 5: {
                System.out.println("thanks for visiting ");
                break;
            }
            case 6:
            {
                
            }
            case 4: {
                viewDetails();

            }

        }
    }

    void checkBalance() {
        if (balance < 500) {
            System.out.println("your account balance is low " + balance + "please credit ur account");
        }
        System.out.println("your account balance is " + balance);
    }

    void depositMoney(double money) {
        balance = balance + money;
        System.out.println("ur current balance is  " + balance);

    }

    void withDrawl(double ammo) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        if (balance - ammo < 5000) {
            System.out.println("invalid ammount u enter u account balance get low form limit plz enter again");
            double ammount = Double.parseDouble(br.readLine());
            withDrawl(ammount);
        } else {
            balance = balance-ammo;
            System.out.println("your acount balance left is " + (balance));
        }

    }

    boolean isValid(int a) {
        return (a < 5) && (a > 0);
    }

    void viewDetails() {
        System.out.println("user name is " + user_name);
        System.out.println("user account number  is " + acc_no);
        System.out.println("user account type is " + acc_type);

    }

    void showMenu() {
        System.out.println("Enter the following ------------");
        System.out.println("1------> check Balance");
        System.out.println("2------> Deposit money");
        System.out.println("3------> withdrawl money");
        System.out.println("4------> for account details");
        System.out.println("5------> new account ");
        System.out.println("6------>Exit ");

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String u_name, acc_type, acc_no;
        double balance = 0.0;
        System.out.println("enter the user_name");
        u_name = br.readLine();
        System.out.println("enter the account type");
        acc_type = br.readLine();
        System.out.println("enter the account number");
        acc_no = br.readLine();
        System.out.println("enter the balance");
        balance = Double.parseDouble(br.readLine());
        bank_system v1 = new bank_system(u_name, acc_type, acc_no, balance);

        for (;;) {

            v1.showMenu();
            System.out.println("enter the value");
            int val = Integer.parseInt(br.readLine());
            if (v1.isValid(val)) {
                v1.infoAboutProduct(val);
            } else if(val==5) {
                
                if (val != 5) {
                    System.out.println("you entered invalid value");
                }
                break;
            }

        }
    }

}
