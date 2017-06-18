package Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ����
 */
public class DateTest05 {

	public static void main(String argv[]){
		
		//��ȡϵͳ��ǰ������
		
		Calendar c = Calendar.getInstance();
		
		//�鿴��ǰ���������ڼ�
		int i = c.get(Calendar.DAY_OF_WEEK);
		int j = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		System.out.println(j);
		
		//��ȡ2008�� 8 8 �����ڼ�
		String strTime = "2008,08,08";
		try {
			Date d = new SimpleDateFormat("yyyy,mm,dd").parse(strTime);
			
			//����������2008 8 8 ��������
			c.setTime(d);
			
			System.out.println(c.get(Calendar.DAY_OF_WEEK));
			System.out.println(c.get(Calendar.DAY_OF_MONTH));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
