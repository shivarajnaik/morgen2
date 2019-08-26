package testassignment;

public class SremoveAllSpace {

	public static void main(String[] args) {
		String str="     My        name is Shivaraj";
		char[] ch = str.toCharArray();
		System.out.println(str);
		 char[] strArray = str.toCharArray();  
	        StringBuffer stringBuffer = new StringBuffer();  
	        for (int i = 0; i < strArray.length; i++) {  
	            if ((strArray[i] != ' ') && (strArray[i] != ' ')) {  
	                stringBuffer.append(strArray[i]);  
	            }  
	        }  
	        String noSpaceStr2 = stringBuffer.toString();  
	        System.out.println(noSpaceStr2);  
	}

}
