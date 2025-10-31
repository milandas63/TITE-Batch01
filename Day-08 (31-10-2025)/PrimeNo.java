class PrimeNo {
	public static void main(String[] args) {
		int start = 2000;
		int end = 3000;
		int count = 0;
		boolean flag;
		for(int i=start; i<=end; i++) {
			flag = true;
			for(int j=2; j<i; j++) {
				//System.out.print("("+i+","+j+"),");
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(i+" ");
				count = count+1;
				if(count>=15) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
