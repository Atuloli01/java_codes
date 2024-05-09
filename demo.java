
import java.util.*;

public class demo {
	
	public static void calc()
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		int diff = a- b;
		int mul = a * b;
		float div = a/b;
		System.out.println("The addition is "+ sum + ", The difference is " + diff + ", The product is " + mul);
		sc.close;
	}
	
	public static void Conditions(int age)
	{
		if(age > 18)
			System.out.println("Adult");
		else if(age > 14 && age < 18)
			System.out.println("Midway between both");
		else
			System.out.println("Child");
	}
	
	public static void Looping()
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print(" * ");
			System.out.print("\n");
		}
		
		int i = 0;
		while(i < 11)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public static void PatternPrinting()
	{
		/*
		 *   pattern 01 => *****
		 *   *****
		 *   *****
		 *   *****
		 *   *****
		 */
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)System.out.print("*");
			System.out.print("\n");
		}
		
		/*
		 * Pattern 02 => 
		 *    *
		 *   * *
		 *  * * *
		 */
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 0; j < 5-i; j++)
				System.out.print(" ");
			for(int j = 0; j < i; j++)
				System.out.print("* ");
			
			System.out.print("\n");
		}
		
		/*
		 *   pattern 03 =>
		 *   *****
		 *   *   *
		 *   *   *
		 *   *   *
		 *   *****
		 */
		 
		for(int i = 1; i <= 5; i++)
		{
			if(i==1 || i==5)
			{
				for(int j = 0; j < 5; j++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
			else
			{
				System.out.print("*   *\n");
			}
		}
	}
	
	// In Java by default; if no values are assigned then 
	// all the memory locations store :-
	// integer => 0
	// float => 0.0
	// double => 0.0
	// String => " "
	// unlike C++ that stores a garbage value if not mentioned otherwise
	
	public static void Arrays() {
		// type[] arrayName = new int[size];
		int[] marks = new int[3];
		for(int i = 0; i < 3; i++)
		{
			marks[i] = i + 50;
		}
		for(int i = 0; i < 3; i++)
			System.out.println(marks[i]);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] m = new int[n];
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			m[i] = x;
		}
		
		for(int i = 0; i < n; i++)
			System.out.println(m[i]);
	}
	
	public static void BinarySearch(int x, int[] arr, int sz)
	{
		int low = 0, high = sz-1;
		while(low < high)
		{
			int mid = (low + high)/2;
			if(arr[mid] == x)
			{
				System.out.println("The index at which the element is present is : "+mid);
				return;
			}
			else if(arr[mid] > x)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;    
			}
		}
	}
	
	public static void two_D_arrays() {
		// type[][] arrayName = new type[rows][columns];
		// int[][] arr = new int[3][5];
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				int x = sc.nextInt();
				arr[i][j] = x;
			}
		}
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
				System.out.print(arr[i][j] + " ");
			
			System.out.print("\n");
		}
	}
	
	public static void Strings() {
		String name = "Shri";
		String fullname = "Shri Singh";
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input);
		// String manipulations in Java
		
		/*
		String finalname = name + " " + fullname;
		System.out.println(finalname);
		for the size of the string => finalname.length();
		to access any specific character at a given position in Java => charAt(index);
		
		for(int i = 0; i < input.length(); i++)
		{
			System.out.println(input.charAt(i));
		}
		
		*/
		
		String p1 = "todo";
		String p2 = "hello";
		// s1 > s2 => +ive value
		// s1 == s2 => 0
		// s1 < s2 => -ive value
		
		if(p1.compareTo(p2) == 0)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings aren't equal");
		
		// why can't we use "==" symbol for comparing two strings
		// this is because in many scenarios this condition fails.
		/*
		 *   if(new String("Hello") == new String("Hello"))
		 *   {
		 *     System.out.print("Equal");
		 *   }
		 *   else
		 *     System.out.print("Not Equal");
		 */
		 // In the above scenario; the condition fails because in Java; Strings are Objects
		// When we declare two objects their memory allocation is always different. Two objects 
		// might contain certain attributes whose values can be same but they can never be equal.
		
		String sentence = "My name is Shri";
		// sentence.subtring(beginning_index, ending_index)
		p1 = sentence.substring(4);
		p2 = sentence.substring(3, 7);
		System.out.println(p1 + " " + p2);
		// Strings are immutable in Java and we cannot modify strings once declared
	}
	
	public static void calcFinalLength()
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		int finlength = s1.length() + s2.length() + s3.length();
		System.out.println("The total length is = " + finlength);
	}
	
	public static void replace()
	{
		String s = "resultresultresult";
		String snew = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'e')
				snew += 'i';
			else
				snew += s.charAt(i);
		}
		System.out.println(snew);
	}
	
	// Objects are created in Heap whereas variables / data members are created in a stack.
	
	public static void StringManipulations() {
		StringBuilder sb = new StringBuilder("Shrishti");
		System.out.println(sb);
		// character at given index => sb.charAt(index)
		for(int i = 0; i < sb.length(); i++)
		{
			if(sb.charAt(i) == 'h')
			   sb.setCharAt(i, 'a');
		}
		System.out.println(sb);
		// insert a character at a given index
		
		sb.insert(0,  'h');
		System.out.println(sb);
		
		// delete any given substring of a string
		// delete(start, end);
		// ending index is non-inclusive; i.e; [start, end) => [start, end-1]
		sb.delete(2, 5);
		System.out.println(sb);
		
		// append string at the end of the initial string
		sb.append("Singh");
		System.out.println(sb);
	}
	
	public static void reverse()
	{
		StringBuilder s = new StringBuilder("shrishti");
		String p = "";
		//Technique 1:-
		for(int i = s.length() - 1; i >= 0; i--)
			p += s.charAt(i);
		
		System.out.println(p);
		//Technique 2:-
		StringBuilder p2 = s;
		// toUpperCase, toLowerCase, trim, lastIndexOf, toString(), reverse()
		p2.reverse();
		System.out.println(p2);
		
		// Technique 3:-
		for(int i = 0; i < s.length()/2; i++)
		{
			int front = i, back = s.length() - 1 - i;
			char x = s.charAt(front), y = s.charAt(back);
			char temp = x;
			x = y;
			y = temp;
		}
		System.out.println(s);
	}
	
	// Data Structures in Java
	// Arrays => fixed size, contiguous memory locations to store data
	// ArrayList => LinkedList in C++ => non-contiguous form of storage of data
	// variable size
	 public static void arrayLists() {
		 ArrayList<Integer> lst = new ArrayList<Integer>();
		 // adding elements into the list
		 for(int i = 0; i < 10; i++)
			 lst.add(i);
		 
		 System.out.println(lst);
		 
		 // get elements at a given index 
		 int e = lst.get(3);
		 System.out.println(e);
		 
		 // setting a different element than the existing one in a List
		 lst.set(0, 5);
		 System.out.println(lst);
		 
		 // delete element 
		 lst.remove(4);
		 System.out.println(lst);
		 
		 // print size of the list
		 System.out.println(lst.size());
		 
		 // looping the ArrayList
		 for(int i = 0; i < lst.size(); i++)
			 System.out.println(lst.get(i));
		 
		 // sorting the list
		 Collections.sort(lst);
		 System.out.println(lst);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello There");
		String a = "Shrishti";
		System.out.println(a);
		/*
		Scanner sc = new Scanner(System.in);
		String newname = sc.next();
		// next() will take the input only till the first whitespace 
		// and will terminate later
		
		// nextInt() and nextFloat for taking input of the various types
		System.out.println(newname);
		calc();
		Conditions(19);
		Conditions(17);
		Conditions(12);
		Looping();
		PatternPrinting();
		Arrays();
		int[] arr = new int[4];
		int sz = 4;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++)
		{
			int x = sc.nextInt();
			arr[i] = x;
		}
		BinarySearch(4, arr, sz);
		*/
		//two_D_arrays();
		// Strings();
		replace();
		StringManipulations();
		reverse();
		arrayLists();
	}
}