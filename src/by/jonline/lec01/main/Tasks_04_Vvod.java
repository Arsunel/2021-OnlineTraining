package by.jonline.lec01.main;

import java.util.Scanner;//Импортируем Сканер		 //ВВОД С КЛАВИАТУРЫ

public class Tasks_04_Vvod {

	public static void main(String[] args) {
		int a, b, sum;
		a = VvodSklaviatury("а Увядзи   ");
		b = VvodSklaviatury("b Увядзи   ");
		sum = Summa(a,b);
		System.out.println("сумма " + sum);
	}
	
	
	public static int Summa(int x, int y){      						//Метод для СУММЫ
		int sum;
		sum = x+y;
		return sum;
}
	
	public static int VvodSklaviatury(String message) {			//МЕТОД
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  		//ВВОД С КЛАВИАТУРЫ
		int vvod;
		System.out.print(message);	
		while(!sc.hasNextInt())						//ВВОД С КЛАВИАТУРЫ
		{		sc.next();
				System.out.print(message); 	}
		return vvod = sc.nextInt();
	}
	
}
