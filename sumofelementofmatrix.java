// a program to add all the elements in the 2d array
import java.io.*;
import java.util.*;
class sumofelementofmatrix
    {
        public void main()
        {
            
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[][]= new int [m][n];
            for(int i = 0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                arr[i][j]= sc.nextInt();
            }
        }
            int sum = 0;
            for(int i = 0;i<m;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    sum = sum +arr[i][j];
                }
                
            }
            System.out.println(sum);
        }
    }
            
            