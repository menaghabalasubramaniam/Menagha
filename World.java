import java.util.Scanner;
public class World {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
System.out.println("enter the string");
Scanner in=new Scanner(System.in);
str=in.nextLine();
int j,k;
int y=0;
int sum=0;
int d=0,p=0;
char a,b;
int count=0;
int count1=0;
int l=str.length();
int n[]=new int[20];
int m,q,i;
String s[]=str.split(" ");
for(q=0;q<s.length;q++){
char ch[]=s[q].toCharArray();
d=0;
for(i=0;i<ch.length;i++){
	a=ch[i];
	count=0;
	for(b='a';b<='z';b++){
		count++;
		if(a==b){
			count1=count;
			n[d]=count1;
				d++;
			}
	
	}
}
	m=ch.length;
	sum=0;
for(k=0;k<ch.length/2;k++){
	for(j=m-1;j>=m-1;j--){
y=n[k]-n[j];
if(y<0){
	y=-y;
}
sum=sum+y;
	}

m--;
}
	if(ch.length%2==1){
		sum=sum+n[ch.length/2];
	}
	System.out.println(sum);

	}
}
	}


