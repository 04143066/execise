/*
	编写一个程序模拟酒店的管理系统：输出所有房间列表，预定房间，退房，
*/
import java.util.*;
class room
{
	int no;
	private String type;//"标准间"，“双人间”，“豪华间”
	private boolean isuse; //true表示占用，false表示空闲
	
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
	//规定酒店：5层，每层10个房间
	//1,2是标准间
	//3,4层是双人间
	//5 是豪华间
	private room[][] rooms;

	public Hotel(){
		this(5,10);
	}
	
	public Hotel(int rows,int cols){
		
		this.rooms = new room[rows][cols];
		//room ro = new room();         不能写在这里
		
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
		System.out.println("空闲房间如下：");
		for(int i=0; i<this.rooms.length; i++){
			for(int j=0; j<this.rooms[i].length; j++){
				if(this.rooms[i][j].isIsuse() == false){
					putdetail(this.rooms[i][j], i,j);
				}
			}
		}
	}
	
	public void putdetail(room room1, int i,int j){
		System.out.println("房间号："+room1.getNo());
		System.out.println("房间类型："+room1.getType());
		System.out.println("位于:第"+(i+1)+"层   ,第"+(j+1)+"间");
		System.out.println();
	}
	
	public void book(){
		System.out.println("选择您要预定的房间号：");
		Scanner input = new Scanner(System.in);
		int no=-1;
		no = input.nextInt();
		while(!(no>=0 && no<=this.rooms.length*this.rooms[0].length)){
			System.out.println("输入有误,请重新输入!");
			no = input.nextInt();
		}
		int i = no/this.rooms[0].length-1;
		int j = (no+9)%this.rooms[0].length;
		System.out.println("i="+i+",j=" +j);
		this.rooms[i][j] = util(i,j,true);
		putdetail(this.rooms[i][j], i,j);	
		System.out.println("预定成功!");
	}
	public void nobook(){
		System.out.println("选择您要预定的房间号：");
		Scanner input = new Scanner(System.in);
		int no=-1;
		no = input.nextInt();
		while(!(no>=0 && no<=this.rooms.length*this.rooms[0].length)){
			System.out.println("输入有误,请重新输入!");
			no = input.nextInt();
		}
		int i = no/this.rooms[0].length-1;
		int j = (no+9)%this.rooms[0].length;
		System.out.println("i="+i+",j=" +j);
		this.rooms[i][j] = util(i,j,false);
		putdetail(this.rooms[i][j], i,j);	
		System.out.println("退定成功!");
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