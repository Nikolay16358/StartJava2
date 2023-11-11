package com.startjava2.lesson_2_3_4.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float weight;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float weight, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.weight = weight;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0 && weight <= 3_000) {
            this.weight = weight;
        } else {
            System.out.println("The weight value is incorrect");
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > 0) {
            this.strength = strength;
        } else {
            System.out.println("The strength value is incorrect");
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor > 0) {
            this.armor = armor;
        } else {
            System.out.println("The armor value is incorrect");
        }
    }

    public void killKaiju(int countKills) {
        System.out.println(modelName + " killed " + countKills + " Kaijus");
    }

    public void useWeapon() {
        System.out.println(modelName + " is shooting");
    }

    public void wasBorn() {
        if (origin.equals("USA")) {
            System.out.println("This robot wants to take over the world!");
        } else if (origin.equals("Russia")) {
            System.out.println("This robot wants to save the planet!");
        } else {
            System.out.println("This robot hasn't made a decision about the destiny of planet");
        }
    }
}
