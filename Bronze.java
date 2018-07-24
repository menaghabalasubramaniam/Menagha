public class Bronze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,t=0;
		String y="",m="",b="";
		int min=0,count=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		String[] s=new String[n];
		int a[]=new int[100];
		for(i=0;i<n;i++){
			s[i]=in.next();
		}
		for(i=0;i<n;i++){
			a[t]=s[i].length();
			t++;
		}
		min=a[0];
		for(i=0;i<n;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		//System.out.println(min);
		for(i=1;i<=min;i++){
			count=0;
			y=s[0].substring(i-1,i);
			for(j=1;j<t;j++){
				m=s[j].substring(i-1,i);
				if(y.equals(m)){
					count++;
				}
			}
				if(count==n-1)
					b=b+y;
				else
					break;
		}
		System.out.println(b);
		
}
}
