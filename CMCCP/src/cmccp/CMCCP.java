/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cmccp;

/**
 *
 * @author mauricioguzman
 */
public class CMCCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double inf = Double.POSITIVE_INFINITY;
        double[][] A = new double [100][100];
        double [][] C={
            {0,8,5},
            {3,0,inf},
            {inf,2,0},
        };
        CMCPP(A,C,3);
        
    }
    
    public static void CMCPP(double[][]A, double[][]C, int n ){
        for (int i = 0; i < n; i++) {
            System.arraycopy(C[i], 0, A[i], 0, n);
        }
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if((A[i][k] + A[k][j])<A[i][j])
                        A[i][j] = A[i][k] + A[k][j];
                }
            }
            System.out.println("Matriz en la iteración " + (k + 1));
            for (int i = 0; i < n; i++) {
                System.out.print("[");
                for (int j = 0; j < n; j++) {
                    System.out.print(String.valueOf(A[i][j]).split("\\.")[0] +" ");
                }
                System.out.println("]");
            }
        }   
    }
}
