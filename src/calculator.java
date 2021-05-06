import java.util.Scanner;


public class calculator {

	public static void main(String[] args) {
		System.out.println("계산할 값을 스페이스로 구분해서 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();		//엔터를 치기전까지 전체 문자열을 읽어온다.
		String[] arr = value.split(" ");		//공백을 구분자로 사용해서 입력값을 나눈다.
		
		int result = Integer.parseInt(arr[0]);	//첫번째 데이터는 result에 입력

		//반복문을 통해서 입력한 값들을 더한다.
		//첫번째 값은 result에 저장했으니까 2번째 데이터부터 짝수개 만큼 loop를 돌면서 계산.
		//별거 아닐거라 생각했는데 생각보다 오래걸림.
		for (int i=1; i<arr.length-1; i=i+2){
			result = calculate(result, arr[i], Integer.parseInt(arr[i+1]));
		}

		//왜 2를 나누기할 생각 못했을까
//		for (int i=1; i<=(arr.length-1)/2; i++){
//			result = calculate(result, arr[2*i-1], Integer.parseInt(arr[2*i]));
//		}
		
		output.print(result);
	}
	
	static int calculate(int input1, String symbol, int input2) {
		int result = 0;

		if (symbol.equals("+")) {
			result = Plus(input1, input2);

		}else if(symbol.equals("-")) {
			result = Minus(input1, input2);

		}else if(symbol.equals("*")) {
			result = Multiplication(input1, input2);

		}else if(symbol.equals("/")) {
			result = Division(input1, input2);
		}	
		
		return result;
	}
	
	//덧셈
	static int Plus(int num1, int num2) {
		return num1 + num2;
	}

	//뺄셈
	static int Minus(int num1, int num2) {
		return num1 - num2;
	}

	//곱셈
	static int Multiplication(int num1, int num2) {
		return num1 * num2;
	}

	//나눗셈
	static int Division(int num1, int num2) {
		return num1 / num2;
	}
}
