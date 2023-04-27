package com.learntocode;

import java.util.Scanner;

public class NeighborhoodLibraryInventory {
    public static void main(String[] args) {
        Book[] inventory = new Book[5];
        inventory[0] = new Book(1, "12648", "Chainsaw Man");
        inventory[1] = new Book(2, "22648", "Konosuba");
        inventory[2] = new Book(3, "32648", "Look Back");
        inventory[3] = new Book(4, "42648", "Attack on Titan");
        inventory[4] = new Book(5, "52648", "The Promised Neverland");

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Store Home Screen");
            System.out.println("---------------------");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.println("Enter your choice (1-3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available Books");
                    System.out.println("-------------------");
                    for (Book book : inventory) {
                        if (!book.isCheckedOut()) {
                            System.out.println("Id: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
                        }
                    }
                    System.out.println("------------");
                    System.out.println("Enter the Id of the book you want to check out or press 0 to exit: ");
                    int bookId = scanner.nextInt();

                    if (bookId == 0) {
                        return;

                    }

                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();

                    Book selectedBook = inventory[bookId - 1];

                    selectedBook.checkOut(name);
                    System.out.println("Thank you, " + name + " You have successfully checked out this book!");


                case 2:

                case 3:
                    return;

                default:


            }
        }

    }
}