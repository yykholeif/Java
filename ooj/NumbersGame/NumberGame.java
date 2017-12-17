import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it");


        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i>0; i--){
            System.out.println("You have " + i + " guess(es) left");
            int guess = scanner.nextInt();

            if(randomNumber < guess) {
                System.out.println("The number is less than " + guess + ", try again");
            }

            else if(randomNumber > guess) {
                System.out.println("The number is greater than " + guess + ", try again");
            }

            else {
                hasWon = true;
                break;
            }
        }
        if(hasWon) {
            System.out.println("Correct, you win!");
        } else {
            System.out.println("Game Over, you have run out of guesses");
            System.out.println("The correct number was: " + randomNumber);
        }

    }

}