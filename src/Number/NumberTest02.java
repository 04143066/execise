package Number;
import java.math.BigDecimal;

/*
 * java.math.BigDecimal;
 * �����͵����ݾ�ȷ�ȼ��ߣ��ʺ����������
 * ���������Double�ľ���̫��
 */
public class NumberTest02 {

	public static void main(String argv[]){
		//����������
		BigDecimal v1 = new BigDecimal(10);
		BigDecimal v2 = new BigDecimal(20);
		
		//���ӷ�����
		BigDecimal v3 = v1.add(v2);
		System.out.println(v3);
	}
}
