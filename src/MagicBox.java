import java.sql.Struct;
import java.util.Random;

import static java.lang.Math.random;

public class MagicBox<T> {
    private T[] objects;

    public MagicBox(int maxObjAmount) {
        this.objects = (T[]) new Object[maxObjAmount];
    }

    public boolean add(T someObject) {
        for (int i = 0; i < objects.length; i++) {

            if (objects[i] == null) {
                objects[i] = someObject;
                return true;

            }
        }
        return false;
    }

    public T pick() {

        T randomPoint = null;
        int finalSize = objects.length;

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                throw new RuntimeException("Коробка не полна, и осталось ещё " + finalSize + " ячеек заполнить");
            }
            finalSize--;
        }

        for (T obj : objects) {
            if (obj != null) {
                Random random = new Random();
                int randomInt = random.nextInt(objects.length);
                randomPoint = objects[randomInt];
            }
        }

        System.out.println("Коробка полна!");
        return randomPoint;
    }
}

