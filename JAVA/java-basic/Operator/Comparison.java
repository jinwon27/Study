package Operator;
/*
 * 	3.�񱳿����� �׽�Ʈ
 * 	  �񱳿����� ����� boolean type �� �������ش�.
 *  ==, !=, >, >=, <, <=
 */
public class Comparison {
public static void main(String[] args) {
		
		boolean result1 = 10 == 10; //true
		boolean result2 = 10 != 10; //false
		boolean result3 = 10 > 10; //false
		boolean result4 = 10 >= 10; //true
		boolean result5 = 10 < 10; //true
		boolean result6 = 10 > 10; //true
		
		// String type ������ name �� null �����ϱ�
		String name=null;
		
		// null ���� �ƴ��� �񱳰� �����ϴ� (�� java ���� null ���� �񱳰� ����)
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
	}
}
