class Tables {
	public static void main(String[] args) {
		int begin = 2;
		int end = 12;
		for(int i=begin; i<=end; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(rightJustify(i,2)+" x "+rightJustify(j,2)+" = "+rightJustify((i*j),3));
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();

		for(int h=begin; h<=end; h+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=h; j<=(h+4); j++) {
					System.out.print(rightJustify(j,2)+" x "+rightJustify(i,2)+" = "+rightJustify((i*j),3)+"  ");
					if(j>=end) break;
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static String rightJustify(int n, int w) {
		String res = ""+n;
		for(int i=res.length(); i<w; i++) {
			res = " "+res;
		}
		return res;
	}
}
