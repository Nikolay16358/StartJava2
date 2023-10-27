public class Wolf {

    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println(nickname + " is moving");
    }

    public void sit() {
        System.out.println(nickname + " is sitting");
    }

    public void run() {
        System.out.println(nickname + " is running");
    }

    public void howl() {
        System.out.println(nickname + " is howling");
    }

    public void hunt() {
        System.out.println(nickname + " is hunting");
    }
}
