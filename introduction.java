import java.io.Console;

public class introduction{
    public static void main(String[] args){
        Console console = System.console();

        //String firstName = "Curtis";
        String firstName = console.readLine("What is your name? ");

        console.printf("hell, my name is %s\n",firstName);
        console.printf("%s is learning how to write in java\n",firstName);
    }
}