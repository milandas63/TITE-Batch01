/*
	Call one class another class by object reference
*/
class Example3 {
	public static void main(String[] args) {
		String[] names = {"India","Srilanka","Bangladesh"};
		Example2 e2 = new Example2();
		e2.main(names);
	}
}
