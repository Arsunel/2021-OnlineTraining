package by.jonline.lec01.main;

import java.util.Scanner;//����������� ������		 //���� � ����������

public class Tasks_04_Vvod {

	public static void main(String[] args) {
		int a, b, sum;
		a = VvodSklaviatury("� ������   ");
		b = VvodSklaviatury("b ������   ");
		sum = Summa(a,b);
		System.out.println("����� " + sum);
	}
	
	
	public static int Summa(int x, int y){      						//����� ��� �����
		int sum;
		sum = x+y;
		return sum;
}
	
	public static int VvodSklaviatury(String message) {			//�����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  		//���� � ����������
		int vvod;
		System.out.print(message);	
		while(!sc.hasNextInt())						//���� � ����������
		{		sc.next();
				System.out.print(message); 	}
		return vvod = sc.nextInt();
	}
	
}