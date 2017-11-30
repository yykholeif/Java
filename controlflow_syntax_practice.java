/* hello
  world */

  //Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
// and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"

//Complete this switch statement by 1) writing the last case (case 12), so that it prints out "December"
// and 2) writing a default case that for any month number not between 1 and 12, will print out "Invalid month"

int month; // should be a number 1-12
String monthString;

switch(month) {
    case 1: monthString = "January";
        break;
    case 2: monthString = "February";
        break;
    case 3: monthString = "March";
        break;
    case 4: monthString = "April";
        break;
    case 5: monthString = "May";
        break;
    case 6: monthString = "June";
        break;
    case 7: monthString = "July";
        break;
    case 8: monthString = "August";
        break;
    case 9: monthString = "September";
        break;
    case 10: monthString = "October";
        break;
    case 11: monthString = "November";
        break;
    case 12: monthString = "December";
        break;
    default: monthString = "Invalid month";
    // write case 12 and a default case below
}

//month conditional
System.out.println(monthString);

boolean canSeePlayer = ?
boolean playerPoweredUp = ?

if (canSeePlayer) {
    if (!playerPoweredUp) {
      System.out.println("Attack!");
    } else {
      System.out.println("Run away!");
    }
} else {
System.out.println("Wander.");
}

//weather conditional
boolean isSnowing = false;
boolean isRaining = true;
double temperature = 60.0;

if (isSnowing || isRaining || temperature < 50.0) {
  System.out.println("Let's stay home.")
} else {
  System.out.println("Let's go out!")
}


//time conditional
int time = 18;
String timeOfDay = 0;

  if (time >= 5 && time < 12) {
    timeOfDay = "morning";
  } else if (time >=12 && time < 20) {
    timeOfDay = "daytime";
  } else {
    timeOfDay = "night";
  }

  //alarm conditional
int weekday = 5;
boolean holiday = false;

if (weekday >=1 && weekday <=5 && !holiday) {
  System.out.println("Wake up at 7:00");
} else {
  System.out.println("Sleep in!");
}

//Weekly Schedule using Switch statement
1 = Monday
2 = Tuesday
3 = Wednesday
4 = Thursday
5 = Friday
6 = Saturday
7 = Sunday

int dayOfWeek = 1;
String schedule;

switch(dayOfWeek) {
  case 1:
    schedule = "Gym in the morning";
    break;
  case 2:
    schedule = "Class after work";
    break;
  case 3:
    schedule = "Meetings all day.";
    break;
  case 4:
    schedule = "Work from home.";
    break;
  case 5:
    schedule = "Game night after work.";
    break;
  default:
    schedule = "Free!";
    break;
}
