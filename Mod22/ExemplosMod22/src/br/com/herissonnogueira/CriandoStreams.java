package br.com.herissonnogueira;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author herisson.nogueira
 */

public class CriandoStreams {

    public static void main(String[] args) {
        Stream<String> stream = List.of("Herisson", "Nogueira", "Teste").stream();

        Stream<String> set = Set.of("Herisson", "Nogueira", "Teste").stream();

        Map<String, String> map = Map.of("Herisson", "Nogueira");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSTS = Stream.of("String", "asds");
    }
}
