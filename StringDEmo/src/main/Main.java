package main;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

public class Main {


    private String a,
    private int b;
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        Instant start = Instant.now();
        for(int i = 0; i < 2_000_000; i++){
            stringBuilder.append("A");
        }
        String s = stringBuilder.toString();
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Main{");
        sb.append("a='").append(a).append('\'');
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }
}
