package Lesson10;

import java.util.TreeSet;

public class treeSetEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int[] score = {80,95,50,35,45,65,10,100};
		for(int i= 0; i<score.length ; i++) {
			ts.add(score[i]);
		}           //정렬된 값에서 출력됨
		System.out.println("첫번째 값: " + ts.first());
		System.out.println("마지막 값: " + ts.last());
		System.out.println("50보다 큰 값: " + ts.higher(50));
		System.out.println("50보다 작은 값: " + ts.lower(50));
		System.out.println("50보다 작은 값(미만) 집합" + ts.headSet(50));
		System.out.println("50보다 큰 값(이상) 집합 : " + ts.tailSet(50));
		System.out.println("50이상 95미만 값 집합 : " + ts.subSet(50, 95));

	}

}
