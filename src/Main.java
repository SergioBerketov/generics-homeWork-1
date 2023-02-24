import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MagicBox<String> boxString = new MagicBox<>(1);
        boxString.add("cup");
        boxString.add("ball");
        boxString.pick();

        MagicBox<Integer> boxInt = new MagicBox<>(3);

        boxInt.add(5);
        boxInt.add(88);
        boxInt.add(111);
        boxInt.pick();
    }
}