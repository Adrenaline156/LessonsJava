package Lesson;

public class Main {
    public static void main(String[] args) {

    }

    public boolean check(int a, int b) {
        return (10 <= a + b) && (a + b <= 20);
    }

    static boolean moreThanFive(int a) {
        if (a > 5) {
            return true;
        } else {
            return false;
        }
    }

    static boolean doFive(int a) {
        System.out.println("");
        if (a < 0) return true;
        return false;
    }

    static void doFour(int a) {
        System.out.println("Число");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
}
    