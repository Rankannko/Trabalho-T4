package com.company.classes;
import com.company.Enums.Classes;
import com.company.Enums.Racas;

public class Personagem {


    public Personagem(String nome, Classes classe, Racas raca, int mana, int ataque, int ataqueMagico, int defesa, int defesaMagica, int velocidade, int destreza, int experiencia, int nivel) {
        Nome = nome;
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
    public Personagem(String nome){this(nome,null,null,0,0,0,0,0,0,0,0,0);}

    @Override
    public String toString() {
        return "Personagem{" +
                "Nome='" + Nome + '\'' +
                ", classe=" + classe +
                ", raca=" + raca +
                ", Mana=" + Mana +
                ", Ataque=" + Ataque +
                ", AtaqueMagico=" + AtaqueMagico +
                ", Defesa=" + Defesa +
                ", DefesaMagica=" + DefesaMagica +
                ", Velocidade=" + Velocidade +
                ", Destreza=" + Destreza +
                ", Experiencia=" + Experiencia +
                ", Nivel=" + Nivel +
                '}';
    }

    private String Nome;
    private Classes classe;
    private Racas raca;
    private int Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel;

    public String getNome() {
        return Nome;
    }

    public Classes getClasse() {
        return classe;
    }

    public Racas getRaca() {
        return raca;
    }

    public int getMana() {
        return Mana;
    }

    public int getAtaque() {
        return Ataque;
    }

    public int getAtaqueMagico() {
        return AtaqueMagico;
    }

    public int getDefesa() {
        return Defesa;
    }

    public int getDefesaMagica() {
        return DefesaMagica;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public int getDestreza() {
        return Destreza;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public int getNivel() {
        return Nivel;
    }

}
