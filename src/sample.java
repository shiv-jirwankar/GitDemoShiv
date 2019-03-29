
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String oneScript="\"document.querySelector(";
        String twoScript=").scrollTop=";
        String cssValueOfWebElementToScroll="thisIsCssValue";
        String threeScript="\"";
        int scrollPixelValue=1000;
       // String afterScript=").scrollTop=1700\"";
        
        System.out.println(oneScript+"'"+cssValueOfWebElementToScroll+"'"+twoScript+scrollPixelValue+threeScript);
		
		/*String beforeScript="\"document.querySelector(";
        String afterScript=").scrollTop=1700\"";
        String cssValueOfWebElementToScroll="thisIsCssValue";
       
        System.out.println("\"Hello\"");
       
       System.out.println(beforeScript+"'"+cssValueOfWebElementToScroll+"'"+afterScript);*/
	}

}
