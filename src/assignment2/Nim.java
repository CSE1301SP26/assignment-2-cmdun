import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sticksRemaining;
        int stickCount; //The amount the user chooses to pick for each round
        int roundNumber = 1;
        int computerChoice;
        boolean isLast = false;
        
        for (sticksRemaining = 7; sticksRemaining > 0;) {
            System.out.println("Round " + roundNumber + ": ");
            if (isLast == false) {
                System.out.print("Your turn! Select 1 or 2 sticks: ");
                stickCount = in.nextInt();
                if (stickCount < 1 || stickCount > 2) {
                    System.out.println("Please choose a valid number (1 or 2).");
                } else {
                    sticksRemaining = sticksRemaining - stickCount;
                    System.out.println("You chose " + stickCount + " stick(s).");
                    System.out.println("There are/is " + sticksRemaining + " stick(s) remaining.");
                    isLast = true;
                    roundNumber = roundNumber + 1;
                }
            } else { //Computer decision; to improve, program computer to make specific decisions based on sticksRemaining (if 2 remain, always choose two, etc.)
                if (sticksRemaining > 0) {
                    double computerRandom = Math.random();
                    if (computerRandom > 0.5) {
                        computerChoice = 2;
                    } else {
                        computerChoice = 1;
                    }
                    sticksRemaining = sticksRemaining - computerChoice;
                    System.out.println("The computer chose " + computerChoice + " stick(s).");
                    System.out.println("There are/is " + sticksRemaining + " stick(s) remaining.");
                    isLast = false;
                    roundNumber = roundNumber + 1;
                }
            }

        }
        if (isLast) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }

    }

}
