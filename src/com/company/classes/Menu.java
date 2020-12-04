package com.company.classes;
import com.company.classes.Personagem;
import com.company.Enums.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.company.DAO.PersonagemDAO;

/**
 * Classe Menu, onde o programa esta esquematizado. A partir daqui a interface visual e as chamadas são realizadas
 * @Author João Pedro de Pauda Santoro Azevedo RA: 18.02277-4 e-mail: azevedomasterjp27@hotmail.com
 * @since 04/12
 */
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
                case 3:
                    atualizarPersonagem();
                    break;
                case 4:
                    deletarPersonagem();
                    break;
            }

        }while(alive);
    }
    public void GerarPersonagem(){
        String Nome;
        Classes classe;
        Racas raca;
        int Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel;
        System.out.println("Digite o nome do personagem:");
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
        personagems.forEach( personagem-> System.out.println(personagem));
    }

    public void atualizarPersonagem(){
        String Nome;
        Classes classe;
        Racas raca;
        int Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel;
        personagems=personagemDAO.getAll();
        System.out.println("Digite o nome do personagem:");
        Nome = scanner.nextLine();
        System.out.println("Digite a classe do personagem");
        classe = Classes.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Digite a raça do personagem:");
        raca = Racas.valueOf(scanner.nextLine().toUpperCase());
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
        personagemDAO.update(new Personagem(
                Nome,classe,raca, Mana, Ataque, AtaqueMagico, Defesa, DefesaMagica, Velocidade, Destreza, Experiencia, Nivel)
        );
    }

    public void deletarPersonagem(){
        System.out.println("Escrever o nome do personagem a ser deletado:");
        String nome = scanner.nextLine();
        Personagem personagem = new Personagem(nome);
        personagemDAO.delete(personagem);
    }
    public void menuVisual(){
        System.out.println("O que deseja fazer?");
        System.out.println("1-Criar novo personagem:");
        System.out.println("2-Exibir lista de personagens disponiveis:");
        System.out.println("3- Atualizar um personagem:");
        System.out.println("4- Deletar um personagem;");
    }
}
