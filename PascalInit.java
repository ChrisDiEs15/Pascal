/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pascal;

/**
 *
 * @author cdiaz
 */
 public class PascalInit {

        int tabla[][];

        public PascalInit(int numRows) {
            tabla = new int[numRows][];
            for (int i = 0; i < numRows; i++) {
                tabla[i] = new int[i + 1];
            }

        }
/*Setter*/
        public void Generar() {
            for (int j = 0; j < tabla.length; j++) {
                for (int k = 0; k <= j; k++) {
                    if (k == 0 || k == j) {
                        tabla[j][k] = 1;
                    } else {
                        tabla[j][k] = tabla[j - 1][k - 1] + tabla[j - 1][k];
                    }
                }
            }

        }
/*Getter*/
        public void Mostrar() {
            for (int i = 0; i < tabla.length; i++) {
                for (int j = 0; j < tabla[i].length; j++) {
                    System.out.println(tabla[i][j] + " ");
                }
                System.out.println("");
            }

        }
    }
