package DataType;
/*
 *  [ Java �⺻ ������ type ]
 *  
 *  2. ���� (boolean)
 *  
 *  - true, false �ΰ��� ���� �ϳ��̴�.
 *  - true, false �� ���� ���ų� �񱳿��� Ȥ�� �� ������ ����� ���� �ִ�. 
 *  - ���� ������ ��Ÿ���� ������ type 
 */
public class Boolean {
	//run ������ ������ �帧�� ���۵Ǵ� Ư���� main �޼ҵ�(�⺻ �޼ҵ�)
		public static void main(String[] args){
			//���� ���� ����� ���ÿ� �� �����ϱ�
			boolean isRun=true;
			if(isRun) {
				System.out.println("�޷���");
			}
			
			//�� ������ ����� ����� boolean �� ���
			boolean isGreater=10>1;
			//�� ������ ����� ����� boolean �� ���
			boolean result=true||false;
			
			//�ѹ� ������ ������ �ٽ� ���� �Ҽ�����.
			//boolean result=false;
			result=false; //������ �ٸ� ���� ���� �Ҽ� �ִ�(������ type �� ���)
			//�ٸ� type ���� ������ ������ ����.
			//result=10;
		}
	}
