public class Main {
    public static void main(String[] args) {
        Bag<Integer> Bag1 = new Bag<>();
        Bag1.add(1);
        Bag1.add(2);
        Bag1.add(3);
        System.out.println("Bag1 contains 2: " +Bag1.contains(2));
        System.out.println("Bag1 size: " + Bag1.size());
        System.out.println("Random grab from Bag1: " + Bag1.grab());
        Bag1.remove(2);
        System.out.println("Bag1 contains 2 after removal: " + Bag1.contains(2));
        System.out.println("String rerturned from Bag1: " + Bag1.toString());
        Object[] Array1 = Bag1.toArray();
        System.out.print("Array returned from Bag contains:");
        for (Object num: Array1){
            System.out.print(" ");
            System.out.print(num);
        }
        System.out.println();
        System.out.println("Is Bag1 empty: " + Bag1.isEmpty());
        Bag1.clear();
        System.out.println("Is Bag1 empty after clear: " + Bag1.isEmpty());
    }
}
