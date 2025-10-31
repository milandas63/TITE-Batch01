class Example2 {
	public static void main() {
		System.out.println("Montha Cyclone");
	}

	public static void main(int[] args) {
		System.out.println(args.length);
	}

	//public static void main(int[] args) {
	//}

	public static void main(String[] args) {
		System.out.println("Length is: "+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		//main();
	}

	public static void myMain(String[] args) {
		System.out.println("Length is: "+args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		//main();
	}

	public static void myMain(String args) {
		System.out.println("Length is: "+args.length());
		System.out.println(args);
	}

}
