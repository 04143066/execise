
public class stackTest {
	public static void main(String argv[]){
		stack s = new stack();
		
		User u1 = new User("Jack1",20);
		User u2 = new User("Jack2",21);
		User u3 = new User("Jack3",22);
		User u4 = new User("Jack4",23);
		User u5 = new User("Jack5",24);
		try {
			s.push(u1);
			s.push(u2);
			s.push(u3);
			s.push(u4);
			s.push(u5);
		} catch (stackOperationException e) {
			e.printStackTrace();
		}
		
		
		try {
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
		} catch (stackOperationException e) {
			e.printStackTrace();
		}
		
	}
}

class User{
	String name;
	int age;
	
	User(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	public String toString(){
		return "User[name="+name+",age="+age+"]";
	}
}