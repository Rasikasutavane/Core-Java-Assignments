package methods;

public class Prime {
public void p1(int a) {
	System.out.println(" Parameterized, No Return");
	int count=0;
	for( int i=1;i<=a;i++) {
		if( a%i==0) {
			count++;
		}
	}if( count==2) {
		System.out.println(" Prime "+a);
	}
	else {
		System.out.println(" Not prime"+a);
	}
}
int b;
public void p2() {
	System.out.println("---------------------------");
	System.out.println(" Non-Parameterized, No Return");
	int count=0;
	for( int i=1;i<=b;i++) {
		if( b%i==0) {
			count++;
		}
	}if( count==2) {
		System.out.println(" Prime "+b);
	}
	else {
		System.out.println(" Not prime"+b);
	}
}
int c;
public String p3() {
	System.out.println("--------------------------------");
	System.out.println(" Non-Parameterized, Return");
	int count=0;
			for( int i=1;i<=c;i++) {
				if( c%i==0) {
					count++;
				}
			}
	if( count==2 ) { 
	return "is prime ";}
	else {
		return " not prime";
	}
	}

public String p4(int d) {
	System.out.println("--------------------------------");
	System.out.println("Parameterized, Return");
	int count=0;
	for( int i=1;i<=c;i++) {
		if( d%i==0) {
			count++;
		}
	}
if( count==2 ) { 
return "is prime ";}
else {
return " not prime";
}
}}
