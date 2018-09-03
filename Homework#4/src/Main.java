import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //output 1
        System.out.println("Введите ваш Х:");
        int x = sc.nextInt();
        xNumber(x);
        System.out.println();

        System.out.println("Введите вашу ширину:"); //2
        int width = sc.nextInt(); //output 2
        System.out.println();
        System.out.println("Введите вашу высоту:");
        int height = sc.nextInt();
        System.out.println();
        System.out.println(drawRectangle(width, height));

        System.out.println("Введите сторону квадрата:"); //3
        width = sc.nextInt();
        System.out.println();
        System.out.println(drawRectangle(width));

        System.out.println("Введите первое число:"); //4
        int f = sc.nextInt();
        System.out.println("Введите второе число:");
        int s = sc.nextInt();
        System.out.println();
        System.out.println("Максимальное число: " + getMax(f,s));
        System.out.println();
        sc.useLocale(Locale.US);
        System.out.println("Введите первое число:");
        float a = sc.nextFloat();
        System.out.println("Введите второе число:");
        float b = sc.nextFloat();
        System.out.println();
        System.out.println("Максимальное число: " + getMax(a,b));
        System.out.println();

        System.out.println("Введите ваш Х:"); //5
        int curr = 1;
        int goTo = sc.nextInt();
        System.out.println();
        getNumberRec(goTo,curr);
        System.out.println();

        System.out.println("Введите вашу ширину:"); //6
        width = sc.nextInt(); //output 2
        System.out.println();
        System.out.println("Введите вашу высоту:");
        height = sc.nextInt();
        System.out.println();
        drawRectangle2(width,height);
        sc.close();
    }

    private static void xNumber(int x){      //task 1
        int numb = 1;
        while (numb<=x) {
            System.out.println(numb);
            numb++;
        }
    }

    private static String drawRectangle(int width , int height) //task2
    {
        String draw = "";
        for (int i = 0; i < height; i++)
        {
            String row = "";
            for (int j = 0; j < width; j++)
            {
                row = row + "+";
            }
            draw = draw + row + "\n";
        }
        return draw;
    }

    private static String drawRectangle(int width){  //task3
        String draw = "";
        for (int i = 0; i < width; i++) {
            String row = "";
            for (int j = 0; j < width; j++) {
                row = row + "+";
            }
            draw = draw + row + "\n";
        }
        return draw;
    }

    private static int getMax(int f, int s) //task 4
    {
        return (f>=s ? f : s);
    }

    private static float getMax(float a, float b)
    {
        return (a>=b ? a : b);
    }

    private static void getNumberRec(int goTo, int curr) //task 5
    {
        System.out.println(curr);
        if(curr<goTo)
        {
            curr++;
            getNumberRec(goTo,curr);
        }else{
            return;
        }
    }

    private static void draw(int line) //task 6
    {
        if (line > 0)
        {
            System.out.print("+");
            draw(line - 1);
        }
    }

    private static void drawRectangle2(int width, int height)
    {
        if (height > 0)
        {
            draw(width);
            System.out.println();
            drawRectangle2(width, height - 1);
        }
    }
}

