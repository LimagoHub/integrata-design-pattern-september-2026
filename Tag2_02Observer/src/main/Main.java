package main;

import de.integrata.tiere.PigTooFatListener;
import de.integrata.tiere.Schwein;
import de.integrata.tiere.Tier;

public class Main {

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener((p->spediteur.fahren(p)));
        piggy.addPigTooFatListener((spediteur::fahren));
        for(int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
    }

    class SchweineMetzgerAdapter implements PigTooFatListener {

        @Override
        public void pigTooFat(final Schwein pig) {
            metzger.schlachten(pig);
        }
    }
}

class Metzger {


    public void schlachten(final Tier tier) {
        System.out.println("Messer wetz");
    }
}

class Spediteur {
    public void fahren(Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}
