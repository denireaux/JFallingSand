package com.denireaux.fallingsand.helpers;

import java.util.Random;

public class Utils {

    public static boolean getUnfairBoolean(int targetNumber) {
        Random rand = new Random();
        int randomNumberBetweenOneAndFifty = rand.nextInt(50);
        if (randomNumberBetweenOneAndFifty == targetNumber) return true;
        return false;
    }

    public static boolean getRandomBoolean() {
        Random rand = new Random();
        boolean randomBool = rand.nextBoolean();
        return randomBool;
    }
    
}
