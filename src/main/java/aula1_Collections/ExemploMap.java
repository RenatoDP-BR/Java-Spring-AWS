package aula1_Collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {
        Map<Long, Pessoa> mapa = new HashMap<>();
        Pessoa renato = new Pessoa(1L, "RENATO");

        mapa.put(1L, renato);

        Pessoa renato2 = mapa.get(1L);
    }

}
