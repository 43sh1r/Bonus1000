public class Main {
    public static void main(String[] args) {
        int start = 100;
        int add = 2000;
        int bonus = add / 100;
        System.out.println("Добавлено бонусов: " + bonus);
        if (add > 1000) {
            System.out.println("Баланс: " + (start + add + bonus));
        } else {
            System.out.println("Баланс: " + (start + add));
        }
    }
}