package chk;

public class TestImp implements Test{

	@Override
	public void print(String s) {
		System.out.println("In print method");
	}

	@Override
	public void show(int a) {
		System.out.println("In show method");
	}
}
