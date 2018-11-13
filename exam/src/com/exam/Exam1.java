package com.exam;

import java.util.Scanner;

public class Exam1 {
  /* 蝚砌�憿�  閮巨蝔�� 20��� 
		��身�����擃��巨嚗蝔巨�1000�����巨�2000�������
		隢身閮蝔������誑銝��� (�撠憿���)
		1. 閰Ｗ�蝙���頃鞎瑕撐�嚗���:
		Please enter number of tickets: 
		2. ���蝙��撓���撐�敺��岷��嗾撘萎��巨嚗���:
		How many round-trip tickets: 
		3. ��敺��甈∠�撐����巨���蜇�������:
		Total tickets: 5
		Round-trip: 3
		Total: 7400
		4. 摰�������
		��� ����憿閮剛���迨憿���策����

	蝚砌���  ��蝥�巨��  10���
		�蝚砌�憿���敹��身閮����憭��蝥�巨
		(閮��甈∪��匱蝥��甈∟�巨)
		�雿輻�蝯��巨���閬頃鞎瑕撐�頛詨 -1 嚗蝯�����
		��� 瘥活閮巨����閬迤蝣箸�策����
	*/
	public static void main(String[] args) {
		
		while(true){
			Ticket t = new Ticket();
			t.ticket();
			Scanner scanner = new Scanner(System.in);
			t.number = scanner.nextInt();
			scanner.nextLine();
			
			
			if(t.number>0){
				Ticket ti = new Ticket();
				ti.round();
				t.number1 = scanner.nextInt();
				scanner.nextLine();
				int tickets = 1000;
				int round = 1800;
				int total = ((t.number - t.number1) * tickets + t.number1 * round);
				System.out.printf("Total tickets: %d", t.number);
				System.out.println();
				System.out.printf("Round-trip: %d" , t.number1);
				System.out.println();
				System.out.printf("Total: %d", total);
				System.out.println();
			}
			
			if(t.number==-1){
				break;
			}
		}
	}
}
