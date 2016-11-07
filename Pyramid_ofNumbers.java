package vinod_day3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyramid_ofNumbers {
	
			public static void main(String[] args) {
				int j,j1;
				int n=0;
				Scanner in = new Scanner(System.in);

				System.out.println("Enter the N value to print Pyramid of numbers: ");
				
				try {
					n = in.nextInt();

					} catch (InputMismatchException e) {

					System.out.println("Exception Caught" + e);
					} 
				
				
				
				for (int i = 1; i <=n; i++) {
					
					
					for (j = 1; j <=i; j++) {
						/*for(int v=n-1;v>1;v--){
							System.out.print(" ");	
							}*/
						
					
					System.out.print(j+" ");
					

					}
					System.out.print(" ");
					
					for (j1 = i; j1 >=1; j1--) {
						if(i==1 && j1==1)
						{
							continue;
							
						}
						
						
					System.out.print(j1+" ");

					}
					System.out.println(" ");
					
					
					}
			for (int i = n; i >=1; i--) {
				
			for ( j = 1; j <=i; j++) {
				/*for(int v1=n-1;v1>1;v1--){
					System.out.print(" ");	
					}*/
			System.out.print(j+" ");

			}
			
			System.out.print(" ");
			for (j1 = i; j1 >=1; j1--) {
				for (j1 = i; j1 >=1; j1--) {
					if(i==1 && j1==1)
					{
						continue;
						
					}
			System.out.print(j1+" ");

			}
			System.out.println();

			}
			
			}

			}
	


}
