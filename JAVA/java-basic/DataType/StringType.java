package DataType;
/*
 * 	[ Java ���� ������ type ]
 * 
 * 	String type
 * 
 * 	-���ڿ��� �ٷꋚ ����ϴ� ������ type �̴�.
 */
public class StringType {
	public static void main(String[] args) {
		// "����" ��� String type ��ü�� heap ������ ����� �� �������� ������ ���
		String name="����";
		// name �ȿ� �ִ� �������� tmp ������ ������ �ֱ�
		String tmp=name;
		// "������" ��� String type ��ü�� heap ������ ����� �� �������� name ������ �����
		name="������";
		// name ������ ����( null �� ���� ������ type �� ���� �ִ� �� �����̴�)
		name=null;
	}
}
