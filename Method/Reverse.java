package methods;

public class Reverse {
 public void re (long a) {
	 System.out.println(" Paramrterised without Return type");
	 long rev1=0;
	 while(a!=0) {
	 long digit=a%10;
	  rev1 = rev1*10+digit;
	  a=a/10;}
	 System.out.println(" Reverse"+rev1);}
	 
	
 long a1;
 public void re1() {
	 System.out.println("--------------------------------------");
	 System.out.println(" Non parameterised Without Return type");
	 long rev1=0;
	 while(a1!=0) {
		 long dig=a1%10;
		 rev1=rev1*10+dig;
		 a1=a1/10;
	 }System.out.println("Reverse "+rev1);
 }
 
	 public int re2(int a2) {
		 System.out.println("--------------------------------------");
		 System.out.println(" Parameterised With Return Type");
		 int rev2=0;
		 while( a2!=0) {
			 int dig=a2%10;
			 rev2=rev2*10+dig;
			 a2=a2/10;
		 }
		 return rev2;
	 }
	 
	 int a3;
	 public int re3(){
		 System.out.println("------------------");
		 System.out.println("Non- Parameterised With Return Type ");
		 int rev3=0;
		 while(a3!=0) {
			 int dig=a3%10;
			 rev3=rev3*10+dig;
			 a3=a3/10;
		 }
		 
	 
	 return rev3;	 
	 
	 }
 }

  

