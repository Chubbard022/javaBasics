import java.io.Console;

public class newDataTypes{
    public static void main(String[] args){
        Console console = System.console();

        int age = 12;
        if(age < 12){
            console.printf("Sorry you mst be at least 13\n");
            System.exit(0);
        }
    }
}