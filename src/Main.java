public class Main {
    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox<>(5);
        box1.add("First");
        box1.add("Second");
        box1.add("Third");
        box1.add("Fourth");
        box1.add("Fifth");
        System.out.println(box1);
        System.out.println(box1.pick());
        System.out.println();

        MagicBox<Integer> box2 = new MagicBox<>(5);
        box2.add(123);
        box2.add(345);
        box2.add(678);
        box2.add(910);
//    box2.add(122);
        System.out.println(box2);
        System.out.println(box2.pick());
    }
}
