/*
 深入一维数组
*/
 public class Arraytest05
 {
	 public static void main(String argv[]){
		 animal[] an = new animal[4];

		 Dog d1 = new Dog();
		 Dog d2 = new Dog();
		 Cat c1 = new Cat();
		 Cat c2 = new Cat();

		 an[0] = d1;
		 an[1] = d2;
		 an[2] = c1;
		 an[3] = c2;

		 //需求：遍历数组，取出每个对象，如果是Dog就执行eat方法，如果是cat方法就执行move方法
		 for(int i=0; i<an.length; i++){
			 animal a =an[i];
			 System.out.println(a);
			 //要想做某件事情可以做强制类型转换
			 if(a instanceof Dog){
				 Dog d = (Dog)a;
				 d.eat();
			}
			 else
			 {
				Cat c = (Cat)a;
				c.move();
			 }
		 }
	 }
 }

 class animal
 {
 }

 class Dog extends animal
 {
	 public void eat(){
		 System.out.println("Dog eat");
	 }
 }

 class Cat extends animal
 {
	 public void move(){
		 System.out.println("Cat move");
	 }
 }
 