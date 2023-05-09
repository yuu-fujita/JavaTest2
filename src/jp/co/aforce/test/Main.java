package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
	
	//練習問題１１(練習問題１～１０の呼び出し)
		
		PracticeTest8 practiceTest8 = new PracticeTest8();
		
		//練習問題１
		practiceTest8.printHallo();
		
		/*空白*/System.out.println("");
		
		//練習問題２
		practiceTest8.printRandomMessage();
		
		/*空白*/System.out.println("");
		
		//練習問題３
		practiceTest8.printMessage("Hallo");
		
		/*空白*/System.out.println("");
		
		//練習問題４
		practiceTest8.printMessage("繰り返し",5);
		
		/*空白*/System.out.println("");
		
		//練習問題５
		practiceTest8.printRectangleArea(6,2.5);
		
		/*空白*/System.out.println("");
		
		//練習問題６
		practiceTest8.getWeatherForecast();
		
		/*空白*/System.out.println("");
		
		//練習問題７
		int value = 5;
		boolean number = practiceTest8.isEvenNumber(value);
		System.out.println(number);
		
		/*空白*/System.out.println("");
		
		//練習問題８
		String name = "藤田";
		boolean isKid = false;
		String message = practiceTest8.getMessage(name,isKid);
		System.out.println("こんにちは" + message + "。");
		
		/*空白*/System.out.println("");

		
		//練習問題９
		String[]array = {"pc","mouse","keyboard"};
		String longestString = practiceTest8.getLongestString(array);
		System.out.println("最も長い文字列は" + longestString + "です。");
		
		/*空白*/System.out.println("");
		
		//練習問題１０
		/* */
		System.out.println();

		
		
	}
}
