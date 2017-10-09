public class Player {
    private final String name;
    private int totalScore;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    int getTotalScore(){
        return totalScore;
    }

    void setTotalScore(int score){
        totalScore += score;
    }
}