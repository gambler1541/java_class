package java_428;

import java.util.TreeSet;

public class TreeSet_1 {
	public static void main(String[] args) {
		
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		// 이진 검색 트리라는 자료 구조 형태로
		// 데이터를 저장하는 컬렉션 클래스
		
		int[] score = {75, 48, 66, 93, 37, 55, 10, 75, 63, 84};
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("65 보다 작은 값	: " + set.headSet(new Integer(65)));
		System.out.println("65 보다 큰 값 	: " + set.tailSet(new Integer(65)));
	}
}
