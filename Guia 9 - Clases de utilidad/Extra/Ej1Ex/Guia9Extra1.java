package guia9.extra1;

import java.util.Scanner;

public class Guia9Extra1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

        String mesSecreto = meses[(int) (Math.random() * 12)];
        System.out.println(mesSecreto);
        String mesUsuario = "";
        do {
            System.out.println("Adivine el mes secreto");
            mesUsuario = sc.next();

        } while (!mesUsuario.equalsIgnoreCase(mesSecreto));

        if (mesUsuario.equalsIgnoreCase(mesSecreto)) {
            System.out.println("¡Has acertado!");
        }
    }

}
