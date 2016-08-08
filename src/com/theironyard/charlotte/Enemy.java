package com.theironyard.charlotte;

public class Enemy extends Character {
    public Enemy(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void makeNoise() {
        System.out.println("I'm an enemy I guess. :(");
    }
}