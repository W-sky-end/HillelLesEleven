package MyApp;

import java.util.Scanner;

public class Person {
    private final String name;
    private final int age;
    private String profession;

    public static String scannerLine(Scanner scanner) {
        return scanner.nextLine();   // мне кажется я меняю шило на мыло. Хотел поменьше код сделать =(((
    }

    public static int scannerInt(Scanner scanner) {
        return scanner.nextInt();
    }

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void information() {
        System.out.println("Name : " + name + ". Age : " + age + ". Profession : " + profession + ".");
    }

    public static Person create(Scanner scanner,int number) {
        System.out.println(number + ")Enter name about person please :");
        String name = scannerLine(scanner);
        System.out.println(number + ")Enter age about person please :");
        int age = scannerInt(scanner);
        scanner.nextLine();
        System.out.println(number + ")Enter profession about person please :");
        String profession = scannerLine(scanner);
        return new Person(name, age, profession);
    }

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            Person person1 = create(scanner,1);
            Person person2 = create(scanner,2);
            Person person3 = create(scanner,3);

            System.out.println("Information about all persons :");
            person1.information();
            person2.information();
            person3.information();

            System.out.println("Enter the new profession for first person:");
            String newProfession = scannerLine(scanner);
            person1.setProfession(newProfession);

            System.out.println("Updated information about first person:");
            person1.information();
        }
    }