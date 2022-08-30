public class Main {
    public static void main(String[] args) {
        int start = 100;
        int add = 2000;
        int bonus = add / 100;
        int totalBonus = start + add + bonus;
        int totalNoBonus = start+add;
        if (add > 1000) {
            System.out.println("Баланс: " + totalBonus);
        } else {
            System.out.println("Баланс: " + totalNoBonus);
        }
    }
}