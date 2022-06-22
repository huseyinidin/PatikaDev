import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fighter joshua = new Fighter("Anthony", 100, 100,110,20);
        Fighter fury = new Fighter("Tyson", 100, 100,110,20);

        Match match = new Match(joshua, fury,110,110);
        match.run();

    }
}
