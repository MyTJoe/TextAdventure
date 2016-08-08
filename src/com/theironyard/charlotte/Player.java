package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by Ben on 8/3/16.
 */
public class Player extends Character {
    String weapon;
    String location;

    ArrayList<String> items = new ArrayList<>();

    public Player() {
        this.health = 20;
        this.damage = 20;
    }

    public Player(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void chooseName() {
        System.out.println("What is your name?");
        name = Game.nextLine();
        System.out.printf("Welcome, %s\n", name);
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Please choose a weapon! [mace/sword]");

        String weapon = Game.nextLine();

        if (weapon.equalsIgnoreCase("sword") || weapon.equalsIgnoreCase("mace")) {
            this.weapon = weapon;
        } else {
            throw new Exception("Invalid weapon");
        }

        System.out.printf("%s is a fine choice!\n", this.weapon);
    }

    public void chooseLocation() throws Exception {
        System.out.println("Please choose a location! [forest/tunnel]:");

        String location = Game.nextLine();

        if (location.equalsIgnoreCase("forest") || location.equalsIgnoreCase("tunnel")) {
            this.location = location;
        } else {
            throw new Exception("Invalid Location!");
        }

        System.out.printf("Entering %s...\n", location);
    }

    public void findItem(String item) {
        System.out.printf("You found a %s! Pick it up? [y/n]\n", item);
        String answer = Game.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked up an item!");
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("I'm a player!");
    }
}
