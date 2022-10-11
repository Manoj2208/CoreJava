
public class LoaderClass {
static boolean b;
static String name="Alian";
static{
	System.out.println(b);
}
public static void main(String[] args) {
	System.out.println(b);
	System.out.println(name);
}
static{
	b=true;
}
}
