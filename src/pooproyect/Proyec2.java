/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyect;

import java.util.Scanner;

/**
 *
 * @author op181
 */
public class Proyec2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 121312321;
        while (opc !=4 ) {
            System.out.println("CALCULAR EL AREA DE LA SIGUENTES FIGURAS");
            System.out.println("1) CUADRADO");
            System.out.println("2) RECTANGULO");
            System.out.println("3) TRAPECIO");
            System.out.println("4) SALIR ");
            opc = sc.nextInt();            
            switch (opc) {
                case 1:
                    Cuadrado cu = new Cuadrado();
                    System.out.println("ingresa las coodenadas del P1, P2, P3, P4 ");
                    System.out.println("x & y ");
                    cu.setllenado(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    System.out.println(cu.Area());
                case 2:
                    Rectangulo re = new Rectangulo();
                    System.out.println("ingresa las coodenadas del P1, P2, P3, P4 ");
                    System.out.println("x & y ");
                    re.setllenado(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    System.out.println(re.Area());
                case 3:
                    Trapecio tr = new Trapecio();
                    System.out.println("ingresa las coodenadas del P1, P2, P3, P4 ");
                    System.out.println("x & y ");
                    tr.setllenado(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    System.out.println(tr.Area());
            }
        }
    }

}
