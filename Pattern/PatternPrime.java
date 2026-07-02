package practicecontrolflow;

public class PatternPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num =1;
		 for( int i=1; i<=5;i++) {
			 
			 for( int j =1; j<=5;j++) {
				 int count=0;
				 for( int k=1; k<=num; k++) {
					 if( num%k==0) {
						 count++;
					 }
				 }if( count==2) {
					 System.out.print(num+"\t");
				 }else {
					 System.out.print("X\t");
				 } num++;
				 
			 }System.out.println();
		 }
}
}