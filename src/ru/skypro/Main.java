package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // задача 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        //задача 2
        int client1OS = 1;
        int clientDeviceYear = 2015;
        if (client1OS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (client1OS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else if (client1OS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        }

        //задача 3

        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }

        // задача 4

        int delieveryDistance = 95;
        int terms = 1;
        if (delieveryDistance < 20) {
            System.out.println("Потребуется дней: " + terms + " день");
        } else if (delieveryDistance >= 20 && delieveryDistance < 60) {
            System.out.println("Потребуется дней: " + (terms + 1) + " дня");
        } else if (delieveryDistance >= 60 && delieveryDistance < 100) {
            System.out.println("Потребуется дней: " + (terms + 2) + " дня");
        }

        // задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит зимнему сезону");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит весеннему сезону");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит летнему сезону");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит осеннему сезону");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }

        //задача 6
        int age = 21;
        int salary = 58_000;
        if (age >= 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " руб.");
        } else if (age >= 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом  " + salary * 3 * 1.2 + " руб.");
        } else if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом  " + salary * 3 * 1.5 + " руб.");
        } else if (age < 23 && salary < 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 + " руб.");
        } else if (age < 23 && salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.2 + " руб.");
        } else if (age < 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.5 + " руб.");
        }

        // задача 7
        int age7 = 25;
        int salary7 = 95_000;
        int wantedSum = 330_000;
        int maxPayment = salary7 / 2;
        System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxPayment);
        if (age7 < 23 && salary7 <= 80_000) {
            System.out.println("Платеж по кредиту " + (wantedSum + ((wantedSum * (10 + 1)) / 100)) / 12 + " рублей.");
            boolean isCreditAllowed = maxPayment >= (wantedSum + ((wantedSum * (10 + 1)) / 100)) / 12;
            if (isCreditAllowed) {
                System.out.println("Одобрено.");
            } else {
                System.out.println("Не одобрено");
            }

        } else if (age7 < 23 && salary7 > 80_000) {
            System.out.println("Платеж по кредиту " + (wantedSum + ((wantedSum * (10 + 1 - 0.7)) / 100)) / 12 + " рублей.");
            boolean isCreditAllowed = maxPayment >= (wantedSum + ((wantedSum * (10 + 1 - 0.7)) / 100)) / 12;
            if (isCreditAllowed) {
                System.out.println("Одобрено.");
            } else {
                System.out.println("Не одобрено");
            }

        } else if (age7 < 30 && salary7 <= 80_000) {
            System.out.println("Платеж по кредиту " + (wantedSum + ((wantedSum * (10 + 0.5)) / 100)) / 12 + " рублей.");
            boolean isCreditAllowed = maxPayment >= (wantedSum + ((wantedSum * (10 + 0.5)) / 100)) / 12;
            if (isCreditAllowed) {
                System.out.println("Одобрено.");
            } else {
                System.out.println("Не одобрено");
            }
        } else if (age7 < 30 && salary7 > 80_000) {
            System.out.println("Платеж по кредиту " + (wantedSum + ((wantedSum * (10 + 0.5-0.7)) / 100)) / 12 + " рублей.");
            boolean isCreditAllowed = maxPayment >= (wantedSum + ((wantedSum * (10 + 0.5-0.7)) / 100)) / 12;
            if (isCreditAllowed) {
                System.out.println("Одобрено.");
            } else {
                System.out.println("Не одобрено");
            }
        }
    }
}

