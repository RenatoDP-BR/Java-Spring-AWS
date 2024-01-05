package aula1_Collections;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "João"));
        pessoas.add(new Pessoa(2L, "Cristiane"));
        pessoas.add(new Pessoa(3L, "Adriano"));
        pessoas.add(new Pessoa(4L, "Nautilus"));
        Pessoa a = pessoas.get(0);

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("-----------");
        pessoas.add(a);

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }
    }

}
