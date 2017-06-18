package Enum;
/*
 * 需求:定义一个方法的作用是计算两个int类型的数据的商。
 * 如果计算成功则该方法返回1，如果执行失败则该方法返回0
 */
public class EnumTest01 {

	public static void main(String argv[]){
		int a=10,b=0;
		Result RetValue = divide(a,b);
		
		if(RetValue == Result.SUCCESS)
			System.out.println("成功");
		else if(RetValue ==Result.FAIL)
			System.out.println("失败");
		
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