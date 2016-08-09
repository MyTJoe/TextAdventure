package com.theironyard.charlotte;

/**
 * Created by Ben on 8/8/16.
 */
public class Character {
    String name;
    int health;
    int damage;

    public Character() {
    }

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void battle(Character enemy) {
        System.out.printf("%s appears!\n", enemy.name);

        while (health > 0 && enemy.health > 0) {
            health -= enemy.damage;
            enemy.health -= damage;
            System.out.printf("%s's health: %d\n", name, health);
            System.out.printf("%s's health: %d\n", enemy.name, enemy.health);
        }

        String message = "%s has died.\n";

        if (health <= 0) {
            System.out.printf(message, name);
        }

        if (enemy.health <= 0) {
            System.out.printf(message, enemy.name);
        }
    }

    public static Character buildCharacter(String category) throws Exception {
        if (category.equals("badguy")) {
            return new Enemy("Victor Freeze", 10, 10);
        } else if (category.equals("goodguy")) {
            return new Player("Ben", 10000, 10010000);
        } else {
            throw new Exception("This is not a valid character type.");
        }
    }

    public void makeNoise() {
        System.out.println("I'm a character!");
    }
}
