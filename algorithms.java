// search algorithm: calculate the minimum number from an array

double[] values = { 7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19 }
// verb in function name and matched parameter
public double getMinimumValue(double[] values) {
	int size = values.length;
	double min = values[0];
	for(int i=1 ; i<size ; i++) {
		if(values[i] < min) {
			min = values[i];
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


//print range

public int findRange(int[] intArray) {
	//find min and max
	if (intArray.length == 0) {
		return -1;	
	}
	double min = intArray[0];
	double max = intArray[0];
	for(int i=1 ; i < intArray.length ; i++) {
		if(intArray[i] < min) {
			min = intArray[i];
		}
		if(intArray[i] > max) {
			max = intArray[i];
		}
	}
	return max - min;
}



/* print out using double loop
#
##
### 
*/


int rows = 3;
for (int i=1; i<=rows; i++) {
	String thisRow = "";
	for (int j=0; j<i; j++) {
		thisRow = thisRow + "#";
	}
	System.out.println(thisRow);
}

//monopoly roll original

public int randomInt() {
	double number = Math.random() * 6;
	number = number + 1;
	return (int) number;
}

public int monopolyRoll() {
	int firstRole = randomInt();
	int secondRole = randomInt();
	int sum = firstRole + secondRole;

	if (firstRole == secondRole) {
		int thirdRole = randomInt();
		int fourthRole = randomInt();
		sum = sum + thirdRole + fourthRole
	}
	return sum
}

//monopoly roll using loop

public int randomInt(int sides) {
	double number = Math.random() * sides;
	number = number + 1;
	return (int) number;
}

public int monopolyRoll() {
	int firstRoll = randomInt(6);
	int secondRoll = randomInt(6);
	int total = firstRole + secondRole;

	rollCount = 1;
	while (firstRoll == secondRoll) {

		if(rollCount >=3) return -1;

		firstRoll = randomInt(6);
		secondRoll = randomInt(6);
		total = total + firstRoll + secondRoll;

		rollCount += 1
	}
	return total;
}


//find the index of the two integers within an array that add up to our target sum
class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[] { i, j };
                }
            }
        }
    System.out.println("No Two Sum Solution");
    return new int[] {};
    }
    
}


