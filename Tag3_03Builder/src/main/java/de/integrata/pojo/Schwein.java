package de.integrata.pojo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.util.UUID;

@Data
@Setter(AccessLevel.PRIVATE)
@Builder
public class Schwein {

    private UUID id;
    private String name;
    private int gewicht;

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }
}
