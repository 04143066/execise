package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ�ض���ʱ��
 */
public class DateTest03 {

	public static void main(String[] argv){
		String strTime = "2008��08��08��  08:08:08 888";
		//��String����ת������������Date
		//String --> Date
		
		//1.�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss SSS");
		
		//���ַ���ת������������
		try {
			Date date = sdf.parse(strTime);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
