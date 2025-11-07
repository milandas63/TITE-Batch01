class Variable {
	public static void main(String[] args) {
		new Variable().main();
	}

	int distance;
	String country;
	int velocity;

	public void main() {
		System.out.println(country);
		{
			velocity = 255;
			country = "India";
			int x = 0;
			System.out.println(x);
		}
		System.out.println(distance);
		System.out.println(velocity);
		System.out.println(country);
	}
}
