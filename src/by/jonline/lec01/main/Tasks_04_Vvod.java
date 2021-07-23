package by.jonline.lec01.main;

import java.util.Scanner;//Èìïîğòèğóåì Ñêàíåğ		 //ÂÂÎÄ Ñ ÊËÀÂÈÀÒÓĞÛ

public class Tasks_04_Vvod {

	public static void main(String[] args) {
		int a, b, sum;
		a = VvodSklaviatury("à Óâÿäçè   ");
		b = VvodSklaviatury("b Óâÿäçè   ");
		sum = Summa(a,b);
		System.out.println("ñóììà " + sum);
	}
	
	
	public static int Summa(int x, int y){      						//Ìåòîä äëÿ ÑÓÌÌÛ
		int sum;
		sum = x+y;
		return sum;
}
	
	public static int VvodSklaviatury(String message) {			//ÌÅÒÎÄ
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  		//ÂÂÎÄ Ñ ÊËÀÂÈÀÒÓĞÛ
		int vvod;
		System.out.print(message);	
		while(!sc.hasNextInt())						//ÂÂÎÄ Ñ ÊËÀÂÈÀÒÓĞÛ
		{		sc.next();
				System.out.print(message); 	}
		return vvod = sc.nextInt();
	}
	
}