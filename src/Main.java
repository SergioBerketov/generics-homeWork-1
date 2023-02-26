import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MagicBox<String> boxString = new MagicBox<>(1);

        System.out.println("Добавили строку " + boxString.add("cup"));
        System.out.println(boxString.pick());

        MagicBox<Integer> boxInt = new MagicBox<>(3);

        System.out.println("Добавили число " + boxInt.add(5));
        System.out.println("Добавили число " + boxInt.add(20));
        System.out.println(boxInt.pick());






    }
}