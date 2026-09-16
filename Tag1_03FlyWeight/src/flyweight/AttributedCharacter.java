package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {

    private static List<AttributedCharacter> attributedCharacters = new ArrayList<>();

    private final char c;
    private final boolean bold;

    private AttributedCharacter(final char c, final boolean bold) {
        this.c = c;
        this.bold = bold;
        attributedCharacters.add(this);
    }

    public static AttributedCharacter getInstance(final char c, final boolean bold) {
       for (AttributedCharacter attributedCharacter : attributedCharacters) {
           if (attributedCharacter.c == c && attributedCharacter.bold == bold) {
               return attributedCharacter;
           }
       }
       return new AttributedCharacter(c, bold);
    }

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }
}
