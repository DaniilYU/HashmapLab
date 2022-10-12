package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void inn(HashMap<String, Integer> logins) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин:");
        String x = in.next();
        System.out.println("Введите пароль:");
        int y = in.nextInt();
        boolean ye = true;
        if (logins.containsKey(x) == ye) {
            if ((Integer)logins.get(x) == y) {
                if (x.equals("DanYU")) {
                    System.out.println("Добро пожаловать, Даниил");
                } else if (x.equals("SamsMaria")) {
                    System.out.println("Добро пожаловать, Мария");
                } else if (x.equals("StadnikDanil")) {
                    System.out.println("Добро пожаловать, Данил");
                } else if (x.equals("HanukNastya")) {
                    System.out.println("Добро пожаловать, Анастасия");
                }
            } else {
                System.out.println("Неверный пароль");
            }
        } else {
            System.out.println("Неверный логин");
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> logins = new HashMap();
        logins.put("DanYU", 1234);
        logins.put("SamsMaria", 1243);
        logins.put("StadnikDanil", 1324);
        logins.put("HanukNastya", 1342);
        inn(logins);
    }
}