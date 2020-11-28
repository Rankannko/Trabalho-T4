package com.company.classes;
import com.company.classes.Personagem;
import com.company.Enums.*;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Personagem personagem;

    public Menu (){
        scanner = new Scanner(System.in);
    }
    public void run(){
        GerarPersonagem();
        System.out.println(personagem);
    }
    public void GerarPersonagem(){
        String Nome;
        Classes classe;
        Racas raca;
        int Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel;
        System.out.println("Digite os dados:");
        Nome = scanner.nextLine();
        System.out.println("Digite a raça do personagem:");
        raca = Racas.valueOf(scanner.nextLine());
        System.out.println("Digite a classe do personagem");
        classe = Classes.valueOf(scanner.nextLine());
        System.out.println("Digite a Mana, Ataque, Ataque Magico, Defesa, Defesa Magicos, Velocidade, Destreza, Experienca e Nivel do personagem:");
        Mana = Integer.parseInt(scanner.nextLine());
        Ataque = Integer.parseInt(scanner.nextLine());
        AtaqueMagico = Integer.parseInt(scanner.nextLine());
        Defesa = Integer.parseInt(scanner.nextLine());
        DefesaMagica= Integer.parseInt(scanner.nextLine());
        Velocidade= Integer.parseInt(scanner.nextLine());
        Destreza = Integer.parseInt(scanner.nextLine());
        Experiencia= Integer.parseInt(scanner.nextLine());
        Nivel= Integer.parseInt(scanner.nextLine());
        new Personagem(Nome,classe,raca,Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel);
    }
}
