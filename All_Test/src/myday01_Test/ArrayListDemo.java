package myday01_Test;

import java.util.ArrayList;

/*
 * 	�ڿ���̨��ӡ���µ���Ϣ:
	-----------------------���ǲ��ͳ���--------------------------
	��Ʒ���	��Ʒ����	��������	��Ʒ����	��������
	1			����		����		3.0			6		
	2			�����		��ʦ��		2.5     	5
	3			����		�ְ���		4.0         12 
	-------------------------------------------------------------
	���������Ʒ�ܽ��Ϊ: 78.5 Ԫ 

 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//��������
		ArrayList<Supermarket> list = new ArrayList<Supermarket>();
		list.add(new Supermarket(1,"����","����",3.0,6));
		list.add(new Supermarket(2,"�����","��ʦ��",2.5,5));
		list.add(new Supermarket(1,"����","�ְ���",4.0,12));
		
		for (Supermarket supermarket : list) {
			System.out.println(supermarket);
		}
	}

}
