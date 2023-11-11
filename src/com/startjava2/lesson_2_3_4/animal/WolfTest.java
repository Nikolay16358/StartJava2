package com.startjava2.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setNickname("Akela");
        wolf.setWeight(75.2f);
        wolf.setAge(17);
        wolf.setAge(5);
        wolf.setColor("grey");

        System.out.println("The wolf is " + wolf.getGender());
        System.out.println("His name is " + wolf.getNickname());
        System.out.println("He is " + wolf.getAge() + " years old");
        System.out.println("His weight is " + wolf.getWeight());
        System.out.println("His wool color is " + wolf.getColor());

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
