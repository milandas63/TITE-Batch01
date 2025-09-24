
public class MTables {
	public static void main(String[] args) {
		int start = 2;
		int end = 45;

		for(int k=start; k<=end; k+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=k; j<=(k+4); j++) {
					if(j>end) break;
					System.out.print(justifyRight(j,2)+" x "+justifyRight(i,2)+" = "+justifyRight((i*j),3) + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static String justifyRight(int n, int w) {
		String buf = ""+n;
		for(int i=buf.length(); i<w; i++) buf = " "+buf;
		return buf;
	}
}
