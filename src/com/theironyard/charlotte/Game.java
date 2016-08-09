package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player();

    public static void main(String[] args) throws Exception {
//        System.out.println("Welcome, traveller.");
//
//        player.chooseName();
//        player.chooseWeapon();
//        player.chooseLocation();
//
//        player.findItem("shield");
//        player.findItem("boots");
//        player.findItem("belt");
//
//        Character c = Character.buildCharacter("goodguy");
//
//        if (c instanceof Enemy) {
//            Enemy aljfafjf = (Enemy)c;
//        }
//
//        nextLine();

        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0;i < 50;i++) {
            characters.add(Character.buildCharacter("badguy"));
        }

        // POLYMORPHISM
        for (int i = 0;i < 50;i++) {
            characters.get(i).makeNoise();
        }
    }

    public static String nextLine() {
        String line = scanner.nextLine();
        while (line.startsWith("/")) {
            switch (line) {
                case "/inv":
                    for (String item : player.items) {
                        System.out.println(item);
                    }
                    break;
                case "/exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Command not found!");
                    break;
            }
            line = scanner.nextLine();
        }
        return line;
    }
}
