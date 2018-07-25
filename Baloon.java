import java.util.Scanner;
public class Baloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1;
String s2;
int i,j,k=0;
char c[]=new char[100];
Scanner in=new Scanner(System.in);
System.out.println("Enter the string s1");
s1=in.nextLine();
System.out.println("Enter the string s2");
s2=in.nextLine();
int l2=s2.length();
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();
for(i=0;i<c1.length;i++){
	if(c1[i]==c2[i]){
		 c[k]=c1[i];
		 k++;
	}
	}
int y=l2-k;
System.out.println(y);
	}
}
