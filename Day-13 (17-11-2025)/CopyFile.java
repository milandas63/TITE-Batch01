import java.io.*;

class CopyFile {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("classes.txt");
		FileOutputStream fos = new FileOutputStream("c.txt");

		long count = 0;
		File f = new File("classes.txt");
		long size = f.length();
		double fivePc = 0.05 * size;

		int each;
		while( (each=fis.read()) != -1 ) {
			fos.write(each);
			count++;
			if(count>=fivePc) {
				count = 0;
				System.out.print(".");
			}
		}

		fos.close();
		fis.close();
	}
}
