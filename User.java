package org.example;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Invoice UserInvoice = new Invoice("");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz potrzebną operację");
            System.out.println("1--Nowa faktura");
            System.out.println("2--Dodać artykuł do faktury");
            System.out.println("3--Wyświetlenie faktury");
            System.out.println("4--Exit");
            int UserChoice = scanner.nextInt();
            switch (UserChoice) {
                case 1:
                    System.out.println("Napisz swoje imię");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    UserInvoice = new Invoice(name);
                    break;
                case 2:
                    if (UserInvoice.CustomerName.equals("")){
                        System.out.println("Najpierw trzeba utworzyć fakturę");
                    }
                    else {
                        System.out.print("Artykuł: ");
                        scanner.nextLine();
                        String type = scanner.nextLine();
                        System.out.print("Ilość: ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Cena: ");
                        double price = scanner.nextDouble();
                        Element NewElement = new Element(type, amount, price * amount);
                        UserInvoice.AddElement(NewElement);
                    }
                    break;
                case 3:
                    System.out.println("Faktura dla "+UserInvoice.CustomerName);
                    UserInvoice.PrintInvoice();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong");

            }
        }
    }
}


