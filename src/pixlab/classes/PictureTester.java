package pixlab.classes;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\beach.jpg");
	
		beach.zeroBlue();
		beach.explore();
	}

	public static void testOnlyBlue() {
		Picture beach = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\beach.jpg");
		beach.keepOnlyBlue();
		beach.explore();

	}
	public static void testKeepOnlyRed() {
		Picture beach = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\beach.jpg");
		beach.keepOnlyRed();
		beach.explore();
	}
	public static void testKeepOnlyGreen() {
		Picture beach = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\beach.jpg");
		beach.keepOnlyGreen();
		beach.explore();
	}

	public static void testNegate() {
		Picture beach = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\beach.jpg");
		beach.negate();
		beach.explore();
	}

	public static void testGrayScale() {
		Picture beach = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\beach.jpg");
		beach.grayscale();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\caterpillar.jpg");
		
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}
	public static void testMirrorVerticalRightToLeft() {
		Picture caterpillar = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\caterpillar.jpg");
		
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}
	public static void testMirrorHorizontal() {
		Picture caterpillar = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\caterpillar.jpg");
		
		caterpillar.mirrorHorizontal();
		caterpillar.explore();
	}
	public static void testMirrorHorizontalBotToTops() {
		Picture caterpillar = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\caterpillar.jpg");
		
		caterpillar.mirrorHorizontalBotToTop();
		caterpillar.explore();
	}
	
	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testFixUnderwater() {
		Picture water = new Picture("C:\\Users\\kimballcraigj\\git\\APCSA\\src\\pixlab\\images\\water.jpg");
		water.fixUnderwater();
		water.explore();
	}
	
	

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		
		testZeroBlue();
		testOnlyBlue();
		testNegate();
		testGrayScale();
		testKeepOnlyRed();
		testKeepOnlyGreen();
		testFixUnderwater();
		testMirrorVertical();
		testMirrorVerticalRightToLeft();
		testMirrorHorizontal();
		testMirrorHorizontalBotToTops();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}

	
}