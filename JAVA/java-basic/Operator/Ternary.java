package Operator;
/*
 *  6. 3�� ������ �׽�Ʈ
 */
public class Ternary {
	public static void main(String[] args) {
		boolean isWait=false;
		// isWait �� true �� "��ٷ���" �� ���Եǰ� false �� "��ٸ��� �ʾƿ�" �� ���Եȴ�.
		String result = isWait ? "��ٷ���" : "��ٸ��� �ʾƿ�";
		
		System.out.println(result);
		
		//���� 3Ȳ �����ڴ� �Ʒ��� ���� if ~ else ���� ���� �����̴�.
	    String result2=null;
	    if(isWait) {
	    	result2="��ٷ���";
	    }else {
	    	result2="��ٸ��� �ʾƿ�";
	    }
	    System.out.println(result2);
	}
}
