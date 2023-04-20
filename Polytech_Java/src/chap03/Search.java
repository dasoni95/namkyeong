package chap03;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// Ž�� �˰�����
		// ������ Ű ������ �����ϱ�
		
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		// ���� ��
		System.out.print("���� ��: ");
		for(int iu: iu_height)
		{
			System.out.print(iu + " ");
		}
		System.out.println();
		
// ��������============================================================
		for(int i = 0; i < 7; i++)
		{
			//�ּҰ� �˰�����
			int min = iu_height[i];
			int min_index = i;
			for (int j = i + 1; j < 8; j++)
			{
				if(min > iu_height[j])
				{
					min = iu_height[j];
					min_index = j;
				}
			}
			
			// ��ȯ �˰�����
			int temp = iu_height[min_index];
			iu_height[min_index] = iu_height[i];
			iu_height[i] = temp;
		}
		
		// ���
		System.out.print("���� ��: ");
		for(int iu: iu_height) 
		{
			System.out.print(iu + " ");
		}
		System.out.println();
		
//==================================================================

// Ž�� �˰�����
		Scanner scan  = new Scanner(System.in);
		System.out.println("���� Ž��============================");
		System.out.print("�˻�Ű�� : ");
		int key = scan.nextInt();
		int key_index = -1;			// �˻��� ���� �ε�����, -1�� ���з� ����
		int count = 0;
		
		// ����Ž�� (Sequential Search)
		for(int i = 0; i < 8; i++)
		{
			count++;
			if(iu_height[i] == key)
			{
				key_index = i;
			}
		}
		
		if(key_index == -1)
		{
			System.out.println(count + "�� ���ư����ϴ�. �˻�����!");
		}
		else
		{
			System.out.println(count + "�� ���ư����ϴ�. �˻�����! " + key_index + "�� �濡 �ֽ��ϴ�.");
		}
		
		// ���� Ž�� (Binary Search)
		System.out.println("���� Ž��============================");
		
		int low = 0, high = 7;		// low, high �ʱ�ȭ
		int middle = 0;				// �߰����� �ε���	
		
		System.out.print("�˻�Ű�� : ");
		key = scan.nextInt();
		key_index = -1;				// �˻��� ���� �ε�����, -1�� ���з� ����
		count = 0;
		
		while(low <= high)
		{
			count++;
			middle = (low + high) / 2;
			System.out.println("[low] " + low + " [high] " +
			high + " [middle] " + middle + " [value] " + iu_height[middle]);
			
			if(key == iu_height[middle])
			{
				key_index = middle;
				break;
			}
			else if(key > iu_height[middle])
			{
				low = middle + 1;
			}
			else if(key < iu_height[middle])
			{
				high = middle - 1;
			}
		}
		
		if(key_index == -1)
		{
			System.out.println(count + "�� ���ư����ϴ�. �˻�����!");
		}
		else
		{
			System.out.println(count + "�� ���ư����ϴ�. �˻�����! " + key_index + "�� �濡 �ֽ��ϴ�.");
		}
		
		System.out.println("������ ����: " + iu_height.length);
		
		// length ����ؼ� ���� ���� ���ϱ�, ����ϱ�
		for(int i = 0; i < iu_height.length; i++)
		{
			System.out.println(iu_height[i] + " ");
		}
		
		
		
		
		scan.close();
		
	}

}