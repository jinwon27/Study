package DataType;

public class Ex2 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result=str.length();	
		char result2=str.charAt(1);
		/*
		 * 	String ��ü�� �޼ҵ带 Ȱ���ؼ�
		 *  str ���� �ȿ� �ִ� ���ڸ� ��� �빮��(UpperCase)�� ��ȯ�ؼ�
		 *	str2 ��� �̸��� ������ ��� ������.
		 */
		String str2=str.toUpperCase();
		
		String greet="Hello! mimi, bye! mimi";
		//���� ���ڿ����� mimi ��� ���ڿ��� mama ��� ���ڿ��� ��ü �ؼ� ����� gree2�� ��ƺ�����
		String greet2=greet.replace("mimi", "mama");
		
		String message="My name is jinwon";
		/*
		 *  1. ���� ���ڿ��� My ��� ���ڿ��� �����ϴ��� ����(true of false)�� isStart ��� ������ ��ƺ�����
		 *  
		 *  2. ���� ���ڿ����� i �� ���ڿ��� ����� �ε����� ��ġ�ϰ� �ִ����� index ��� ������ ��ƺ�����.
		 */
		
		boolean isStart=message.startsWith("My");
		
		int index=message.indexOf("i");
	}
}
