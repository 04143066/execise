
/*
 * ջ������ȳ�
 */

public class stack {
   //ջ���Դ洢���Ӧ�����͵�Ԫ��
   //ʹ������洢ջ
	Object[] elements;
	int index=-1;//ָ��ջ��Ԫ�ص�һ��֡
	//ջĬ�ϵĳ�ʼ��������10
	//constructor
	stack(){
		this(10);
	}
	
	stack(int max){
		elements = new Object[max];
	}
	
	//ջӦ�ö����ṩһ��ѹջ�ķ���
	public void push(Object element) throws stackOperationException{
		if(index<elements.length-1){
			index++;
			elements[index] = element;
		}	
		else
			throw new stackOperationException("ջ����");
	}
	//ջӦ�ö����ṩһ����ջ�ķ���
	public Object pop() throws stackOperationException{
		Object element=null;
		if(index>-1){
			element = elements[index];
			index--;			
		}
		else
			throw new stackOperationException("ջ�ѿ�");
		return element;
	}
}
