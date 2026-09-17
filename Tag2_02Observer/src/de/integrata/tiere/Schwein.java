package de.integrata.tiere;

import java.util.ArrayList;
import java.util.List;

public class Schwein extends Tier {

    private List<PigTooFatListener> pigTooFatListeners  = new ArrayList<>();


    public void addPigTooFatListener(PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }
    public void removePigTooFatListener(PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }

    private void firePigTooFatEveent(){
        pigTooFatListeners.forEach(listener -> listener.pigTooFat(this));
    }

    //---------------------------------------------------------------------------
    private String name;
    private int gewicht;

    public Schwein() {
        this("Nobody");
    }

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
        if(this.gewicht > 20) firePigTooFatEveent();
    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
