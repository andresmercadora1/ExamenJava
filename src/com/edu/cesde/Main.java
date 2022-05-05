package com.edu.cesde;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        List<Accountant> accountants = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();
        List<CleaningStaff> cleaningStaffs = new ArrayList<>();
        List<Watchman> watchmens = new ArrayList<>();

        boolean flag = false;
        int opt = 0;

        while (!flag) {
            boolean flagRead = false;
            menu();
            int option = Integer.parseInt(inputData.nextLine());
            switch (option) {
                case 1:
                    optionMessage();
                    opt = Integer.parseInt(inputData.nextLine());

                    if(opt==1) {
                        Accountant accountant = new Accountant();

                        System.out.println("Input this name");
                        accountant.setName(inputData.nextLine());

                        System.out.println("Input this identification");
                        accountant.setIdentification(inputData.nextLine());

                        System.out.println("Input this age");
                        accountant.setAge(Integer.parseInt(inputData.nextLine()));

                        System.out.println("Input this leader");
                        accountant.setLeader(inputData.nextLine());

                        System.out.println("Input this parking");
                        accountant.setParking(inputData.nextLine());

                        accountants.add(accountant);
                    } else if (opt == 2) {
                        for (Accountant acc: accountants) {
                            System.out.println("Accountant " + acc.toString());
                            flagRead = true;
                        }
                        if (!flagRead) {
                            messageEmpty("accountant");
                        }
                    } else {
                        optionInvalid();
                    }
                    break;
                case 2:
                    optionMessage();
                    opt = Integer.parseInt(inputData.nextLine());

                    if(opt==1) {
                        Admin admin = new Admin();

                        System.out.println("Input this name");
                        admin.setName(inputData.nextLine());

                        System.out.println("Input this identification");
                        admin.setIdentification(inputData.nextLine());

                        System.out.println("Input this age");
                        admin.setAge(Integer.parseInt(inputData.nextLine()));

                        System.out.println("Input this leader");
                        admin.setLeader(inputData.nextLine());

                        System.out.println("Input this parking");
                        admin.setParking(inputData.nextLine());

                        admins.add(admin);
                    } else if (opt == 2) {
                        for (Admin adm: admins) {
                            System.out.println("Admin " + adm.toString());
                            flagRead = true;
                        }
                        if (!flagRead) {
                            messageEmpty("admin");
                        }
                    } else {
                        optionInvalid();
                    }
                    break;
                case 3:
                    optionMessage();
                    opt = Integer.parseInt(inputData.nextLine());

                    if(opt==1) {
                        CleaningStaff cleaningStaff = new CleaningStaff();

                        System.out.println("Input this name");
                        cleaningStaff.setName(inputData.nextLine());

                        System.out.println("Input this identification");
                        cleaningStaff.setIdentification(inputData.nextLine());

                        System.out.println("Input this age");
                        cleaningStaff.setAge(Integer.parseInt(inputData.nextLine()));

                        System.out.println("Input this dayOff");
                        cleaningStaff.setDayOff(inputData.nextLine());

                        cleaningStaffs.add(cleaningStaff);
                    } else if (opt == 2) {
                        for (CleaningStaff cle: cleaningStaffs) {
                            System.out.println("CleaningStaff " + cle.toString());
                            flagRead = true;
                        }
                        if (!flagRead) {
                            messageEmpty("cleaningStaff");
                        }
                        break;
                    } else {
                        optionInvalid();
                    }
                    break;
                case 4:
                    optionMessage();
                    opt = Integer.parseInt(inputData.nextLine());

                    if(opt==1) {
                        Watchman watchman = new Watchman();

                        System.out.println("Input this name");
                        watchman.setName(inputData.nextLine());

                        System.out.println("Input this identification");
                        watchman.setIdentification(inputData.nextLine());

                        System.out.println("Input this age");
                        watchman.setAge(Integer.parseInt(inputData.nextLine()));

                        System.out.println("Input this weapon");
                        watchman.setWeapon(inputData.nextLine());

                        System.out.println("Input this workday");
                        watchman.setWorkday(inputData.nextLine());

                        watchmens.add(watchman);
                    } else if (opt == 2) {
                        for (Watchman wat: watchmens) {
                            System.out.println("Watchman " + wat.toString());
                            flagRead = true;
                        }
                        if (!flagRead) {
                            messageEmpty("watchman");
                        }
                        break;
                    } else {
                        optionInvalid();
                    }
                    break;
                case 5:
                    flag = true;
                    break;
            }
            System.out.println();
        }

    }

    public static void menu() {
        System.out.println("==================================");
        System.out.println("============== MENU ==============");
        System.out.println("===       1=Accountant         ===");
        System.out.println("===       2=Admin              ===");
        System.out.println("===       3=CleaningStaff      ===");
        System.out.println("===       4=Watchmen           ===");
        System.out.println("===       5=salir              ===");
        System.out.println("==================================");
    }

    public static void messageEmpty(String message) {
        System.out.println("The " + message + " is empty");
    }

    public static void optionMessage() {
        System.out.println("Choose an option (1=Create, 2=Read)");
    }

    public static void optionInvalid() {
        System.out.println("invalid option");
    }

}
