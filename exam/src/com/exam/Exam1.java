package com.exam;

import java.util.Scanner;

public class Exam1 {
  /* 第一題  訂票程式 20分 
		假設只有台北到高雄的票，單程票價1000元，來回票為2000元再打九折
		請設計本程式，讓他完成以下規範 (全對本題才有分數)
		1. 詢問使用者要購買張數，如下:
		Please enter number of tickets: 
		2. 取得使用者輸入的張數後，再詢問幾張來回票，如下:
		How many round-trip tickets: 
		3. 最後印出本次的張數、來回票數與總金額，如下:
		Total tickets: 5
		Round-trip: 3
		Total: 7400
		4. 完成後結束程式即可
		● 若有利用類別設計完成此題，加倍給分。

	第二題  連續訂票功能  10分
		承第一題，請加入必要的設計，讓程式能夠連續訂票
		(訂完一次後，繼續下一次訂票)
		當使用者想結束訂票時，只要購買張數輸入 -1 ，即結束程式。
		● 每次訂票的結果都要正確才給分。
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
