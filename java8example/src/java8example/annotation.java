package java8example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class annotation {
public static void main(String[] args) {
	//@NonNull List<String>
	List<String> a=Arrays.asList("hi","hello","string");
	a.add("i");
	//a.add("hello");
	System.out.println(a);
}
}
