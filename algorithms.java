// search algorithm: calculate the minimum number from an array

double[] speed = { 7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19 }

public double search(double[] speed) {
	int size = speed.length;
	double min = speed[0];
	for(int i=1 ; i<size ; i++) {
		if(speed[i] < min) {
			min = speed[i];
		}
	}
	return min;
}


//search algo: find longest string

public String findLongestName(String [] names) {
	int size = names.length;
	String longestName = names[0];
	for(int i=1; i<size ;i++) {
		if(names[i].length() > longestName.length()) {
			longestName = names[i];
		}
	}
	return longestName;
}


//factorial 

public int factorial(int n) {
	int total = 1;
	for (int i=1; i<=n ;i++) {
		total = total * i;
	}
	return total;
}


//search: find string index within an array

public int indexOfFirstOccurence(String[] stringArray, String target) {
	for(int i=0; i<stringArray.length; i++) {
		if(stringArray[i].equals(target)) {
			return i;
		}
	}
	return -1;
}


//calculating years until deposit reaches a million

public int yearsTilOneMillion(double initialBalance) {
	double newBalance = initialBalance;

	for(int years=0; newbalance<1000000; years++) {
		newBalance = newBalance * 1.05;
	}
	return years;
}


//print strings in an array in reverse

public void printInReverse(String[] stringArray) {
	int size = stringArray.length - 1
	for(int i=size; i>=0; i--) {
		System.out.println(stringArray[i]);
	}
}









