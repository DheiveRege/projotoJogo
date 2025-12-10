/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoFinal_1000;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author DHEIVERODRIGUESFUCK
 */
public class Jogo {

    public static void main(String[] args) {
        new TelaPrincipal().setVisible(true);
    }
    public static boolean escape(Personagem personagem, Inimigo inimigo) {
        int chanceFugir = 20 + (personagem.speed - inimigo.speed) * 5;
        int sorte = (int) (Math.random() * 100);
        if (sorte < chanceFugir) {
            System.out.println("Voce escapou da luta!!! \ncagado");
            return true;
        } else {
            inimigo.attack(personagem, inimigo);
            return false;
        }
    }

}
