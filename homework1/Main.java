public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(null, null, "Петр");

        cat.setName("Барсик");
        cat.setAge(5);

        cat.greet();
    }
}
