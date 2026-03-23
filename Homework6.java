// Student name: Taranveer Singh

package Main;

public class Homework6{
	public static void main(String[] args){
		Arithmetic ar = new Arithmetic(1,2);
		System.out.println(ar.toString());
		System.out.println(ar.add());
		System.out.println(ar.subtract());
		System.out.println(ar.multiply());
		System.out.println(ar.divide());
		System.out.println(ar.modulo());
		ar.changeValues(2,3);
		System.out.println(ar.toString());
		System.out.println(ar.add());
		System.out.println(ar.subtract());
		System.out.println(ar.multiply());
		System.out.println(ar.divide());
		System.out.println(ar.modulo());
		
		System.out.println(Arithmetic.staticAdd(3,4));
	}
	
}
