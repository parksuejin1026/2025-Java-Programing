package ch05;

public class DeepCopy {

	public static void main(String[] args) {
		int a[] = {1,8,3};
		int b[] = a.clone();
		
		System.out.print("a Array : ");
		for ( int i = 0 ; i < a.length ; i++ )
			System.out.print(a[i] + " ");
		
		System.out.print("\nb Array : ");
		for ( int i = 0 ; i < b.length ; i++ )
			System.out.print(b[i] + " ");
		
		System.out.print("\n--------------------------------\n");
		b[0] = 10;
		System.out.print("a Array : ");
		for ( int i = 0 ; i < a.length ; i++ )
			System.out.print(a[i] + " ");
		
		System.out.print("\nb Array : ");
		for ( int i = 0 ; i < b.length ; i++ )
			System.out.print(b[i] + " ");
	}

}
