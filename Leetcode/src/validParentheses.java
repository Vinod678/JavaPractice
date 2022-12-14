import java.util.Stack;

class validParentheses{

public static boolean isValid(String s) {
	
	/*Stack */
	Stack<Character> st = new Stack<Character>();
	
	
	for (char each : s.toCharArray()) {
		if(each=='(' || each=='[' || each=='{') {
			st.push(each);
			
		}
		else {
			
			if(st.isEmpty()) 
				return false;
			
			char ch = st.pop();
			
			if( (ch=='(' && each==')') || (ch=='[' && each==']') || (ch=='{' && each=='}')) 
					continue;
			
			else return false;
		}
	}
	return st.isEmpty();
	
}
	
public static void main(String[] args) {
	
	String s = "()[]{}";
			
	if(isValid(s)==true)  
		System.out.println("true");
	
	else
		System.out.println("false");
	
			
}

}