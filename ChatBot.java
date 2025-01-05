import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        //set up Scanner
        Scanner scanner = new Scanner(System.in);
        //1st step
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();

        //2sd step 
        System.out.println("\n Hi "+name+"! i'm javabot.Where are you from?");
        String home = scanner.nextLine();
        
        //step 3
        System.out.println("\nI hear its beautiful at "+home+" ! i'm a place called Oracle");
        
        //step 4
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        //step 5
        System.out.println("\nSo you are "+age+", cool! i'm 400 years old.");
        System.out.println("This means i'm "+(400/age)+" times older than you.");
        System.out.println("Enough about me.What is your favourite language?(just dont say python)");
        scanner.nextLine();
        String language = scanner.nextLine();

        System.out.println("\n" +language +", that's great! Nice chatting with you "+name+", I have to long off now see you!");
        
        //close 
        scanner.close();
        
        
        
    }
}

