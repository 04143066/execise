/*
 * 正则表达式
 * 		1.正则表达式是一门独立的学科
 * 		2.正则表达式是一种字符模型。专门做字符串格式匹配
 * 		3.正则表达式是通用的
 * 
 * 		例如：正则表达式“^a[2]$” 表示两个a字符，等同于“aa”
 * 
 * 		\d 数字
 * 		\D 非数字
 *      \w 英文字母
 *      \W 非英文字母
 */
public class StringTest07 {

	public static void main(String argv[]){
		
		System.out.println("aa".matches("^a{2}$"));
		System.out.println("ab".matches("^a{2}$"));
		
		String s1 = "asdd33dfsdaf33dsd55fdd3dssf4343sdf455ddsdddh565gggh55ddhg";
		
		//将dd替换为“中”
		System.out.println(s1.replaceAll("dd", "中"));
		
		//将dd替换成"中"
		System.out.println(s1.replaceAll("d{2}", "中"));
		
		//将数字换成“中”
		System.out.println(s1.replaceAll("\\d", "中"));//java中一个"/"有特殊含义，两个“//”这里代表一个“/”
		
		//将非数字替换成“中”
		System.out.println(s1.replaceAll("\\D", "中"));
	}
}
