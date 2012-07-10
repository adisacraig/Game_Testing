
import java.net.MalformedURLException;
import java.net.URL;

public class LinkCheck {
	public static void main(String[] args) {
		String surl = " ";
		 String s = "The link is http://www.google.com and its in the middle";
	        // separate input by spaces ( URLs don't have spaces )
	        String [] parts = s.split("\\s");

	        // Attempt to convert each item into an URL.   
	        for( String item : parts ) try {
	        	
	            URL url = new URL(item);
	            if(url.getRef() != null) {
	            	
	            }
	            else {
	            	surl = url.toString();
	            }
	        } catch (MalformedURLException e) {
	            
	        }	
	        System.out.println(surl);
	}

}
