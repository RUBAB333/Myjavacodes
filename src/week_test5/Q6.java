package week_test5;

public class Q6 {
	int x=10;
	public void assign(int x)
	{
		x=x;
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		new Q6().assign(100);

	}

}