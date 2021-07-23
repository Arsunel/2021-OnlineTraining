package by.jonline.lec01.main;

public class Tasks_02 {

	public static void main(String[] args) {
		
		//Task Ветвление-1	Углы треугольника
		System.out.print("Task Ветвление-1 - ");
		int a=90, b=200;		
		if (a+b<=380) {
			if (a == 90 || a == 90) 	System.out.println("треугольник есть - прямоугольный");
			else		System.out.println("треугольник есть - не прямоугольный");		}
		else		System.out.println("треугольника нету");	
			
		//Task Ветвление-2	max min 
		System.out.print("Task Ветвление-2 - ");
		int c=16, d=29;
		double max = Math.max(Math.max(a,b), Math.min(c,d));
		System.out.println(max);	
		
		//Task Ветвление-3   - 3 Точки с координатами на прямой
		System.out.print("Task Ветвление-3 - ");
		int x1=5, y1=3, x2=5, y2=3, x3=6, y3=7;		
		if (x1 == x2 && x2 == x3 || y1==y2 && y2==y3) {
					System.out.println("Точки расположены на одной прямой");		}
		else		System.out.println("Точки НЕ расположены на одной прямой");	
		
		//Task Ветвление-4	Отверстие и Кирпич.
		System.out.print("Task Ветвление-4 - ");
		int A=10, B=10, x=10, y=10; //z=50 - длинна кирпича не интересует	
		if (A >= x && B>=y || A>=y && B>=x) {
		System.out.println("Кирпич пройдет");		}
		else		System.out.println("Кирпич НЕ пройдет");			
				
		//Task Ветвление-5	Функиция 
		System.out.print("Task Ветвление-5 - ");
		double n =400;
		double F1 = n*n-3*n+9;
		double F2 = 1/(n*n*n+6);
			if (n<=3) System.out.println(F1);
			else		System.out.println(F2);
		
		
		
		
		
		
		
		
	}
	
}
	


