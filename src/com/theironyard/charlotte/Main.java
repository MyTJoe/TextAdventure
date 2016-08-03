package com.theironyard.charlotte;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static void testCrapMethod() throws Exception {
        throw new Exception("OH NO EVERYTHING IS WRONG");
    }

    public static void main(String[] args) throws Exception, FileNotFoundException {
        System.out.println("Welcome, traveller.");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("Choose your weapon (either sword or mace):");
        String weapon = scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("A sword is an awesome choice!");
        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("A mace is an awesome choice!");
        } else {
            throw new Exception("Invalid weapon.");
        }

        System.out.println("Choose a location (forest or tunnel):");
        String location = scanner.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel...");
        } else {
            throw new Exception("Invalid Location.");
        }
    }
}
