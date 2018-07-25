import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		int l1,l2;
		int i,j;
		int count=0;
		int count1=0;
		System.out.println("enter string1");
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		System.out.println("enter string2");
		Scanner in1=new Scanner(System.in);
		s2=in1.nextLine();
		 l1=s1.length();
		l2=s2.length();
		
		char c1[]=new char[l1];
		char c2[]=new char[l2];
		if(l1==l2){
		for(i=0;i<l1;i++){
			c1[i]=s1.charAt(i);
			c2[i]=s2.charAt(i);
			}
			for(i=0;i<l1;i++){
				for(j=0;j<l2;j++){
					if(c1[i]==c2[j]){
						count++;
					}
				}
			}
			}
			if(count==l1){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
}
		}
