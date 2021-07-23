package by.jonline.lec01.main;

public class Tasks_01 {

	public static void main(String[] args) {
		double z=5.3, a=3.5, b=9.7, c=5.4;
		//double x=5; y=2.2;
		
		//Task_01
		System.out.print("Task 01 - ");
		z = ((a-3)*b/2)+c;
		System.out.println(z);
		
		//Task_02	Math - Корень	Степень
		System.out.print("Task 02 - ");
		z = (b+ Math.sqrt(Math.pow(b,2)+4*a*c)) /2*a-Math.pow(a, 3)*c + Math.pow(b, -2);
		System.out.println(z);
		
		//Task 03	Math - SIN	COS
		System.out.print("Task 03 - ");
		z = (Math.sin(a)+Math.cos(b)) / (Math.cos(a)-Math.sin(b)) * Math.tan(a*b); 
		System.out.println(z);
		
		//Task 04	Дробную и целую поменять местами - %
		System.out.print("Task 04 - ");
		double R = 241.128;
		double result4 = (R * 1000)% 1000 + (int) R / 1000.0;
		System.out.println(result4);	 
		
		//Task 05	Секунды в часы
		System.out.print("Task 05 - ");
		int T = 7600;
		int hour = T/60/60; //час
		int min = T/60-(hour*60); //мин
		int sec = T - min*60-hour*60*60;
		System.out.println(hour+"ч " + min + "мин " + sec + "с");
		
		//Task 06	if, Координаты
		System.out.print("Task 06 - ");
		int x = 7;
		int y = 3;
		 if (x >= -4 && x<=4 && y >=-3 && y<=4) {
		       System.out.println("true");}
		       else
		    	   System.out.println("false");		    
	
			
	}
	
}
	


