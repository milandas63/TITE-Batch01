import java.io.*;

public abstract class Required {
	public abstract int read();
}

class Another extends Required {
	public int read() {
		return 0;
	}
}

class ReadWrite {
	public static void main(String[] args) {
		int r;
		try {
			File f = new File("Excel-2019-basic-skills-complete-ebook.pdf");
			double len = f.length();
			double fivePc = 0.05 * len;
			double count = 0;
			FileInputStream fis = new FileInputStream("Excel-2019-basic-skills-complete-ebook.pdf");
			FileOutputStream fos = new FileOutputStream("Excel.pdf");
			while((r=fis.read()) != -1) {
				fos.write(r);
				count = count + 1;
				if(count>=fivePc) {
					count = 0;
					System.out.print(".");
				}
			}
			fos.close();
			fis.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}
}

class Wrapper {
	public static void main(String[] args) {
		boolean yn = true;
		Boolean yesNo = true;
		Boolean ok = new Boolean(true);
		Integer number = 500;
		int x = new Integer(10);
		System.out.println("yn: "+yn);
		System.out.println("yesNo: "+yesNo);
		System.out.println("ok: "+ok);
		System.out.println("number: "+number);
		System.out.println("x: "+x);

		String name = "Narendra Modi";
		System.out.println(name);
		name = "Mahatma Gandhi";
		System.out.println(name);
	}
}