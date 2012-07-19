
public class PTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String loc = "5555,6777,6666,4433";
		String delims = "[,]+";
		
		String[] tokens = loc.split(delims);
		
		System.out.println(tokens[1]);

	}

}
