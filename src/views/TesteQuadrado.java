package views;

import model.Quadrado;

import java.util.Scanner;

public class TesteQuadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        System.out.println("Digite o lado1");
        quadrado.lado1 = ler.nextInt();

        System.out.println(quadrado.mostrarDados());
    }

}
