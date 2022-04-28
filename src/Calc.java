import java.util.Scanner;

public class Calc {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();

        System.out.print("Введите второе число: ");
        int y = in.nextInt();

        System.out.print("Введите знак действия `+` `-` `/` или `*`");

        String z = in.next();

        switch(z) {

            case "+":
                int k = x +y;
                System.out.println("Сумма равна: " + k);
                break;

            case "-":
                int m = x - y;
                System.out.println("Разность равна: " + m);
                break;

            case "/":
                int l = x / y;
                System.out.println("Частное равно: " + l);
                break;

            case "*":
                int f = x * y;
                System.out.println("Произведение равно: " + f);
                break;
            default:
                System.out.println("Введено не верное действие");
                break;
        }


    }

}
