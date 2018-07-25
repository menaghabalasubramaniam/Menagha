import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j;
		System.out.println("enter the size");
		Scanner in= new Scanner(System.in);
n=in.nextInt();
System.out.println("enter the nums");
int count1=0;
int a[]=new int[n];
for(i=0;i<n;i++){
	a[i]=in.nextInt();
}
for(i=0;i<n;i++){
	int count=0;
	for(j=i;j<n;j++){
		if(a[i]==a[j]){
			count++;
		}
	}
	if(count>1){
		
	System.out.print(a[i]+" ");
	}		
		
	}
		
	
}
	

	}

