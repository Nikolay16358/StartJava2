package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        System.out.println("The first jaeger name is " + jaeger1.getModelName() +
                ", this robot is from " + jaeger1.getOrigin());
        jaeger1.setWeight(5000);
        jaeger1.setWeight(1850);
        System.out.println("The first robot weight is " + jaeger1.getWeight());
        jaeger1.setStrength(-3);
        jaeger1.setStrength(10);
        System.out.println(jaeger1.getModelName() + " has " + jaeger1.getStrength() + " power");
        jaeger1.setArmor(-5);
        jaeger1.setArmor(9);
        System.out.println(jaeger1.getModelName() + " has " + jaeger1.getArmor() + " armor");
        jaeger1.killKaiju(11);
        jaeger1.useWeapon();
        jaeger1.wasBorn();
        jaeger1.setOrigin("USA");
        jaeger1.wasBorn();
        jaeger1.setOrigin("Russia");
        jaeger1.wasBorn();

        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 2412f, 10, 10);
        System.out.println("\nThe second jaeger name is " + jaeger2.getModelName() +
                ", this robot is from " + jaeger2.getOrigin() + ", his weight is " + jaeger2.getWeight() +
                ", he has " + jaeger2.getStrength() + " power and " + jaeger2.getArmor() + " armor");
        jaeger2.wasBorn();
        jaeger2.killKaiju(6);
        jaeger2.useWeapon();
        jaeger2.setOrigin("China");
        jaeger2.wasBorn();
        jaeger2.setOrigin("Russia");
        jaeger2.wasBorn();
    }
}
