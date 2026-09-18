package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kontogruppe extends AbstractKontenNode {

    private final List<AbstractKontenNode> children = new ArrayList<>();

    public Kontogruppe(final String label) {
        super(label);
    }

    @Override
    public List<AbstractKontenNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(final AbstractKontenNode child) {
        child.setParent(this);
        children.add(child);
    }
}
