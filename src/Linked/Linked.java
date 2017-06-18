package Linked;

public class Linked {

	Entry entry,H;
	
	Linked(){
		H = new Entry(null,null);
		entry = H;
	}
	
	static class Entry{
		Object data;
		Entry next;
		
		Entry(Object data,Entry next){
			this.data = data;
			this.next = next;
		}	
	}
	
	void add(Object data){
		Entry e = new Entry(data,null);
		entry.next = e;
		entry = e;
	}
	
	void remove(Object data){
		Entry e = H;
		while(e.next != null){
			if(e.next.data.equals(data)){
				e.next = e.next.next;
			}
			e = e.next;		
		}
	}
	
	void output(Entry e){
		while(e.next != null){
			e = e.next;
			System.out.println(e.data);		
		}
	}
	
	public static void main(String argv[]){
		Linked l = new Linked();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add("love");
		l.add(4);
		l.remove(1);
		l.output(l.H);
	}
}
