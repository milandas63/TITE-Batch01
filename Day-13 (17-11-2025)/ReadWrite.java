import java.util.*;

public class ReadWrite {
	Scanner scan;

	public ReadWrite() {
		scan = new Scanner(System.in);
		boolean more = true;
		String name;
		while(more) {
			System.out.print("Enter your name? ");
			name = scan.nextLine();
			System.out.println("Hello "+name);
			System.out.println();
			System.out.print("More [Y/N]: ");
			more = scan.nextLine().startsWith("Y");
		}
	}

	public static void main(String[] args) {
		new ReadWrite();
	}
}
