
public class Looping {
	public static void main(String args) {
		
	}
	public static void main(int args) {
		
	}
	public static void main(String[][] args) {
		
	}

	public static void main(String[] args) {
		for(String k:args) {
			System.out.println(k);
		}
		for(int i=0; i<10; i++) {
			System.out.println("Hello World! "+i);
		}
		System.out.println();
		
		int x[] = {101,201,301,401,501,601,701,801};
		for(int i:x) {
			System.out.println(i);
		}
		System.out.println();
		for(int i=x.length-1; i>=0; i--) {
			System.out.println(x[i]);
		}
		
		String name = "TempleCity Institute of Technology and Engineering";
		System.out.println(name.length());
		System.out.println();
		System.out.println();
		
		String students[][] = {
				{"Omm Prasad Mohapatra","Diploma"},
				{"Badal Santa","Diploma"}
		};
		for(String[] y:students) {
			System.out.println();
			for(String k:y) {
				System.out.print(k+", ");
			}
		}
		
		
		String city0[][][];
		String[] city1[][];
		String[][] city3[];
		String[][][] city4;
	}

}
