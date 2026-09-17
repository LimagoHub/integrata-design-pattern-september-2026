package de.integrata.tiere;

import java.io.Serializable;

public class Schwein {

    private String name;
    private int gewicht;
    public Schwein(String name) {
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
    }

    public void fuettern() {
        setGewicht(getGewicht() +1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }

    public SchweineMemento getMemento() {
        return new MySchweineMemento(name, gewicht);
    }

    public void setMemento(final SchweineMemento memento) {
        MySchweineMemento mymemto = (MySchweineMemento) memento;
        this.name = mymemto.getName();
        this.gewicht = mymemto.getGewicht();
    }


    private static class MySchweineMemento implements SchweineMemento {
       private final String name;
       private final int gewicht;

       public MySchweineMemento(final String name, final int gewicht) {
           this.name = name;
           this.gewicht = gewicht;
       }

        public String getName() {
            return name;
        }

        public int getGewicht() {
            return gewicht;
        }
    }
}
