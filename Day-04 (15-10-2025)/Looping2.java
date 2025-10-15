
public class Looping2 {
	public static void main(String[] args) {
        int num = 25;
        for(;;) {
            System.out.println("Hello World!");
            num = num-1;
            if(num<=20) {
                break;
            }
        }
        System.out.println();
        num = 25;
        boolean yesNo = true;
        for(;yesNo;) {
            System.out.println("Hello World!");
            num = num-1;
            if(num<=20) {
                yesNo = false;
            }
        }

        System.out.println();
        do {
            System.out.println("Print Something");
        } while(false);

	}
}
