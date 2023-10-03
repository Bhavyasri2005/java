import java.io.*;
public class MatrixMultiplication {
    public static void main(String args[]) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{4,4,4}};
        int c[][]=new int[3][3];
        int i,j;
        for(i=0;i<3;i++) {
            for(j=0;j<3;j++) {
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][j]+b[i][j];
                }
            }
        }
        System.out.println("The resultant matrix is : ");
        for(i=0;i<3;i++) {
            for(j=0;j<3;j++){
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}