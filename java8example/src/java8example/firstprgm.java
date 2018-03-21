package java8example;

interface Add{
	public int getSum(int a,int b);
}
public class firstprgm {
	public static void main(String[] args) {
		Add add1=(a,b)->a+b;
		System.out.println(add1.getSum(5, 6));
	}

}
