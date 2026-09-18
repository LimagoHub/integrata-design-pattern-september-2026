package composite;

import java.util.*;

public class AbstractKontenNode implements Iterable<AbstractKontenNode> {

    private AbstractKontenNode parent =  null;
    private String label;

    public AbstractKontenNode(String label) {
        this.label = label;
    }



    public AbstractKontenNode getParent() {
        return parent;
    }

    public void setParent(final AbstractKontenNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractKontenNode> getChildren() {
        return Collections.emptyList();
    }


    public void ausgabe() {
        System.out.println(this);
        for (AbstractKontenNode child : getChildren()) {
            child.ausgabe();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+"{");

        sb.append("label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Iterator<AbstractKontenNode> iterator() {
        List <AbstractKontenNode> result = new ArrayList<AbstractKontenNode>();
        iteratorImpl(result);
        return result.iterator();
    }

    private void iteratorImpl(List <AbstractKontenNode> listToFill) {
        listToFill.add(this);
        for (AbstractKontenNode child : getChildren()) {
            child.iteratorImpl(listToFill);
        }
    }
}
