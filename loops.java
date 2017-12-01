//number of roles to get identical dice faces

public int keepRolling() {
    int dice1 = rollDice();
    int dice2 = rollDice();
    int dice3 = rollDice();
    int dice4 = rollDice();
    int dice5 = rollDice();
    
    int count = 1;
    while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
        //we need to re-roll
        dice1 = rollDice();
        dice2 = rollDice();
        dice3 = rollDice();
        dice4 = rollDice();
        dice5 = rollDice();
        count = count + 1;
    }
    return count;
}

// blocks in a pyramid

public int countBlocks(int levels){
    int total = 0;
    for (int i=1; i <= levels; i++) {
        total = total + (i*i);
    }
    return total;
}

//Martingale Method in Roulette/Poker

public int martingale() {
 int money = 1000;
 int target = 1200;
 int bet = 10;
 
 
 while (money > bet) {
  boolean win = play();
  if (win) {
   money += bet;
   bet = 10;
  } else {
   money -= bet;
   bet *= 2;
  }
  if (money >= target) {
    break;
  }
 }
 return money;
}