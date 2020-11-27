package com.company.classes;
import com.company.Enums.Classes;
import com.company.Enums.Racas;

public class Personagem {
    public Personagem(String nome, String profissão, Classes classe, Racas raca, int mana, int ataque, int ataqueMagico, int defesa, int defesaMagica, int velocidade, int destreza, int experiencia, int nivel) {
        Nome = nome;
        Profissão = profissão;
        this.classe = classe;
        this.raca = raca;
        Mana = mana;
        Ataque = ataque;
        AtaqueMagico = ataqueMagico;
        Defesa = defesa;
        DefesaMagica = defesaMagica;
        Velocidade = velocidade;
        Destreza = destreza;
        Experiencia = experiencia;
        Nivel = nivel;
    }

    private String Nome, Profissão;
    private Classes classe;
    private Racas raca;
    private int Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel;
}
