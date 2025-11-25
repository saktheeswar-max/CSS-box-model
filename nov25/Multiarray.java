package nov25;
import java.util.Scanner;
import java.util.Arrays;
public class Multiarray {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the number of row :");
		int a= scan.nextInt();
		System.out.print("enter the number of column :");
		int b=scan.nextInt();
		int[][] arr=new int[a][b];
		
		for(int i =0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print("enter the value arr"+i+j+":");
				arr[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("2D Array contents:");
        System.out.println(Arrays.deepToString(arr));
	}

}
