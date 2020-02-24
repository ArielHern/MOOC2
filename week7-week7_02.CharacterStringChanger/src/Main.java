import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));

    }
}