
import java.util.Scanner;
import java.util.ArrayList;

class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
                System.out.println("Choose a theme out of winter sports, cafeteria, zoo");
         String theme = sc.nextLine();
            if (theme.equals("winter sports")) {
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a plural noun");
                words.add(sc.nextLine());
                System.out.println("Enter an verb");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());
                System.out.println("Enter an adverb");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a verb-ing");
                words.add(sc.nextLine());
                System.out.println("Enter a clothing");
                words.add(sc.nextLine());
                System.out.println("Enter a plural noun");
                words.add(sc.nextLine());
                System.out.println("Winter Sports are so much" + words.get(0) + " . There's skiing, where you put two " + words.get(1) + " on your feet and " + words.get(2)
                        + " down a steep " + words.get(3) + " really " + words.get(4) + ". You can also do cross country, " + words.get(5) + ", or snow  " +
                                words.get(6) + " if you don't live near a steep " + words.get(7) + ". Snowboarding is similar, but you stand on one " + words.get(8) + ".");
            }

            if (theme.equals("cafeteria")) {
                System.out.println("Enter a container");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter an adjective ");
                words.add(sc.nextLine());
                System.out.println("Enter a noun ");
                words.add(sc.nextLine());
                System.out.println("Enter an animal");
                words.add(sc.nextLine());
                System.out.println("Enter a vegetable");
                words.add(sc.nextLine());
                System.out.println("Enter a vegetable");
                words.add(sc.nextLine());
                System.out.println("Enter a color");
                words.add(sc.nextLine());

                System.out.println("Make sure your lunch " + words.get(0) + " is filled with nutritious " + words.get(1) + "food. Do not go to the " + words.get(2) + " food stand across the street from school.");
                        System.out.println("The hamburgers they serve are fried in " + words.get(3) + " and are made of" +words.get(4) + " meat." + " So take a sandwich made of " +words.get(5) + " or " + words.get(6)
                                + " it's much healthier! Drink " + words.get(7) + " milk instead.");
            }

            if (theme.equals("zoo")) {
                System.out.println("Enter an adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a adjective");
                words.add(sc.nextLine());
                System.out.println("Enter a plural noun");
                words.add(sc.nextLine());
                System.out.println("Enter an adverb");
                words.add(sc.nextLine());
                System.out.println("Enter a verb");
                words.add(sc.nextLine());
                System.out.println("Enter a noun");
                words.add(sc.nextLine());
                System.out.println("Enter a verb ");
                words.add(sc.nextLine());
                System.out.println("Enter a food");
                words.add(sc.nextLine());
                System.out.println("Enter another food");
                words.add(sc.nextLine());
                System.out.println("One " + words.get(0) + " rainy morning, the monkeys woke up to see " + words.get(1) + words.get(2) + ". They were unlocking the doors to their cage! The monkeys " + words.get(3) +
                                " ran through the open cage, then " + words.get(4) + " behind a nearby " + words.get(5) + ". The monkeys quickly " +words.get(6) + " for the zoo restaurant, where they ordered " + words.get(7) +
                                    " and " +words.get(8)+ ".");
                } else {
                    System.out.println("Please run the program again and choose one out the three themes");
                }
            }
    }


