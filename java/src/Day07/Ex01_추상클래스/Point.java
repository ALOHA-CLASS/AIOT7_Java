package Day07.Ex01_추상클래스;

public class Point {
	
	// 멤버 변수
	int x, y;
	
	// ctrl + . -> Generate Contructor...
	// 기본 생성자
	public Point() {
		this(0, 0);
	}

	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// ctrl + . -> Generate toString()...
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}