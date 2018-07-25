import java.util.Scanner;
public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,temp;
System.out.println("enter the size");
Scanner in=new Scanner(System.in);
n=in.nextInt();
int []a=new int[n];
for(i=0;i<n;i++){
	System.out.print(a[i]+",");
}
for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		if(a[i]>a[j]){
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
}
	System.out.println("the desending order is");
	for(i=0;i<n;i++){
		System.out.println(a[i]);
	}

	}
	}
