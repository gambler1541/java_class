package java_428;

import java.util.TreeSet;

public class TreeSet_1 {
	public static void main(String[] args) {
		
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		// ���� �˻� Ʈ����� �ڷ� ���� ���·�
		// �����͸� �����ϴ� �÷��� Ŭ����
		
		int[] score = {75, 48, 66, 93, 37, 55, 10, 75, 63, 84};
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("65 ���� ���� ��	: " + set.headSet(new Integer(65)));
		System.out.println("65 ���� ū �� 	: " + set.tailSet(new Integer(65)));
	}
}
