public double absoluteValue(double n) {
	if (n < 0) {
		return -n;
	} else {
		return n;
	}
}

public double calculateTip(double mealCost) {
	double tip = mealCost * 0.15;
	return tip;
}

public String nametagText(String name) {
	String newString = "Hello, my name is " + name;
	return newString;
}

/**
* Converts from Fahrenheit to Celsius degrees.
* @param fahrenheit Temperature in degrees Fahrenheit.
* @return Equivalent temperature in degrees Celsius.
*/

public double fahrenheitToCelsius(double temperatureFahrenheit) {
	return temperatureCelsius = (temperatureFahrenheit-32)*5/9;
}

/**
* Prints a temperature in both Fahrenheit and Celsius degrees.
* @param fahrenheit Temperature in degrees Fahrenheit.
*/

public void printTemperature(double temperatureFahrenheit) {
	System.out.println("F: " + temperatureFahrenheit);
	System.out.println("C: " + fahrenheitToCelsius(temperatureFahrenheit));
}

//monopoly dice role 

/**
* Returns a random integer simulating a dice roll.
* @param sides Number of sides on the virtual die being rolled.
* @return random number in the range of 1 to sides.
*/

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

