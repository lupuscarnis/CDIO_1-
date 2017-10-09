import java.util.Scanner;

public class Game {



    private Player p1;
    private Player p2;
    private Dice dice;
    private int scoreToWin;

    void displayGameMenu() {
        System.out.println();
        System.out.println("(1) Start et nyt spil");
        System.out.println("(2) Spil en runde");
        System.out.println("(3) Hvem fører?");
        System.out.print("Choose an option: ");
    }

    void selectGameOption(int optionSelected) {
        switch (optionSelected) {
            case 1:
                this.startNewGame();
                break;
            case 2:
                this.playOneRound(p1);
                this.playOneRound(p2);
                break;
            case 3:
                this.whoIsLeading();
                break;
            default:
                break;
        }
    }

    void startNewGame() {
        String p1Name;
        String p2Name;

        Scanner sc = new Scanner(System.in);
        System.out.print("Første spillers navn ");
        p1Name = sc.nextLine();
        System.out.print("Anden spillers navn ");
        p2Name = sc.nextLine();
        System.out.print("Man vinder ved 40 point ");
        scoreToWin = 40;

        p1 = new Player(p1Name);
        p2 = new Player(p2Name);
        dice = new Dice();
    }

    void playOneRound(Player p) {
        int result;

        int firstDiceRoll = dice.rollDice();
        int secondDiceRoll = dice.rollDice();
        
         
            result = (firstDiceRoll + secondDiceRoll);
            p.setTotalScore(result);
            System.out.printf("%s kastede %d and %d, "
                    + "og fik %d point, "
                    + "det giver en total på %d point",
                    p.getName(), firstDiceRoll, secondDiceRoll,
                    result, p.getTotalScore()
            );
        

        System.out.println();
    }

    void whoIsLeading() {
        if (p1.getTotalScore() == p2.getTotalScore()) {
            System.out.format("Det står uafgjort, "
                    + "%s has %d, %s has %d",
                    p1.getName(), p1.getTotalScore(),
                    p2.getName(), p2.getTotalScore()
            );
        } else if (p1.getTotalScore() > p2.getTotalScore()) {
            System.out.printf("%s fører, %s har %d point, "
                    + "%s har %d point",
                    p1.getName(), p1.getName(), p1.getTotalScore(),
                    p2.getName(), p2.getTotalScore());
        } else if (p1.getTotalScore() < p2.getTotalScore()) {
            System.out.format("%s fører, %s har %d point, "
                    + "%s har %d point",
                    p2.getName(), p2.getName(), p2.getTotalScore(),
                    p1.getName(), p1.getTotalScore()
            );
        }
    }

    

   

    boolean checkIfAnyoneHasWon() {
        if (p1.getTotalScore() >= scoreToWin && p2.getTotalScore() >= scoreToWin) {
            System.out.println("Det blev uafgjort! Begge spiller har fået 40 point");
            return true;
        } else if (p1.getTotalScore() >= scoreToWin && p2.getTotalScore() < scoreToWin) {
            System.out.format("%s vandt", p1.getName());
            return true;
        } else if (p1.getTotalScore() < scoreToWin && p2.getTotalScore() >= scoreToWin) {
            System.out.format("%s vandt", p2.getName());
            return true;
        }
        return false;
    }

public static void main(String[] args) {
        System.out.println("Velkommen til Terningespillet!");

        Game game = new Game();

        int optionSelected;

        while (true) {
            game.displayGameMenu();
            System.out.println();
            Scanner sc = new Scanner(System.in);
            optionSelected = sc.nextInt();

            while (optionSelected > 3 || optionSelected < 0) {

                System.out.print("Indtast et tal mellem 1 og 3");
                optionSelected = sc.nextInt();
            }

         
         

            game.selectGameOption(optionSelected);

            boolean anyoneWin = game.checkIfAnyoneHasWon();
            if (anyoneWin) {
                System.out.println();
                System.out.println("Spillet er slut");
                break;
            }
        }
    }

}