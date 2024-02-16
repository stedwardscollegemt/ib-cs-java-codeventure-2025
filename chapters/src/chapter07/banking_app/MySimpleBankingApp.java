package chapter07.banking_app;

import java.io.*;
import java.util.Scanner;

/**
 * This was a Code Anything Thursdays by Joe.
 * He adapated the Year 12 assignment from last year.
 */
public class MySimpleBankingApp implements Serializable {

    //Initializing string array for contact list
    public static String[][] contactsInfo = new String[150][4];
    
    final static String ACCOUNT_NAME = "npc";

    //Initializing array for the values of the user's bank account: index 0: Card Number; index 1: security code; index 2: total amount of deposit.
    static String[] accountValues = {"123456789012", "123", "0"};

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner input = new Scanner(System.in);

        //creating variable for user inputs
        int ans;
        String input_transfer_amount;
        String input_name;
        String input_account_number;
        String input_sort_code;

        //load from text file MySimpleTransactions.txt
        try {
            ContactsData LoadFile = ContactsData.read();
            MySimpleBankingApp.contactsInfo = LoadFile.ContactsInfo;
            MySimpleBankingApp.accountValues = LoadFile.AccountValues;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // displays an option menu
        //  Please choose an action from below to perform
        //  1, Display Account Information
        //  2, Add Money
        //  3, Send Money
        //  4, Quit
        MySimpleBankingApp.displayActionMenu();

        //asks the user to perform an action between option 1 to 4
        do {
            System.out.println("Please choose the options showing on the screen: (Enter number 1 to 4) ");
            ans = input.nextInt();
        } while (ans < 1 || ans > 4);

        switch (ans) {
            case 1: {
                MySimpleBankingApp.displayAccountInformation();
                break;
            }

            case 2: {
                System.out.println("Please enter the amount of deposit you would like to add to your account: ");
                ans = input.nextInt();
                MySimpleBankingApp.addMoney(ans);
                //performs save action due to change in deposit
                ContactsData contactsData = new ContactsData();
                contactsData.ContactsInfo = MySimpleBankingApp.contactsInfo;
                contactsData.AccountValues = MySimpleBankingApp.accountValues;
                contactsData.save();
                break;
            }

            case 3: {
                System.out.println("Please enter the amount of money you'd like to transfer");
                input_transfer_amount = input.next();
                int output_amount = Integer.parseInt(input_transfer_amount);
                if (output_amount > Integer.parseInt(MySimpleBankingApp.accountValues[1])) {
                    System.out.println("!!!You are not allowed to perform this action due to there isn't enough money left in your account!!!");
                } else {
                    System.out.println("Please enter the name of the account owner you'd like to transfer to: ");
                    input_name = input.next();
                    System.out.println("Please enter his/her account number (12 digits): ");
                    input_account_number = input.next();
                    System.out.println("Please enter his/her sort code (6 digits): ");
                    input_sort_code = input.next();
                    //Find the next empty row and fill in the bank transfer contact info
                    for (int i = 0; i < MySimpleBankingApp.contactsInfo.length; i++) {
                        if (MySimpleBankingApp.contactsInfo[i] == null) {
                            MySimpleBankingApp.sendMoney(output_amount);
                            MySimpleBankingApp.contactsInfo[i][0] = input_name;
                            MySimpleBankingApp.contactsInfo[i][1] = input_account_number;
                            MySimpleBankingApp.contactsInfo[i][2] = input_sort_code;
                            MySimpleBankingApp.contactsInfo[i][3] = input_transfer_amount;
                            System.out.println(MySimpleBankingApp.contactsInfo[i][1]);
                            break;
                        }
                    }
                }
                //save contacts info into text file MySimpleTransactions.txt
                ContactsData contactsData = new ContactsData();
                contactsData.ContactsInfo = MySimpleBankingApp.contactsInfo;
                contactsData.AccountValues = MySimpleBankingApp.accountValues;
                contactsData.save();
                break;
            }

            case 4: {
                input.close();
                MySimpleBankingApp.quit();
                break;
            }
        }
    }

    public static void displayActionMenu() {
        System.out.println("    Please choose an action from below to perform");
        System.out.println("    1, Display Account Information");
        System.out.println("    2, Add Money");
        System.out.println("    3, Send Money");
        System.out.println("    4, Quit");
    }

    public static void displayAccountInformation() {
        System.out.println("Name: " + ACCOUNT_NAME + ";");
        System.out.println("Card Number: " + accountValues[0] + "; " + "Total Amount: " + accountValues[2]);
    }

    public static void addMoney(int input_deposit) {
        accountValues[2] = Integer.toString(Integer.parseInt(accountValues[2]) + input_deposit);
    }

    public static void sendMoney(int transfer_amount) {
        accountValues[2] = Integer.toString(Integer.parseInt(accountValues[2]) - transfer_amount);
    }

    public static void quit() {
        System.exit(0);
    }


    // create a class that includes methods for save file and load file
    static class ContactsData implements Serializable {

        //  Declaring String type arrays for save and load purposes.
        public String[][] ContactsInfo;
        public String[] AccountValues;

        public void save() throws IOException {
            FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/zhy20/Downloads/YOU ARE STILL ALIVE IF YOU SEE THIS/src/BankApp/MySimpleTransactions.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            fileOutputStream.close();
        }

        public static ContactsData read() throws IOException, ClassNotFoundException {
            FileInputStream fileInputStream = new FileInputStream("C:/Users/zhy20/Downloads/YOU ARE STILL ALIVE IF YOU SEE THIS/src/BankApp/MySimpleTransactions.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ContactsData contactsData = (ContactsData) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return contactsData;
        }
    }
}
