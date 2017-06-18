/*
 * 使用String的时候我们注意的问题：
 * 	 尽量不要做字符串的频繁拼接操作。因为字符串一旦创建对象不可改变，只要频繁的拼接，
 *   就会在字符串常量池中创建大量的字符串，给垃圾回收带来问题。 
 */
public class StringTest04 {
	
	public static void main(String argv[]){
	
		String[] ins = {"sport","music","food","sleep"};
		//要求将上面的兴趣爱好拼接成一个字符串"sport,music,food,sleep"
		String temp = "";
		for(int i=0; i<ins.length; i++){
			if(i==ins.length-1)
				temp += ins[i];
			else
				temp += ins[i] + ",";
		}
		System.out.println(temp);
	}
}
