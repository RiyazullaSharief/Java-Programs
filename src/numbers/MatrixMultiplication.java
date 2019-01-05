package numbers;
import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		int i,j,k,m1,n1,m2,n2;
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
 
        @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
 
        System.out.println("Enter the Order/Rows and Columns of First Matrix");
        m1=scan.nextInt();
        n1=scan.nextInt();
 
        System.out.println("Enter Elements of First Matrix");
 
        //Input first matrix from user
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
 
        System.out.println("Enter the Order/Rows and Columns of Second Matrix");
        m2=scan.nextInt();
        n2=scan.nextInt();
 
        System.out.println("Enter Elements of Second Matrix");
 
        //Input second matrix from user
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
            {
                b[i][j]=scan.nextInt();
            }
        }
 
        //Multiplying two matrices
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n1;j++)
            {
                for(k=0;k<n2;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
 
        //Printing Product Matrix
        System.out.println("Product Matrix");
        for(i=0;i<m1;i++)
        {
            for(j=0;j<n2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
	}
}
