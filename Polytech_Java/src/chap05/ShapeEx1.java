package chap05;

//�߻� Ŭ���� ����
abstract class Shape2 {
	abstract void draw();
}

//�߻� Ŭ������ ��ӹ޾Ƽ� �������ؼ� ���
class Circle1 extends Shape2{
	@Override
	void draw() {
		System.out.println("���׸���");
	}
}

class Line1 extends Shape2{
	@Override
	void draw() {
		System.out.println("���׸���");
	}
}

class Rect1 extends Shape2{
	@Override
	void draw() {
		System.out.println("�簢���׸���");
	}
}

public class ShapeEx1 {
	public static void main(String[] args) {
		
		//��ĳ���ð� �������ε�
		Shape2 s = new Circle1();
		s.draw();
	}
}



