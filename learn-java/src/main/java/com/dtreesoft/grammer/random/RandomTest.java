package com.dtreesoft.grammer.random;

import java.lang.reflect.Array;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class RandomTest {
    public static void main(String[] args) {
        RandomTest randomTest = new RandomTest();
        randomTest.secureRandomTest();
        randomTest.secureRandomSeedTest();
    }

    private void secureRandomTest() {
        // Seed 를 설정하지 않으면
        System.out.println("---- secureRandomTest ");
        SecureRandom randomA = getSecureRandom();
        List<Integer> listA = new ArrayList<Integer>();

        for (int i=0; i<10; i++) {
            int randValue = randomA.nextInt(10);
            listA.add(randValue);
        }

        SecureRandom randomB = getSecureRandom();
        List<Integer> listB = new ArrayList<Integer>();

        for (int i=0; i<10; i++) {
            int randValue = randomB.nextInt(10);
            listB.add(randValue);
        }

        System.out.println("  -- listA = " + listA);
        System.out.println("  -- listB = " + listB);
    }

    private void secureRandomSeedTest() {
        System.out.println("---- secureRandomSeedTest ");
        SecureRandom randomA = getSecureRandom();
        randomA.setSeed(1L);
        List<Integer> listA = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int randValue = randomA.nextInt(10);
            listA.add(randValue);
        }

        SecureRandom randomB = getSecureRandom();
        randomB.setSeed(1L);
        List<Integer> listB = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int randValue = randomB.nextInt(10);
            listB.add(randValue);
        }

        System.out.println("  -- listA = " + listA);
        System.out.println("  -- listB = " + listB);
    }

    private SecureRandom getSecureRandom() {
        try {
            return SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }
}
