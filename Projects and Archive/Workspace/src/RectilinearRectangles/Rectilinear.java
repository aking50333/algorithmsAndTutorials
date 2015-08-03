package RectilinearRectangles;

/**
 * Created by Ruben on 6/22/2015.
 */
public class Rectilinear {


    public static void main(String[] args) {

        int A = 1;
        int B = 2;
        int C = 5;
        int D = 6;
        int E = 3;
        int F = 4;
        int G = 7;
        int H = 8;

        System.out.println(rectArea(A, B, C, D, E, F, G, H));
    }

    public static int rectArea(int A, int B, int C, int D, int E, int F, int G, int H){

        if (C < E || G < A)
            return (C-A)*(D-B) + (G-E)*(H-F);
        if (D < F || H < B)
            return (C-A)*(D-B) + (G-E)*(H-F);


        int leftBottom = Math.max(A, E);
        int rightBottom = Math.min(C, G);
        int bottomLeft = Math.max(B, F);
        int topLeft = Math.min(D, H);

        return (C-A)*(D-B) + (G-E)*(H-F) - (rightBottom - leftBottom)*(topLeft - bottomLeft);



    }
}
