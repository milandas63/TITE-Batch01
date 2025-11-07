public class NextChar {
	public static void main(String[] args) {
		String text = "TempleCity";
		char c;
		for(int i=0; i<text.length(); i++) {
			c = text.charAt(i);
			c = (char)(c+1);
			System.out.print(c);
		}
		System.out.println();
	}
}
