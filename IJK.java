public class IJK{
public static void main(String[] args) {
int n,i,j,k,count=0;
System.out.println("Enter the number");
Scanner in=new Scanner(System.in);
n=in.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++){
	a[i]=in.nextInt();
}

for(i=0;i<n-2;i++){
	for(j=i+1;j<n-1;j++){
			if(a[i]>a[j]){
				continue;
			}
			for(k=j+1;k<n;k++){
					if(a[i]<a[j] && a[j]<a[k]){
						count++;
		}
		}
	}
}
System.out.println(count);
	}

}
