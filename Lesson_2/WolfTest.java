public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "male";
        wolf.nickname = "Akela";
        wolf.weight = 75.2f;
        wolf.age = 17;
        wolf.color = "grey";

        System.out.println("The wolf is " + wolf.gender);
        System.out.println("His name is " + wolf.nickname);
        System.out.println("He is " + wolf.age + " years old, and his weight is " + wolf.weight);
        System.out.println("His wool color is " + wolf.color);

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
