import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private List<Integer> scores;


    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        this.scores = new ArrayList<Integer>();
    }
    public void trackScores(int newScore){
        this.scores.add(newScore);
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points += points;

    }
    public void getScoreCard(){
        System.out.print("                jump lenghts: ");
        System.out.println(jumperScores());


    }
    public String jumperScores(){
        String scoreCard = this.scores.toString();
        String scores = scoreCard.substring(1, scoreCard.length()-1);

        return scores;

    }

    public String toString() {
        return this.name + " (" + this.points + ")";
    }

    public int compareTo(Jumper jumper) {
        return this.points - jumper.points;
    }
}
