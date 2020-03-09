import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        String response;

        System.out.print("Hello. What is your name? ");
        response = scanner.next();
        System.out.print("It's nice to meet you, " + response + ". ");
        //ask for name and print name out in sentence
        System.out.print("How old are you? ");
        response = scanner.next();
        System.out.println("I see that you are still quite young at only " + response + ".");
        //ask for age and print sentence with age
        System.out.print("Where do you live? ");
        response = scanner.next();
        System.out.println("Wow! I've always wanted to go to " + response + ". Thanks for chatting with me. Bye!");
        //ask for location and print sentence as well as a goodbye
        // had to use next instead of nextline because zybooks uses spacebar instead of enter when inputting test cases

}
}
