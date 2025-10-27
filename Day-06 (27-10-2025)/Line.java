class Line {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("------------------------------------");
        drawLine("*",50);
        drawPyramid();
    }

    public static void drawLine(String whichChar, int howMany) {
        for(int i=0; i<howMany; i++) {
            System.out.print(whichChar);
        }
    }

    public static void drawPyramid() {
        /*
            Block comment:
            Anything that is written here
            is treated as comment

                    *
                   ***
                  *****
                 *******
                *********
               ***********
              *************
             ***************
            *****************
        */
		int spaces = 20;
		int stars = 1;
		System.out.println();
		for(int i=0; i<10; i++) {
			drawLine(" ",spaces);
			drawLine("*",stars);
			System.out.println();
			spaces = spaces-1;
			stars = stars+2;
		}
		System.out.println();
		System.out.println();
		System.out.println();

		spaces = 20;
		stars = 1;
		System.out.println();
		for(int i=0; i<21; i++) {
			drawLine(" ",spaces);
			drawLine("*",stars);
			System.out.println();
			if(i<10) {
				spaces = spaces-1;
				stars = stars+2;
			} else {
				spaces = spaces+1;
				stars = stars-2;
			}
		}

	}

}
