package com.company.classes;
import com.company.classes.Personagem;
import com.company.Enums.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.company.DAO.PersonagemDAO;

public class Menu {
    private Scanner scanner;
    private List<Personagem> personagems;
    private PersonagemDAO personagemDAO;

    public Menu(){
        personagems = new ArrayList<>();
        personagemDAO = new PersonagemDAO();
        scanner = new Scanner(System.in);
    }

    public void run(){
        boolean alive= true;
        do{
            menuVisual();
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 0:
                    alive = false;
                    break;
                case 1:
                    GerarPersonagem();
                    break;
                case 2:
                    exibirPersonagems();
                    break;
            }

        }while(alive);
    }
    public void GerarPersonagem(){
        String Nome;
        Classes classe;
        Racas raca;
        int Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel;
        System.out.println("Digite os dados:");
        Nome = scanner.nextLine();
        System.out.println("Digite a classe do personagem");
        classe = Classes.valueOf(scanner.nextLine());
        System.out.println("Digite a raça do personagem:");
        raca = Racas.valueOf(scanner.nextLine());
        System.out.println("Digite a Mana:");
        Mana = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o ataque:");
        Ataque = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o ataque magico:");
        AtaqueMagico = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a defesa:");
        Defesa = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a defesa magica:");
        DefesaMagica= Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a velocidade:");
        Velocidade= Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a destreza:");
        Destreza = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a experiencia atual:");
        Experiencia= Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o nivel atual:");
        Nivel= Integer.parseInt(scanner.nextLine());
        personagemDAO.create(new Personagem(Nome,classe,raca,Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel));
    }
    public void exibirPersonagems(){
        personagems=personagemDAO.getAll();
        System.out.println("Personagens:");
        personagems.forEach( pokemon-> System.out.println(pokemon));
    }

    public void menuVisual(){
        System.out.println("O que deseja fazer?");
        System.out.println("1-Criar novo personagem");
        System.out.println("2-Exibir lista de personagens disponiveis");

    }
}
