package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        if(read.equals(Planet.SUN)) thePlanet = Sun.getInstance();
        else if (read.equals(Planet.MOON)) thePlanet = Moon.getInstance();
        else if (read.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
        else thePlanet = null;
        // implement step #5 here - реализуйте задание №5 тут
    }
}
