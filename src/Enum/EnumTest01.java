package Enum;
/*
 * ����:����һ�������������Ǽ�������int���͵����ݵ��̡�
 * �������ɹ���÷�������1�����ִ��ʧ����÷�������0
 */
public class EnumTest01 {

	public static void main(String argv[]){
		int a=10,b=0;
		Result RetValue = divide(a,b);
		
		if(RetValue == Result.SUCCESS)
			System.out.println("�ɹ�");
		else if(RetValue ==Result.FAIL)
			System.out.println("ʧ��");
		
	}
	
	public static Result divide(int a,int b){
		try{
			int c = a/b;
			return Result.SUCCESS;
		}catch(Exception e){
			return Result.FAIL;
		}
	}
}


enum Result{
	SUCCESS,FAIL
}