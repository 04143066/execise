package Number;
import java.text.DecimalFormat;

/*
 * �������ָ�ʽ��:
 * 	java.text.DecimalFormat��
 *  ���ָ�ʽԪ�أ�
 *  	#  ��������
 *  	��     ǧ��λ
 *  	.  С����
 *  	0  ��������
 */
public class NumberTest01 {

	public static void main(String[] args){
		//�������ָ�ʽ����
		//���󣺼���ǧ��λ
		DecimalFormat df = new DecimalFormat("###,###");
		
		//��ʼ��ʽ��
		//Number -->String
		System.out.println(df.format(1234567));
		
		//���󣺼���ǧ��λ  ������λС��
		DecimalFormat df1 = new DecimalFormat("###,###.##");
		System.out.println(df1.format(1234567.123));
		
		//���󣺼���ǧ��λ  ������λС��  ��������
		DecimalFormat df2 = new DecimalFormat("###,###.0000");
		System.out.println(df2.format(1234567.123));
	}
}
