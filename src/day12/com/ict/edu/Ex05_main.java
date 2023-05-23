package day12.com.ict.edu;

public class Ex05_main {
	public static void main(String[] args) {
		Ex05_constructor p1 = new Ex05_constructor();
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddr());
		System.out.println();
		
		Ex05_constructor p2 = new Ex05_constructor("태권브이");

		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAddr());
		System.out.println();
		
		Ex05_constructor p3 = new Ex05_constructor("둘리",1923);
		
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		System.out.println(p3.getAddr());
		System.out.println();
		
		Ex05_constructor p4 = new Ex05_constructor("임꺽정", 35, "함경도");
		
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		System.out.println(p4.getAddr());
	}
}
