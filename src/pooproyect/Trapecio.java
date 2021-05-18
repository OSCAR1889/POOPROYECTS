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
public class Trapecio extends Cuadrilatero {

    double ax, bx, cx, dx, a1x, b1x, c1x, d1x, x, y, z, zx, h, b, c;

    public int[][] tr = new int[4][2];
    private double area;

    public void setllenado(int ax, int a1x, int bx, int b1x, int cx, int c1x, int dx, int d1x) {
        tr[0][0] = ax;
        tr[0][1] = a1x;
        tr[1][0] = bx;
        tr[1][1] = b1x;
        tr[2][0] = cx;
        tr[2][1] = c1x;
        tr[3][0] = dx;
        tr[3][1] = d1x;
    }

    @Override
    public double Area() {
        x = (double) Math.sqrt(Math.pow((tr[0][0] - tr[1][0]), 2) + Math.pow((tr[0][1] - tr[1][1]), 2));
        y = (double) Math.sqrt(Math.pow((tr[1][0] - tr[2][0]), 2) + Math.pow((tr[1][1] - tr[2][1]), 2));
        z = (double) Math.sqrt(Math.pow((tr[2][0] - tr[3][0]), 2) + Math.pow((tr[2][1] - tr[3][1]), 2));
        zx = (double) Math.sqrt(Math.pow((tr[3][0] - tr[0][0]), 2) + Math.pow((tr[3][1] - tr[0][1]), 2));

        if (x == z) {
            if (y > zx) {
            h = (y - zx) / 2;
            c = (double) Math.sqrt(Math.pow(x, 2) - Math.pow(h, 2));
            System.out.println(c);
            b = (((y + zx) * c) / 2);

        }
            if (zx > y) {
            h = (zx - y) / 2;
            c = (double) Math.sqrt(Math.pow(x, 2) - Math.pow(h, 2));
            System.out.println(c);
            b = (((y + zx) * c) / 2);

        }
        }
        if (y == zx) {
            if (z > x) {
                h = (z - x) / 2;
                c = (double) Math.sqrt(Math.pow(y, 2) - Math.pow(h, 2));
                System.out.println(c);
                b = (((z + x) * c) / 2);

            }
            if (x > z) {
                h = (x - z) / 2;
                c = (double) Math.sqrt(Math.pow(y, 2) - Math.pow(h, 2));
                System.out.println(c);
                b = (((z + x) * c) / 2);

            }
        }

        //x = ((cr[0][0] * cr[1][1]) + (cr[1][0] * cr[2][1]) + (cr[2][0] * cr[3][1]) + (cr[3][0] * cr[0][1]));
        //y = (-(cr[0][0] * cr[3][1]) + (cr[3][0] * cr[2][1]) + (cr[2][0] * cr[1][1]) + (cr[1][0] * cr[0][1]));
        return (this.area = b);
    }

}
