package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest8 {
	
	//練習問題１
	public void printHallo() {
		System.out.println("Hallo");
	}
	
	//練習問題２
	public void printRandomMessage() {
		int n = (int)(3 * Math.random());
		switch(n) {
		case 0:
			System.out.println("おはよう");
			break;
		case 1:
			System.out.println("こんにちは");
			break;
		default:
			System.out.println("こんばんは");
		}
	}
	
	//練習問題３
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	//練習問題４
	public void printMessage(String message,int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	
	//練習問題５
	public void printRectangleArea(double height, double width) {
		double area = height * width;
		System.out.println("長方形の面積 = " + area);
	}
	
	//練習問題６
	public void getWeatherForecast() {
		String[] days = {"今日","明日","明後日"};
		String[] weathers = {"晴れ","曇り","雨","雪"};
		Random random = new Random();
		String day = days[random.nextInt(3)];
		String weather = weathers[random.nextInt(4)];
		System.out.println(day + "の天気は" + weather + "でしょう");
		
	}
	
	//練習問題７
	public boolean isEvenNumber(int value) {
		return value % 2 == 0;
	}
	
	//練習問題８
	public String getMessage(String name,boolean isKid) {
		String age = isKid ? "ちゃん":"さん";
		return name + age;
	}
	
	//練習問題９
	public String getLongestString(String[] array) {
		if(array == null || array.length == 0) {
			return null;
		}
		
		String longestString = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i].length() >= longestString.length()) {
				longestString = array[i];
			}
		}
		return longestString;
	}
	
	//練習問題１０
		public boolean isAdult(Person person) {
			int age = person.getAge();
			return age >= 20;
			
	}
}
