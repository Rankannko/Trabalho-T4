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

    }
    public void GerarPersonagem(){
        System.out.println("Digite o nome do personagem:");
        String nome = scanner.nextLine();
        System.out.println("Digite a raça do personagem:");
    }
}
