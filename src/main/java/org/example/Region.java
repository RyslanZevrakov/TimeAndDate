package org.example;

import java.util.Scanner;

public class Region {
    DataInput dataInput= new DataInput();
    void region()
            throws java.io.IOException {
        System.out.println("выбериет регион");
        System.out.println(" 1. Центральный федеральный округ");
        System.out.println(" 2. Северо-Западный федеральный округ");
        System.out.println(" 3. Южный федеральный округ");
        System.out.println("4. Приволжский федеральный округ");
        System.out.println("5 Уральский федеральный округ");
        System.out.print("Bыберете вариант: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                dataInput.dataInputCFD();
                break;
            case 2:
                dataInput.NorthwesternFD();
                break;
            case 3:
                dataInput.SouthernFD();
                break;
            case 4:
                dataInput.VolgaFD();
                break;
            case 5:
                dataInput.UralFD();
                break;

        }
    }
}
