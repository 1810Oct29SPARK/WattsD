package CalclulatorTesting;

public class Calculator thr{

	 public Calculator(){}

	 public Double add(String toAdd){
		

	double sum = 0.0;
	if(!toAdd.equals(""))
	{
	String[] numbers = toAdd.split(",");
	int count = 0;
	for(int j = 0; j <numbers.length;j++)
	{
	for(int i = 0; i<numbers[j].length(); i++)
	{
		if(numbers[j].charAt(i) == '.')
		{
			count++;
		}
	}
	}
	if(count != 1)
	{
		
	}
	for(String number : numbers){

	sum += Double.parseDouble(number);
	}
	}
	 return sum;
	}
}

