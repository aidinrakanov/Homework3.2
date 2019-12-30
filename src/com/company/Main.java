package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "aidin";
        names[1] = "alexey";
        names[2] = "geektech";

        names = Arrays.copyOf(names, names.length + 1);
        names[3] = "Pavel";

        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Доброе утро " + names[0]);
                    break;
                case 1:
                    System.out.println("Добрый день " + names[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер " + names[2]);
                    break;
                case 3:
                    System.out.println("Новый 4ый массив "+ names[3]);

            }
        }
    }
}