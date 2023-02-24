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

        int count = 0;

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                throw new RuntimeException("Коробка не полна, и осталось ещё " + (objects.length -1) + " ячеек заполнить");
            } else if (objects[i] != null) {

                Random random = new Random();
                int randomInt = random.nextInt(objects.length);
                count += randomInt;
            }
        }
        return count;
    }
}
