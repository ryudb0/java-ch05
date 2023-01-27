package example;

import java.util.Scanner;

public class Ex5_12 {
	public static void main(String[] args) {
		String[][] answer = { 
				{ "chair", "의자" },
				{ "computer", "컴퓨터"},
				{ "integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		String input = "";
		
		for(int i =0; i<answer.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, answer[i][0]);
			input = scanner.nextLine();
			
			if(answer[i][1].equals(input)) {
				System.out.printf("정답입니다.%n");
				counter++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n", answer[i][1]);
			}
		}
		System.out.println();
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", answer.length, counter);
		
		
	}

}
