package aula1_Collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa renato = new Pessoa(1L, "RENATO");
        pessoas.add(renato);

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("--------");
        boolean adicionou = pessoas.add(new Pessoa(1L, "RENATO"));
        if (adicionou)
            System.out.println("adicionou ");
        else
            System.out.println("Não adicionou ");

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
