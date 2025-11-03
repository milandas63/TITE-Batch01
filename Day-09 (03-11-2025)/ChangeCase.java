public class ChangeCase {
	public static void main(String[] args) {
		String str = "Quick Brown Fox Jumps Over The Lazy Dog";
		char c;
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			if(c>=65 && c<=90) {
				c = (char)(c+32);
			} else if(c>=97 && c<=122) {
				c = (char)(c-32);
			}
			System.out.print(c);
		}
		System.out.println();
	}
}
