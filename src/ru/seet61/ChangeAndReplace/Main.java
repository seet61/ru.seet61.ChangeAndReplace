package ru.seet61.ChangeAndReplace;

import java.io.Console;

/**
 * Данный класс будет решать сразу две задачи:
 * При запуске будет предлагаться ывбор что из этого будем делать.
 * 3. Напишите метод, который будет увеличивать заданный элемент массива на 10%.
 * 4. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
 * Created by dmitry.arefyev on 27.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Переменные
        String string;
        int answer;

        //Подключаемся к консоли.
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        System.out.println("Добро пожаловать!");
        System.out.println("Доступны два варианта работы:");
        System.out.println("1 - работа с элементами массива, 2 - замена всех вхождений в троку");

        while (true) {
            string = c.readLine("Выберете, пожалуйста, выриант: ");
            if (string.length() == 1) {
                answer = Integer.valueOf(string);
                switch (answer) {
                    case 1: workWithArray(c);
                            break;
                    case 2: workWithString(c);
                            break;
                    default:
                            System.out.println("неверный параметр");
                            break;

                }
            }
        }
    }

    private static void workWithString(Console c) {
    }

    private static void workWithArray(Console c) {
    }


}
