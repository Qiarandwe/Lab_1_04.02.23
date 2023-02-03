import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.println("Введит координату x");
        float x = scan.nextFloat();
        System.out.println("Введит координату y");
        float y = scan.nextFloat();
        if (x < 0 || y < 0) {
            if (x < 0) {
                x = x * (-1);
            } else {
                y = y * (-1);
            }
        }
        float S = x + y;
        if (S <= 1) {
            System.out.println("Входит");
        } else {
            System.out.println("Не входит");
        }


        System.out.println("Задание 2");
        System.out.println("Введит время разговора в часах");
        int t = scan.nextInt();
        System.out.println("Введит время разговора в минутах");
        int t2 = scan.nextInt();
        System.out.println("Введит стоимость разговора за минуту");
        int s = scan.nextInt();
        System.out.println("Введит день недели");
        int d = scan.nextInt();
        int con;
        int con1;
        double ss = 0;
        if ((t >= 0) && (t < 24) && (t2 > 0) && (s > 0) && (d >= 1) && (d <= 7)) {
            if ((t <= 8) && (t >= 22)) {
                con = 1;
            } else {
                con = 0;
            }
            if ((d == 6) && (d == 7)) {
                con1 = 1;
            } else {
                con1 = 0;
            }
            if ((con == 1) && (con1 == 0)) {
                ss = s * t2 * 0.9;
            } else {
                if ((con == 0) && (con1 == 1)) {
                    ss = s * t2 * 0.95;
                } else {
                    if ((con == 1) && (con1 == 1)) {
                        ss = s * t2 * 0.85;
                    } else {
                        ss = s * t2;
                    }
                }
            }
        }
        System.out.println("Сумма разговора:" + ss);


        System.out.println("Задание 3");

        System.out.println("Задание 3(a)");
        System.out.println("Введит A");
        int A = scan.nextInt();
        System.out.println("Введит B");
        int B = scan.nextInt();
        if ((A % 2 == 0) & (B % 2 == 0)) {
            System.out.println("Ложь");
        } else {
            if ((A % 2 == 1) & (B % 2 == 1)) {
                System.out.println("Ложь");
            } else {
                System.out.println("Правда");
            }
        }

        System.out.println("Задание 3(b)");
        System.out.println("Введит C");
        int C = scan.nextInt();
        if ((A % 3 == 0) && (B % 3 == 0) && (C % 3 == 0)) {
            System.out.println("Правда");
        } else {
            System.out.println("Ложь");
        }
    }
}

