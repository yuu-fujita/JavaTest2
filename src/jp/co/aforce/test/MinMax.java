package jp.co.aforce.test;

public class MinMax {

		public static int getMaxValue(int a, int b, int c){
			int max = a;
			if(b > max) {
				max = b;
			}else if(c > max) {
				max = c;
			}
			return max;
			}
		
		public static int getMinValue(int a, int b, int c){
			int min = a;
			if(b < min) {
				min = b;
			}else if(c < min) {
				min = c;
			}
			return min;
			}

}
