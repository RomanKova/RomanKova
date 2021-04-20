public class Tutorial7Demo {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		s1.push(40);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		
		Stack<String> s2 = new Stack<>('A');
		
		s2.push("Ten");
		s2.push("Twenty");
		s2.push("Thirty");
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		s2.push("Forty");
		System.out.println(s2.pop());
		System.out.println(s2.pop());
	}
}
