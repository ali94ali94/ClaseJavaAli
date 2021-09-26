
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SrAli
 */
public class Dados {

    public static void main(String args[]) {

        int dados[] = new int[3];

        for (int i = 0; i < 3; i++) {

            dados[i] = (int) Math.floor(Math.random() * (6 - 1 + 1)) + 1;
            System.out.println(dados[i]);

        }
        if (dados[0] == dados[1] && dados[1] == dados[2]) {
            System.out.println("trio");
        } else if (dados[0] == dados[1] && dados[1] != dados[2]) {
            System.out.println("pareja de dado 1 y dado 2");
        } else if (dados[0] != dados[1] && dados[1] == dados[2]) {
            System.out.println("pareja de dado 2 y dado 3");
        } else if (dados[0]!=dados[1] && dados[0]==dados[2]) {
            System.out.println("pareja de dado 1 y dado 3");
        } else if (dados[0] != dados[1] && dados[1] != dados[2]) {
            if (dados[0] < dados[2] && dados[1] < dados[2]) {
                System.out.println("el dado numero 3 es el mas grande con un resultado de " + dados[2]);
            } else if (dados[0] > dados[1] && dados[0] > dados[2]) {
                System.out.println("el dado numero 1 es el mas grande con un resultado de " + dados[0]);
            } else {
                System.out.println("el dado mayor seria el dado numero 2 con un resultado de " + dados[1]);
            }
        }
    }

}
