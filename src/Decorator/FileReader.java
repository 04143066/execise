package Decorator;
/*
 *  ˼��: ��FileReader������close����������չ:
 *  	1.�̳У����Ƽ���������϶�̫�ߡ���������Ŀ����չ��
 *  	2.װ����ģʽ��
 *  	
 */
public class FileReader extends Reader{



	public void close() {
		
		System.out.println("FileReader closed");
	}

	
}
