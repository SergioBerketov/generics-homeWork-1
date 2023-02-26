import java.sql.Struct;
import java.util.Random;

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

    public int pick() {

        int randomPoint = 0;
        int finalSize = objects.length;

        for (T obj : objects) {
            if (obj != null) {
                finalSize--;
                Random random = new Random();
                int randomInt = random.nextInt(objects.length);
                randomPoint += randomInt;
            }
        }

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                throw new RuntimeException("Коробка не полна, и осталось ещё " + finalSize + " ячеек заполнить");
            }
        }
        System.out.println("Коробка полна!");
        return randomPoint;
    }
}

