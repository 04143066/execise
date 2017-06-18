package Decorator;
//使用BufferedReader 对FileReader中的close方法进行扩展
//1.装饰者模式中要求：装饰中含有被装饰者的引用
//2.装饰者模式中要求：装饰者和被装饰者应该实现同一个类型（接口）
public class BufferedReader extends Reader{ //BufferedReader 装饰者
	//关联关系
	//FileReader reader;//FileReader就是被装饰
	Reader reader;//继承之后就可以只写Reader就好,BufferedReader 和 FileReader 的关系就不大了
	//Constructor
	//BufferedReader(FileReader reader){
	BufferedReader(Reader reader){//Reader reader = new FileReader()
		this.reader = reader;
	}
	
	//对FileReader中的close方法进行扩展
	public void close(){
		System.out.println("扩展代码1");
		reader.close();
		System.out.println("扩展代码2");
	}
}
