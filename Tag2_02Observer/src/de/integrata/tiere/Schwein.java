package de.integrata.tiere;

import de.integrata.propertychangedevent.PropertyChangedEvent;
import de.integrata.propertychangedevent.PropertyChangedListener;

import java.util.ArrayList;
import java.util.List;

public class Schwein extends Tier {

    private List<PigTooFatListener> pigTooFatListeners  = new ArrayList<>();
    private List<PropertyChangedListener> propertyChangedListeners  = new ArrayList<>();

    public void addPigTooFatListener(PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }
    public void removePigTooFatListener(PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }

    public void addPropertyChangedListener(PropertyChangedListener listener) {
        propertyChangedListeners.add(listener);
    }

    public void removePropertyChangedListener(PropertyChangedListener listener) {
        propertyChangedListeners.remove(listener);
    }

    private void notifyPropertyChangedListeners(PropertyChangedEvent event) {
        for (PropertyChangedListener listener : propertyChangedListeners) {
            listener.propertyChanged(event);
        }
    }

    private void notifyPropertyChangedListeners(String name, Object oldValue, Object newValue) {
        notifyPropertyChangedListeners(new PropertyChangedEvent(this, name, oldValue, newValue));
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
        if(this.name.equals(name)) return;
        notifyPropertyChangedListeners("name", this.name, this.name=name);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        if(this.gewicht == gewicht) return;
        notifyPropertyChangedListeners("gewicht", this.gewicht, this.gewicht=gewicht);
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
