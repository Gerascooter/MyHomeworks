import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countOfFives = 0;
        System.out.println("Input array size");
        Scanner scanner = new Scanner(System.in);
        array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
            if (array[i] == 5)
                countOfFives++;
        }

        System.out.println("MAX:  " + max);
        System.out.println("MIN:  " + min);
        System.out.println("Count of fives:  " + countOfFives);
        Arrays.sort(array);
        print(array);
    }

    public static void print(int array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
