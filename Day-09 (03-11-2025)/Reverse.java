public class Reverse {
	public static void main(String[] args) {
		//String str = new String("Quick Brown Fox Jumps Over The Lazy Dog");
		//String str = "Quick Brown Fox Jumps Over The Lazy Dog";
		String str = "James Gosling";

		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
