/*
	��дһ������ģ��Ƶ�Ĺ���ϵͳ��������з����б�Ԥ�����䣬�˷���
*/
import java.util.*;
class room
{
	int no;
	private String type;//"��׼��"����˫�˼䡱���������䡱
	private boolean isuse; //true��ʾռ�ã�false��ʾ����
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isIsuse() {
		return isuse;
	}
	public void setIsuse(boolean isuse) {
		this.isuse = isuse;
	}
	
}

class Hotel
{
	//�涨�Ƶ꣺5�㣬ÿ��10������
	//1,2�Ǳ�׼��
	//3,4����˫�˼�
	//5 �Ǻ�����
	private room[][] rooms;

	public Hotel(){
		this(5,10);
	}
	
	public Hotel(int rows,int cols){
		
		this.rooms = new room[rows][cols];
		//room ro = new room();         ����д������
		
		for(int i=0; i<this.rooms.length; i++){
			for(int j=0; j<this.rooms[i].length; j++){
				this.rooms[i][j] = util(i,j,false);
			}
		}
	}
	
	public room util(int i,int j,boolean isuse){
		room ro = new room();
		//ro.setNo(i*10+j+1);
		ro.no=i*10+j+1;
		ro.setIsuse(isuse);
		ro.isIsuse();
		if(i==0 || i==1)
			ro.setType("single");
		else if(i==2 || i==3)
			ro.setType("double");
		else
			ro.setType("great");
		return ro;
	}
	
	public void output(){
		//System.out.println(this.rooms.length);
		System.out.println("���з������£�");
		for(int i=0; i<this.rooms.length; i++){
			for(int j=0; j<this.rooms[i].length; j++){
				if(this.rooms[i][j].isIsuse() == false){
					putdetail(this.rooms[i][j], i,j);
				}
			}
		}
	}
	
	public void putdetail(room room1, int i,int j){
		System.out.println("����ţ�"+room1.getNo());
		System.out.println("�������ͣ�"+room1.getType());
		System.out.println("λ��:��"+(i+1)+"��   ,��"+(j+1)+"��");
		System.out.println();
	}
	
	public void book(){
		System.out.println("ѡ����ҪԤ���ķ���ţ�");
		Scanner input = new Scanner(System.in);
		int no=-1;
		no = input.nextInt();
		while(!(no>=0 && no<=this.rooms.length*this.rooms[0].length)){
			System.out.println("��������,����������!");
			no = input.nextInt();
		}
		int i = no/this.rooms[0].length-1;
		int j = (no+9)%this.rooms[0].length;
		System.out.println("i="+i+",j=" +j);
		this.rooms[i][j] = util(i,j,true);
		putdetail(this.rooms[i][j], i,j);	
		System.out.println("Ԥ���ɹ�!");
	}
	public void nobook(){
		System.out.println("ѡ����ҪԤ���ķ���ţ�");
		Scanner input = new Scanner(System.in);
		int no=-1;
		no = input.nextInt();
		while(!(no>=0 && no<=this.rooms.length*this.rooms[0].length)){
			System.out.println("��������,����������!");
			no = input.nextInt();
		}
		int i = no/this.rooms[0].length-1;
		int j = (no+9)%this.rooms[0].length;
		System.out.println("i="+i+",j=" +j);
		this.rooms[i][j] = util(i,j,false);
		putdetail(this.rooms[i][j], i,j);	
		System.out.println("�˶��ɹ�!");
	}
}

public class hotelTest
{
	public static void main(String argv[]){
		Hotel hotel =  new Hotel();
		hotel.output();		
		hotel.book();
		hotel.output();
	}	
}