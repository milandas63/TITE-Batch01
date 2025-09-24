
public class MultipleHello {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("Hello World!");
		}
		System.out.println("        *");
		System.out.println("       ***");
		System.out.println("      *****");
		System.out.println("     *******");
		System.out.println("    *********");
		System.out.println("   ***********");
		System.out.println("  *************");
		System.out.println(" ***************");
		System.out.println("*****************");
		System.out.println("");
		System.out.println();
		
		int spaces = 15;
		int stars = 1;
		for(int i=0; i<10; i++) {
			for(int j=0; j<spaces; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			spaces = spaces-1;
			stars = stars+2;
		}
		System.out.println();
		System.out.println();

		spaces = 15;
		stars = 1;
		for(int i=0; i<19; i++) {
			for(int j=0; j<spaces; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<9) {
				spaces = spaces-1;
				stars = stars+2;
			} else {
				spaces = spaces+1;
				stars = stars-2;
			}
		}
		System.out.println();
		System.out.println();
		
		spaces = 15;
		for(int i=1; i<=9; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=1; j<=i; j++) System.out.print(j);
			for(int j=i-1; j>=1; j--) System.out.print(j);
			System.out.println();
			spaces--;
		}

		System.out.println();
		System.out.println();
		
		spaces = 15;
		stars = 1;
		for(int i=0; i<=9; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++) {
				if(j==0 || j==stars-1 || i==9) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			spaces--; stars+=2;
		}

	}
}
