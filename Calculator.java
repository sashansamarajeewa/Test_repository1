public class Calculator{
	public static void main(String a[]){
		System.out.println("Hello world");
		System.out.println("Calculator java program");

		}
	public static void addition(int number1,int number2){
		System.out.print("Addition=:"+(number1+number2));
		}

	public static void division(int number1,int number2){
		if(number2==0)
			System.out.print("division by zero");
		else
		System.out.print("division=:"+(number1/number2));

	public static void subtraction(int number1,int number2){
		System.out.print("subtraction=:"+(number1-number2));
		}
	public static void multiplication(int number1,int number2){
		System.out.print("multiplication=:"+(number1*number2));

		}
}