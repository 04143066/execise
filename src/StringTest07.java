/*
 * ������ʽ
 * 		1.������ʽ��һ�Ŷ�����ѧ��
 * 		2.������ʽ��һ���ַ�ģ�͡�ר�����ַ�����ʽƥ��
 * 		3.������ʽ��ͨ�õ�
 * 
 * 		���磺������ʽ��^a[2]$�� ��ʾ����a�ַ�����ͬ�ڡ�aa��
 * 
 * 		\d ����
 * 		\D ������
 *      \w Ӣ����ĸ
 *      \W ��Ӣ����ĸ
 */
public class StringTest07 {

	public static void main(String argv[]){
		
		System.out.println("aa".matches("^a{2}$"));
		System.out.println("ab".matches("^a{2}$"));
		
		String s1 = "asdd33dfsdaf33dsd55fdd3dssf4343sdf455ddsdddh565gggh55ddhg";
		
		//��dd�滻Ϊ���С�
		System.out.println(s1.replaceAll("dd", "��"));
		
		//��dd�滻��"��"
		System.out.println(s1.replaceAll("d{2}", "��"));
		
		//�����ֻ��ɡ��С�
		System.out.println(s1.replaceAll("\\d", "��"));//java��һ��"/"�����⺬�壬������//���������һ����/��
		
		//���������滻�ɡ��С�
		System.out.println(s1.replaceAll("\\D", "��"));
	}
}
