package org.example;

import java.util.Scanner;

public class Region {
    DataInput dataInput= new DataInput();
    void region()
            throws java.io.IOException {
        System.out.println("выбериет регион");
        System.out.println(" 1. Японсия");
        System.out.println(" 2. Американские марки авто");
        System.out.println(" 3. Российские марки авто");
        System.out.println("4. Немецкие марки авто");
        System.out.println("5 Корейские марки авто");
        System.out.print("Bыберете вариант: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                dataInput.dataInput();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;

        }
    }
}
