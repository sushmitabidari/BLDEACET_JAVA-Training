package TrainingCodes;
import java.util.Scanner;
public class UniversalBatch1 {
	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		System.out.println("enter the value of n:");
		int n=Sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0  && i>0 && i!=6 && i!=7 && i!=8 && i!=9
						||j==(n-1) && i!=1 && i!=2  && i!=3 && i!=4 &&  i!=(n-1)
						|| i==0 && j!=0 || i==(n/2) || i==(n-1) && j<(n-1)){
				
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			
			System.out.print("  ");
			for(int j=0; j<n; j++) {
				if(j==0 && i!=(n-1)|| i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!=(n-1)) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.print("  ");
			for(int j=0; j<n; j++) {
					if(j==0  && i>0 && i!=6 && i!=7 && i!=8 && i!=9
							||j==(n-1) && i!=1 && i!=2  && i!=3 && i!=4 &&  i!=(n-1)
							|| i==0 && j!=0 || i==(n/2) || i==(n-1) && j<(n-1)){
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
			System.out.print("  ");
			for(int j=0; j<n; j++) {
					if(j==0 || j==(n-1) || i==(n/2)){
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
			System.out.println();
		}
	}

}
