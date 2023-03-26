import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner ip = new Scanner(System.in);
		
		while (ip.hasNext()) {
			String input=ip.next();
            Stack<Character> stk=new Stack<>();
           for(char c : input.toCharArray()){
            if(!stk.isEmpty()){
                switch(c){
                    case ')':
                        if( stk.peek() == '(' ){
                            stk.pop();

                        }
                        break;
                    case '}':
                        if( stk.peek() == '{' ){
                            stk.pop();

                        }
                        break;
                    case ']':
                        if( stk.peek() == '[' ){
                            stk.pop();

                        }
                        break;
                    default:
                       stk.push(c);



                }

            }else{
                stk.push(c);
            }
        }

        System.out.println(stk.isEmpty());



           
		
	}
ip.close();
}
}



