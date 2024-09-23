import java.util.*;
public class rough {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Input test cases");
	    int t = sc.nextInt();
	    while(t > 0){
	        String s = sc.next();
	        int q = 0;
	        int a = 0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i) == 'q'){
	                q++;
	            }
	            if(s.charAt(i) == 'a'){
	                a++;
	            }
	        }
	        if(q<=a){
	            if(s.charAt(s.length()) == 'q'){
	                System.out.print("NO"+" ");
	            }else{
	                System.out.print("YES"+" ");
	            }
	        }
	        t--;
	    }
        sc.close();
	}
}

