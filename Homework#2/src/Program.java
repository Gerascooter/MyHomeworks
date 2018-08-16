import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Уважаемый пользователь , введите пожалуйста ваше имя:");
        String name = input.nextLine();
        System.out.println("Уважаемый пользователь , введите пожалуйста ваш город:");
        String city = input.nextLine();
        System.out.println("Уважаемый пользователь , введите пожалуйста ваш возраст:");
        int age = input.nextInt();
        System.out.println("Уважаемый пользователь , введите пожалуйста ваше хобби:");
        String hobby = input.next();
        System.out.println();
        System.out.println("Имя:       " + name + "\n" + "Город:     " + city + "\n" + "Возраст:   " + age + "\n" + "Хобби:     " + hobby + "\n" );
        System.out.println();
        System.out.println("Человек по имени " + name + " живет в городе " + city + ".\nЭтому человеку " + age + " лет и любит он заниматься " + hobby + ".\n");
    }
}
