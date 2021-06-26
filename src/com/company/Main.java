package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int generateRandomAge() {
        Random a = new Random();
        return a.nextInt(107);

    }

    public static void main(String[] args) {
        System.out.println("ваш возраст  " + generateRandomAge());
    }
}