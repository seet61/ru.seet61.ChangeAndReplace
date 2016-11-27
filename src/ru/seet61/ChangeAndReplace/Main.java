package ru.seet61.ChangeAndReplace;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

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

        while (true) {
            System.out.println();
            System.out.println("Доступны два варианта работы:");
            System.out.println("1 - работа с элементами массива, 2 - замена всех вхождений в троку, 0 - выход");
            string = c.readLine("Выберете, пожалуйста, выриант: ");
            if (string.length() == 1) {
                answer = Integer.valueOf(string);
                switch (answer) {
                    case 1: workWithArray(c);
                            break;
                    case 2: workWithString(c);
                            break;
                    case 0:
                            System.out.println("До скорых встречь!");
                            System.exit(0);
                            break;
                    default:
                            System.out.println("неверный параметр");
                            break;

                }
            }
        }
    }

    private static void workWithString(Console c) {
        //Работаем со строкой
        String regex = "бяка";
        String replacement = "*вырезано цензурой*";

        System.out.println("Необходима строка содержащая один или более раз слово \"бяка\" ");
        String string = c.readLine("Введите строку: ");
        string = string.replaceAll(regex, replacement);
        System.out.println("Результат: " + string);
    }

    private static void workWithArray(Console c) {
        //Работаем со строкой
        double d;
        List list = new ArrayList<Double>();

        System.out.println("Добавляем значения типа double в массив:");
        String value = "";
        while (!value.equals(".")) {
            list.add(Double.valueOf(c.readLine("Значение: ")));
        }
    }


}
