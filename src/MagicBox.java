import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    Random random = new Random();


    public MagicBox(int maxElements) {
        this.items = (T[]) new Object[maxElements];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Мест для добавления нового объекта нет! :( ");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Коробка не полна, необходимо " +
                        "добавить еще %d элемент(а) ", items.length-i));
            }
            }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

    @Override
    public String toString() {
        for (T s: items) {
            System.out.println(s);
        }
        return "";
    }
}
