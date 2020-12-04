package com.company;
import com.company.classes.Menu;

/**
 * Classe publica Main, onde ocorre o início do programa. Faz a chamada da classe Menu, para inicializar o Menu
 * @Author João Pedro de Pauda Santoro Azevedo RA: 18.02277-4 e-mail: azevedomasterjp27@hotmail.com
 * @since 04/12
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
	Menu menu = new Menu();
	menu.run();
    }
}
