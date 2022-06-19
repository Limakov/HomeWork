// Написать программу возрващающее число, которе без остатка делится на сумма цифр этого числа.
public class dz2 {
    public static void main(String[] args) {
        sum(280);
        
    }
    static double sum(int a) {
        double b = a;
        double i;
        double num = 0;
        while (a != 0) {
            i = a % 10;
            a /= 10;
            num = num + i;
        }
        if (b % num == 0) {
            System.out.println("число делится на сумму его цифр без остатка");
        } else {
            System.out.println("error");
        }
        return b;
    }
    
}
