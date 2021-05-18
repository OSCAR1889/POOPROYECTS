/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproyect;

/**
 *
 * @author op181
 */
public class Rectangulo extends Cuadrilatero {

    double ax, bx, cx, dx, a1x, b1x, c1x, d1x, x, y;
    public int[][] pr = new int[4][2];
    private double area;

  

    public void setllenado(int ax,int a1x,int bx,int b1x,int cx,int c1x,int dx,int d1x) {
        pr[0][0] = ax;
        pr[0][1] = a1x;
        pr[1][0] = bx;
        pr[1][1] = b1x;
        pr[2][0] = cx;
        pr[2][1] = c1x;
        pr[3][0] = dx;
        pr[3][1] = d1x;
    }
    @Override
    public double Area() {
        x = (double) Math.sqrt(Math.pow((pr[0][0] - pr[1][0]), 2) + Math.pow((pr[1][0] - pr[1][1]), 2));
        y = (double) Math.sqrt(Math.pow((pr[1][0] - pr[2][0]), 2) + Math.pow((pr[1][1] - pr[2][1]), 2));
        return (this.area = (x * y));
    }

}
