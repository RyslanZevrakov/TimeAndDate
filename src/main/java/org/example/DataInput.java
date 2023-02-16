package org.example;

import java.util.Date;
import java.util.Scanner;

public class DataInput {
    Scanner scanner= new Scanner(System.in);
    Date date = new Date();
    void dataInput(){
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите фамилию");
        String surname = scanner.next();
        String pattern = "(\\S{1})\\S+";
        String str = name.replaceAll(pattern, "$1");
        String strr = surname.replaceAll(pattern, "$1");
        System.out.println("Введите сумму перевода");
        String transferAmount = scanner.next();
        System.out.println("чек");
        System.out.println(date);
        System.out.println(transferAmount);
        System.out.println(str+". " + strr+".");

    }
}
