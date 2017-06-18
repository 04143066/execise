
/*
 * 栈：后进先出
 */

public class stack {
   //栈可以存储多个应用类型的元素
   //使用数组存储栈
	Object[] elements;
	int index=-1;//指定栈顶元素的一个帧
	//栈默认的初始化容量是10
	//constructor
	stack(){
		this(10);
	}
	
	stack(int max){
		elements = new Object[max];
	}
	
	//栈应该对外提供一个压栈的方法
	public void push(Object element) throws stackOperationException{
		if(index<elements.length-1){
			index++;
			elements[index] = element;
		}	
		else
			throw new stackOperationException("栈已满");
	}
	//栈应该对外提供一个弹栈的方法
	public Object pop() throws stackOperationException{
		Object element=null;
		if(index>-1){
			element = elements[index];
			index--;			
		}
		else
			throw new stackOperationException("栈已空");
		return element;
	}
}
