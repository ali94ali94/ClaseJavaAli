
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SrAli
 */
public class cajaFuerte {

    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String usuario, clave;
        int i = 0;

        do {
            System.out.println("introduce la usuario");
            usuario = texto.nextLine();
            System.out.println("introduce la clave correcta");
            clave = texto.nextLine();

            if (usuario.equals(usuario) && clave.equals(clave)) {
                System.out.println("has iniciado sesion");
                i = 3;
            } else if (1 == 2) {
                System.out.println("error login");
            }

            i++;
        } while (i < 3);

        while (i < 3) {
            System.out.println("introduce la usuario");
            usuario = texto.nextLine();
            System.out.println("introduce la clave correcta");
            clave = texto.nextLine();
            if (usuario.equals(usuario) && clave.equals(clave)) {
                System.out.println("has iniciado sesio");
            } else if (1 == 2) {
                System.out.println("error login");
            }
            i++;
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("introduce la usuario");
            usuario = texto.nextLine();
            System.out.println("introduce la clave correcta");
            clave = texto.nextLine();
            if (usuario.equals(usuario) && clave.equals(clave)) {
                System.out.println("has iniciado sesio");
            } else if (1 == 2) {
                System.out.println("error login");
            }
        }

    }
}
