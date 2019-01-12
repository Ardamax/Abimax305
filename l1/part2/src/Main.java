
/**
 * A class to hold the main method.  Any class will do.  If you always
 * call it "Main," then you don't have to search when you want to run
 * the program.
 */
public class Main {
    /**
     * When you run "java main," this method is executed:
     */
    public static void main(String[] args) {
        TestCases tc = new TestCases();
        tc.runTests();
    	/*Point test = new Point(3, 4);
    	System.out.println(test.getRadius());
    	System.out.println(test.getAngle());
    	Point rotTest = test.rotate90();
    	System.out.printf("rotated: %d, %d\n", (int)rotTest.getX(), (int)rotTest.getY());*/
    }
}
