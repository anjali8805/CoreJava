package coreJava;

public class Find_LargestNuminArray {
	public static void main(String[] args) {
		int [] ar= {23,56,78,56,30,572};
		int largestNum= ar[0];  //assume the first element as largest
		for(int i=1; i<ar.length; i++) {
			if(largestNum >ar[i]) {
				largestNum=largestNum;
			}
			else {
				largestNum=ar[i];
			}
		}
		System.out.println("largest num" + " "+largestNum );

	}
}
