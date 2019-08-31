package programming.question;

public class ReverseString {

	public String reverseIterative(String str){
		
		StringBuffer sb = new StringBuffer(str);
		int strLength = sb.length();
		for(int i = 0; i < (strLength / 2); i++){
			char c = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(strLength - (i + 1)));
			sb.setCharAt(strLength - (i + 1), c);
		}
		return sb.toString();
	}
	
	public String reverseRecursive(String str){
		
		if(str.length() < 2){
			return str;
		}
		return reverseRecursive(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String args[]){
		ReverseString rs = new ReverseString();
		String s = new String("hello");
		System.out.println(rs.reverseIterative(s));
	}
}
