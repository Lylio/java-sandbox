package Hashcodes;

public class HashBrown {

	public static void main(String[] args) {
		
		String name1 = "Sam";
		String name2 = "Sam";
		String name3 = name2;

		System.out.println("name1 equals name2: " + name1.equals(name2));
		System.out.println("name1 HashCode is: " + name1.hashCode());
		System.out.println("name2 HashCode is: " + name2.hashCode());
		System.out.println("- - - - - - - - - - - - - - - - - - ");
		System.out.println("name3 equals name1: " + name3.equals(name1));
		System.out.println("name3 HashCode is: " + name3.hashCode());

	}

}
