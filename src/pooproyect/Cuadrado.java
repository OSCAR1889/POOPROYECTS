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
public class Cuadrado extends Cuadrilatero {

    int ax, bx, cx, dx, a1x, b1x, c1x, d1x, x, y;
    public int[][] cr = new int[4][2];
    private double area;

    
    public void setllenado(int ax,int a1x,int bx,int b1x,int cx,int c1x,int dx,int d1x) {
      
        this.cr[0][0] = ax;
        this.cr[0][1] = a1x;
        this.cr[1][0] = bx;
        this.cr[1][1] = b1x;
        this.cr[2][0] = cx;
        this.cr[2][1] = c1x;
        this.cr[3][0] = dx;
        this.cr[3][1] = d1x;
    }

   
    @Override
    public double Area() {
        x = ((cr[0][0] * cr[1][1]) + (cr[1][0] * cr[2][1]) + (cr[2][0] * cr[3][1]) + (cr[3][0] * cr[0][1]));
        
        y = ((cr[0][0] * cr[3][1]) + (cr[3][0] * cr[2][1]) + (cr[2][0] * cr[1][1]) + (cr[1][0] * cr[0][1]));
        
        return (this.area = ((x- y))/2);
    }

}
