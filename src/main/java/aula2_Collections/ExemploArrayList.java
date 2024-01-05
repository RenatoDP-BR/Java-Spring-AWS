package aula2_Collections;

import aula1_Collections.Pessoa;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1L, "João"));
        pessoas.add(new Pessoa(2L, "Cristiane"));
        pessoas.add(new Pessoa(3L, "Adriano"));
        pessoas.add(new Pessoa(4L, "Nautilus"));

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
