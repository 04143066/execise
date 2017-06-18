package IO;

import java.io.*;

/*
 * java.io.DataOutputStream; 数据字节输出流
 * 可以将内存中的“int i = 10” 写进去的不是字符串，是二进制数据，带类型写进去的
 */
public class DataOutputStreamTest01 {

	public static void main(String[] args) throws Exception {
		//创建数据字节输出流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\我的java程序\\动力节点\\src\\IO\\temp05"));
		
		//准备数据
		byte b = 10;
		short s = 11;
		int i = 12;
		long l = 1000L;
		float f = 3.2f;
		double d = 2.3;
		boolean flag = false;
		char c = 'a';
		
		//写
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		
		//刷新
		dos.flush();
		
		//关闭
		dos.close();
	}
}











