import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tournament {
    private ArrayList<Jumper> jumpers;
    private ArrayList<Integer> judges;
    private Random random;


    public Tournament() {
        jumpers = new ArrayList<Jumper>();
        judges = new ArrayList<Integer>();
        random = new Random();
    }

    public void add(String name) {
        this.jumpers.add(new Jumper(name));

    }

    public int jump() {
        for (Jumper jumper : this.jumpers) {
            int length = random.nextInt(120 - 60) + 60;
            return length;
        }
        return 0;
    }

    public void JudgesScore() {
        for (int i = 0; i < 5; i++) {
            judges.add(random.nextInt(20 - 10) + 10);
        }
    }

    public void printAfterJump() {
        for (Jumper jumper : this.jumpers) {
            System.out.println(" " + jumper.getName());

            int jumpResult = jump(); //Go for a jump
            JudgesScore(); //Judges give their score;

            System.out.println("   length: " + jumpResult);
            System.out.println("   judge votes:" + this.judges);

            jumper.trackScores(jumpResult); //Track point for individual jump

            jumper.setPoints(calculateScore() + jumpResult); // Generate the total score

            this.judges.clear(); //Clear all score before for next jump;
        }
    }

    public int calculateScore() {
        int max = judges.indexOf(Collections.max(judges));
        int min = judges.indexOf(Collections.min(judges));

        int point = 0;
        for (Integer score : this.judges) {
            if (score != judges.get(max) && score != judges.get(min)) {
                point += score;
            }

        }
        return point;

    }

    public void finalPrint() {
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        System.out.println("position        Name");

        int counter = 1;
        for (Jumper player : this.jumpers) {
            System.out.println(counter+"               "+player);
            player.getScoreCard();
            counter++;
        }
    }


    public void print() {
        int counter = 1;
        for (Jumper jumper : this.jumpers) {
            System.out.println(" " + counter + ". " + jumper);
            counter++;
        }
    }


}
