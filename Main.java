import java.util.Scanner;
import java.util.Random;

public class Main {

  boolean gameRunning = true;
  static double moneyAvailable = 5000.00;
  static double moneyInvested = 0.00;
  static double moneyTotal = 0.00;
  
  static int currentDay = 1;
  
  static double AAPL = 192.45;
  static double TSLA = 180.23;
  static double AMZN = 184.89;
  static double LMT = 170.82;
  static double GME = 172.11;

  static double updatedAAPL = 192.45;
  static double updatedTSLA = 180.23;
  static double updatedAMZN = 184.89;
  static double updatedLMT = 170.82;
  static double updatedGME = 172.11;

  static double aaplYesterday = 192.45;
  static double tslaYesterday = 180.23;
  static double amznYesterday = 184.89;
  static double lmtYesterday = 170.82;
  static double gmeYesterday = 172.11;

  static int aaplShares = 0;
  static int tslaShares = 0;
  static int amznShares = 0;
  static int lmtShares = 0;
  static int gmeShares = 0;
  
  public static void main(String[] args) {
    startGame();
  }

//####################################################################################################

public static void startGame() {
  System.out.println("Welcome to...");
  System.out.println("");
  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println("  __       __   ______   _______   __    __  ________  ________");
  System.out.println(" /  \\     /  | /      \\ /       \\ /  |  /  |/        |/        |");
  System.out.println(" $$  \\   /$$ |/$$$$$$  |$$$$$$$  |$$ | /$$/ $$$$$$$$/ $$$$$$$$/");
  System.out.println(" $$$  \\ /$$$ |$$ |__$$ |$$ |__$$ |$$ |/$$/  $$ |__       $$ |");
  System.out.println(" $$$$  /$$$$ |$$    $$ |$$    $$< $$  $$<   $$    |      $$ |");
  System.out.println(" $$ $$ $$/$$ |$$$$$$$$ |$$$$$$$  |$$$$$  \\  $$$$$/       $$ |");
  System.out.println(" $$ |$$$/ $$ |$$ |  $$ |$$ |  $$ |$$ |$$  \\ $$ ||_____   $$ |");
  System.out.println(" $$ | $/  $$ |$$ |  $$ |$$ |  $$ |$$ | $$  |$$       |   $$ |");
  System.out.println(" $$/      $$/ $$/   $$/ $$/   $$/ $$/   $$/ $$$$$$$$/    $$/");
  System.out.println("       __       __   ______    ______   __    __  __");
  System.out.println("      /  \\     /  | /      \\  /      \\ /  |  /  |/  |");
  System.out.println("      $$  \\   /$$ |/$$$$$$  |/$$$$$$  |$$ |  $$ |$$ |");
  System.out.println("      $$$  \\ /$$$ |$$ |  $$ |$$ | _$$/ $$ |  $$ |$$ |");
  System.out.println("      $$$$  /$$$$ |$$ |  $$ |$$ |/    |$$ |  $$ |$$ |");
  System.out.println("      $$ $$ $$/$$ |$$ |  $$ |$$ |$$$$ |$$ |  $$ |$$ |");
  System.out.println("      $$ |$$$/ $$ |$$ \\__$$ |$$ \\__$$ |$$ \\__$$ |$$ |_____");
  System.out.println("      $$ | $/  $$ |$$    $$/ $$    $$/ $$    $$/ $$       |");
  System.out.println("      $$/      $$/  $$$$$$/   $$$$$$/   $$$$$$/  $$$$$$$$/");
  System.out.println("");
  System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
  System.out.println("");
  System.out.println("Immerse yourself in the MARKET MOGUL game, a two-week trading");
  System.out.println("adventure with five fluctuating stocks reflecting real market");
  System.out.println("trends. Experience random stock value changes and strategic");
  System.out.println("investments. Trade wisely, accumulate wealth, and emerge as the");
  System.out.println("ultimate MARKET MOGUL by amassing over $6,000 in wealth!");
  System.out.println("");
  System.out.println("Today's market:");
  System.out.println("");
  System.out.println("Symbol             Price             Change             % Change");
  System.out.println("AAPL               192.45            + 4.74             2.53 ▲  ");
  System.out.println("TSLA               180.23            + 6.57             3.78 ▲  ");
  System.out.println("AMZN               184.89            + 4.39             2.43 ▲  ");
  System.out.println("LMT                170.82            - 1.65             0.35 ▼  ");
  System.out.println("GME                172.11            - 1.45             6.27 ▼  ");
  menu();
}

//####################################################################################################

public static void menu() {
  Scanner menuInput = new Scanner(System.in); //make new scanner
  System.out.println("");
  System.out.println("----------------------------------------------------------------");
  System.out.println("");
  System.out.println("Welcome to the menu!");
  System.out.println("These are your options:");
  System.out.println("1: Buy stock(s)");
  System.out.println("2: Sell stock(s)");
  System.out.println("3: Portfolio");
  System.out.println("4: Next day");
  int menuChosen = menuInput.nextInt(); //get int input
  if (menuChosen == 1) {
    buyStock();
  }
  else if (menuChosen == 2) {
    sellStock();
  }
  else if (menuChosen == 3) {
    portfolio();
  }
  else if (menuChosen == 4) {
    nextDay();
  }
  else {
    System.out.println("Please choose a valid option!");
    menu();
  }
  
}

//####################################################################################################

public static void buyStock() {
  Scanner stockInput = new Scanner(System.in); //make new scanner
  Scanner sharesInput = new Scanner(System.in); //make new scanner
  Scanner returnOption = new Scanner(System.in); //make new scanner
  System.out.println("");
  System.out.println("----------------------------------------------------------------");
  System.out.println("");
  System.out.println("'Buy stock(s)' selected!");
  System.out.println("These are your options:");
  System.out.println("");
  System.out.println("1: Apple - AAPL");
  System.out.println("2: Tesla - TSLA");
  System.out.println("3: Amazon - AMZN");
  System.out.println("4: Lockheed Martin - LMT");
  System.out.println("5: GameStop - GME");
  System.out.println("6: RETURN TO MENU");
  System.out.println("");
  System.out.println("Please enter the number of the stock you have chosen:");
  int stockChosen = stockInput.nextInt(); //get int input
  if (stockChosen == 1) {
    System.out.println("");
    System.out.println("You have chosen Apple!");
    System.out.println("How many shares would you like to buy? (1-100):");
    int sharesChosen = sharesInput.nextInt(); //get int input
    sharesInput.nextLine();
    if (sharesChosen > 100) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else if (sharesChosen < 1 ) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else {
      System.out.println("");
      if (moneyAvailable < (sharesChosen * updatedAAPL)) {
        System.out.println("insufficient funds!");
        buyStock();
      }
      else {
        if (currentDay == 1) {
          System.out.printf("You have bought " + sharesChosen + " shares of Apple for $%.2f!", (sharesChosen * 192.45));
          aaplShares = aaplShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of AAPL shares owned: " + aaplShares);
          moneyAvailable -= (sharesChosen * 192.45);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        else{
          System.out.printf("You have bought " + sharesChosen + " shares of Apple for $%.2f!", (sharesChosen * updatedAAPL));
          aaplShares = aaplShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of AAPL shares owned: " + aaplShares);
          moneyAvailable -= (sharesChosen * updatedAAPL);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        //moneyInvested += (sharesChosen * updatedAAPL);
        System.out.println("Would you like to buy more stocks? (y/n):");
        String buyMore = returnOption.nextLine();
        if (buyMore.equals("y")) {
          buyStock();
        }
        else if (buyMore.equals("n")) {
          menu();
        }
        else {
          System.out.println("Please choose a valid option!");
          buyStock();
        }
      }
    }
  }
  else if (stockChosen == 2 ) {
    System.out.println("");
    System.out.println("You have chosen Tesla!");
    System.out.println("How many shares would you like to buy? (1-100):");
    int sharesChosen = sharesInput.nextInt(); //get int input
    if (sharesChosen > 100) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else if (sharesChosen < 1 ) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else {
      System.out.println("");
      if (moneyAvailable < (sharesChosen * updatedTSLA)) {
        System.out.println("insufficient funds!");
        buyStock();
      }
      else {
        if (currentDay == 1) {
          System.out.printf("You have bought " + sharesChosen + " shares of Tesla for $%.2f!", (sharesChosen * 180.23));
          tslaShares = tslaShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of TSLA shares owned: " + tslaShares);
          moneyAvailable -= (sharesChosen * 180.23);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        else{
          System.out.printf("You have bought " + sharesChosen + " shares of Tesla for $%.2f!", (sharesChosen * updatedTSLA));
          tslaShares = tslaShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of TSLA shares owned: " + tslaShares);
          moneyAvailable -= (sharesChosen * updatedTSLA);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        //moneyInvested += (sharesChosen * updatedTSLA);
        System.out.println("Would you like to buy more stocks? (y/n):");
        String buyMore = returnOption.nextLine();
        if (buyMore.equals("y")) {
          buyStock();
        }
        else if (buyMore.equals("n")) {
          menu();
        }
        else {
          System.out.println("Please choose a valid option!");
          buyStock();
        }
      }
    }
  }
  else if (stockChosen == 3 ) {
    System.out.println("");
    System.out.println("You have chosen Amazon!");
    System.out.println("How many shares would you like to buy? (1-100):");
    int sharesChosen = sharesInput.nextInt(); //get int input
    if (sharesChosen > 100) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else if (sharesChosen < 1 ) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else {
      System.out.println("");
      if (moneyAvailable < (sharesChosen * updatedTSLA)) {
        System.out.println("insufficient funds!");
        buyStock();
      }
      else {
        if (currentDay == 1) {
          System.out.printf("You have bought " + sharesChosen + " shares of Amazon for $%.2f!", (sharesChosen * 184.89));
          amznShares = amznShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of AMZN shares owned: " + amznShares);
          moneyAvailable -= (sharesChosen * 184.89);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        else{
          System.out.printf("You have bought " + sharesChosen + " shares of Amazon for $%.2f!", (sharesChosen * updatedAMZN));
          amznShares = amznShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of AMZN shares owned: " + amznShares);
          moneyAvailable -= (sharesChosen * updatedAMZN);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        //moneyInvested += (sharesChosen * updatedAMZN);
        System.out.println("Would you like to buy more stocks? (y/n):");
        String buyMore = returnOption.nextLine();
        if (buyMore.equals("y")) {
          buyStock();
        }
        else if (buyMore.equals("n")) {
          menu();
        }
        else {
          System.out.println("Please choose a valid option!");
          buyStock();
        }
      }
    }
  }
  else if (stockChosen == 4 ) {
    System.out.println("");
    System.out.println("You have chosen Lockheed Martin!");
    System.out.println("How many shares would you like to buy? (1-100):");
    int sharesChosen = sharesInput.nextInt(); //get int input
    if (sharesChosen > 100) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else if (sharesChosen < 1 ) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else {
      System.out.println("");
      if (moneyAvailable < (sharesChosen * updatedAAPL)) {
        System.out.println("insufficient funds!");
        buyStock();
      }
      else {
        if (currentDay == 1) {
          System.out.printf("You have bought " + sharesChosen + " shares of Lockheed Martin for $%.2f!", (sharesChosen * 170.82));
          lmtShares = lmtShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of LMT shares owned: " + lmtShares);
          moneyAvailable -= (sharesChosen * 170.82);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        else{
          System.out.printf("You have bought " + sharesChosen + " shares of Lockheed Martin for $%.2f!", (sharesChosen * updatedLMT));
          lmtShares = lmtShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of LMT shares owned: " + lmtShares);
          moneyAvailable -= (sharesChosen * updatedLMT);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        //moneyInvested += (sharesChosen * updatedLMT);
        System.out.println("Would you like to buy more stocks? (y/n):");
        String buyMore = returnOption.nextLine();
        if (buyMore.equals("y")) {
          buyStock();
        }
        else if (buyMore.equals("n")) {
          menu();
        }
        else {
          System.out.println("Please choose a valid option!");
          buyStock();
        }
      }
    }
  }
  else if (stockChosen == 5 ) {
    System.out.println("");
    System.out.println("You have chosen GameStop!");
    System.out.println("How many shares would you like to buy? (1-100):");
    int sharesChosen = sharesInput.nextInt(); //get int input
    if (sharesChosen > 100) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else if (sharesChosen < 1 ) {
      System.out.println("Please choose a valid option!");
      buyStock();
    }
    else {
      System.out.println("");
      if (moneyAvailable < (sharesChosen * updatedAAPL)) {
        System.out.println("insufficient funds!");
        buyStock();
      }
      else {
        if (currentDay == 1) {
          System.out.printf("You have bought " + sharesChosen + " shares of Gamestop for $%.2f!", (sharesChosen * 172.11));
          lmtShares = lmtShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of GME shares owned: " + gmeShares);
          moneyAvailable -= (sharesChosen * 172.11);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        else{
          System.out.printf("You have bought " + sharesChosen + " shares of Gamestop for $%.2f!", (sharesChosen * updatedGME));
          gmeShares = gmeShares + sharesChosen;
          System.out.println("");
          System.out.println("Total amount of GME shares owned: " + gmeShares);
          moneyAvailable -= (sharesChosen * updatedGME);
          System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
          System.out.println("");
          System.out.println("");
        }
        //moneyInvested += (sharesChosen * updatedGME);
        System.out.println("Would you like to buy more stocks? (y/n):");
        String buyMore = returnOption.nextLine();
        if (buyMore.equals("y")) {
          buyStock();
        }
        else if (buyMore.equals("n")) {
          menu();
        }
        else {
          System.out.println("Please choose a valid option!");
          buyStock();
        }
      }
    }
  }
  else if (stockChosen == 6) {
    System.out.println("");
    System.out.println("You have chosen to return to the menu!");
    menu();
  }
  else {
    System.out.println("Please choose a valid option!");
    buyStock();
  }
}
  
//####################################################################################################

public static void sellStock() {
  Scanner sellInput = new Scanner(System.in); //make new scanner
  Scanner firstYesNo = new Scanner(System.in); //make new scanner
  Scanner secondYesNo = new Scanner(System.in); //make new scanner
  Scanner stockChosenSell = new Scanner(System.in); //make new scanner
  int aaplSell = 0;
  int tslaSell = 0;
  int amznSell = 0;
  int lmtSell = 0;
  int gmeSell = 0;
  System.out.println("");
  System.out.println("----------------------------------------------------------------");
  System.out.println("");
  System.out.println("'Sell stock(s)' selected!");
  System.out.println("These are your options:");
  System.out.println("");
  System.out.println("1: Apple - AAPL");
  System.out.println("2: Tesla - TSLA");
  System.out.println("3: Amazon - AMZN");
  System.out.println("4: Lockheed Martin - LMT");
  System.out.println("5: GameStop - GME");
  System.out.println("6: RETURN TO MENU");
  System.out.println("");
  System.out.println("Please enter the number of the stock you have chosen:");
  int stockChosen = stockChosenSell.nextInt(); //get int input
  if (stockChosen == 1) {
    System.out.println("");
    System.out.println("You have chosen Apple!");
    System.out.println("How many shares would you like to sell? (You own " + aaplShares + "):");
    aaplSell = sellInput.nextInt();
    if (aaplSell > aaplShares) {
      System.out.println("");
      System.out.println("You dont own that many shares!");
      sellStock();
    }
    else {
    System.out.println("");
    System.out.println("Do you really want to sell " + aaplSell + " shares of Apple? (y/n):");
    String sellConfirm = firstYesNo.nextLine();
    if (sellConfirm.equals("y")) {
      System.out.println("");
      if (currentDay == 1) {
        System.out.println("Sold " + aaplSell + " shares of Apple!");
        aaplShares = aaplShares - aaplSell;
        moneyAvailable += (aaplSell * 192.45);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      else {
        System.out.println("Sold " + aaplSell + " shares of Apple!");
        aaplShares = aaplShares - aaplSell;
        moneyAvailable += (aaplSell * updatedAAPL);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }
      
    }
    else if (sellConfirm.equals("n")) {
      System.out.println("");
      System.out.println("Transaction cancelled!");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }
    }
    else {
      System.out.println("Please choose a valid option!");
      sellStock();
    }
  }
  }
  else if (stockChosen == 2 ) {
    System.out.println("");
    System.out.println("You have chosen Tesla!");
    System.out.println("How many shares would you like to sell? (You own " + tslaShares + "):");
    tslaSell = sellInput.nextInt();
    if (tslaSell > tslaShares) {
      System.out.println("");
      System.out.println("You dont own that many shares!");
      sellStock();
    }
    else {
    System.out.println("");
    System.out.println("Do you really want to sell " + tslaSell + " shares of Tesla? (y/n):");
    String sellConfirm = firstYesNo.nextLine();
    if (sellConfirm.equals("y")) {
      System.out.println("");
      if (currentDay == 1) {
        System.out.println("Sold " + tslaSell + " shares of Tesla!");
        tslaShares = tslaShares - tslaSell;
        moneyAvailable += (tslaSell * 180.23);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      else {
        System.out.println("Sold " + tslaSell + " shares of Tesla!");
        tslaShares = tslaShares - tslaSell;
        moneyAvailable += (tslaSell * updatedTSLA);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }

    }
    else if (sellConfirm.equals("n")) {
      System.out.println("");
      System.out.println("Transaction cancelled!");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }
    }
    else {
      System.out.println("Please choose a valid option!");
      sellStock();
    }
  }
  }
  else if (stockChosen == 3 ) {
    System.out.println("");
    System.out.println("You have chosen Amazon!");
    System.out.println("How many shares would you like to sell? (You own " + amznShares + "):");
    amznSell = sellInput.nextInt();
    if (amznSell > amznShares) {
      System.out.println("");
      System.out.println("You dont own that many shares!");
      sellStock();
    }
    else {
    System.out.println("");
    System.out.println("Do you really want to sell " + amznSell + " shares of Amazon? (y/n):");
    String sellConfirm = firstYesNo.nextLine();
    if (sellConfirm.equals("y")) {
      System.out.println("");
      if (currentDay == 1) {
        System.out.println("Sold " + amznSell + " shares of Amazon!");
        amznShares = amznShares - amznSell;
        moneyAvailable += (amznSell * 184.89);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      else {
        System.out.println("Sold " + amznSell + " shares of Amazon!");
        amznShares = amznShares - amznSell;
        moneyAvailable += (amznSell * updatedAMZN);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }

    }
    else if (sellConfirm.equals("n")) {
      System.out.println("");
      System.out.println("Transaction cancelled!");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }
    }
    else {
      System.out.println("Please choose a valid option!");
      sellStock();
    }
    }
  }
  else if (stockChosen == 4 ) {
    System.out.println("");
    System.out.println("You have chosen Lockheed Martin!");
    System.out.println("How many shares would you like to sell? (You own " + lmtShares + "):");
    lmtSell = sellInput.nextInt();
    if (lmtSell > lmtShares) {
      System.out.println("");
      System.out.println("You dont own that many shares!");
      sellStock();
    }
    else {
    System.out.println("");
    System.out.println("Do you really want to sell " + lmtSell + " shares of Lockheed Martin? (y/n):");
    String sellConfirm = firstYesNo.nextLine();
    if (sellConfirm.equals("y")) {
      System.out.println("");
      if (currentDay == 1) {
        System.out.println("Sold " + lmtSell + " shares of Lockheed Martin!");
        lmtShares = lmtShares - lmtSell;
        moneyAvailable += (lmtSell * 170.82);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      else {
        System.out.println("Sold " + lmtSell + " shares of Lockheed Martin!");
        lmtShares = lmtShares - lmtSell;
        moneyAvailable += (lmtSell * updatedLMT);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }

    }
    else if (sellConfirm.equals("n")) {
      System.out.println("");
      System.out.println("Transaction cancelled!");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }
    }
    else {
      System.out.println("Please choose a valid option!");
      sellStock();
    }
    }
  }
  else if (stockChosen == 5 ) {
    System.out.println("");
    System.out.println("You have chosen Gamestop!");
    System.out.println("How many shares would you like to sell? (You own " + gmeShares + "):");
    gmeSell = sellInput.nextInt();
    if (gmeSell > gmeShares) {
      System.out.println("");
      System.out.println("You dont own that many shares!");
      sellStock();
    }
    else {
    System.out.println("");
    System.out.println("Do you really want to sell " + gmeSell + " shares of Gamestop? (y/n):");
    String sellConfirm = firstYesNo.nextLine();
    if (sellConfirm.equals("y")) {
      System.out.println("");
      if (currentDay == 1) {
        System.out.println("Sold " + gmeSell + " shares of Gamestop!");
        gmeShares = gmeShares - gmeSell;
        moneyAvailable += (gmeSell * 172.11);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      else {
        System.out.println("Sold " + gmeSell + " shares of Gamestop!");
        gmeShares = gmeShares - gmeSell;
        moneyAvailable += (gmeSell * updatedGME);
        System.out.printf("Portfolio balance: $%.2f", moneyAvailable);
      }
      System.out.println("");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }

    }
    else if (sellConfirm.equals("n")) {
      System.out.println("");
      System.out.println("Transaction cancelled!");
      System.out.println("");
      System.out.println("Would you like to sell a different stock? (y/n):");
      String sellMore = secondYesNo.nextLine();
      if (sellMore.equals("y")) {
        sellStock();
      }
      else if (sellMore.equals("n")) {
        menu();
      }
      else {
        System.out.println("Please choose a valid option!");
        menu();
      }
    }
    else {
      System.out.println("Please choose a valid option!");
      sellStock();
    }
    }
  }
  else if (stockChosen == 6) {
    System.out.println("");
    System.out.println("You have chosen to return to the menu!");
    menu();
  }
  else {
    System.out.println("Please choose a valid option!");
    sellStock();
  }
}
  
//####################################################################################################

public static void portfolio() {

  System.out.println("");
  System.out.println("----------------------------------------------------------------");
  System.out.println("");
  System.out.println("'Portfolio' selected!");
  System.out.println("");
  System.out.println("Stock shares owned:");
  System.out.println("AAPL: " + aaplShares);
  System.out.println("TSLA: " + tslaShares);
  System.out.println("AMZN: " + amznShares);
  System.out.println("LMT: " + lmtShares);
  System.out.println("GME: " + gmeShares);
  System.out.println("");
  System.out.println("Money available:");
  System.out.printf("$" + "%.2f", moneyAvailable);
  System.out.println("");
  System.out.println("");
  moneyInvested += (aaplShares * updatedAAPL);
  moneyInvested += (tslaShares * updatedTSLA);
  moneyInvested += (amznShares * updatedAMZN);
  moneyInvested += (lmtShares * updatedLMT);
  moneyInvested += (gmeShares * updatedGME);
  System.out.println("Money invested:");
  System.out.printf("$" + "%.2f", moneyInvested);
  System.out.println("");
  System.out.println("");
  System.out.println("Total portfolio value:");
  moneyTotal = moneyAvailable + moneyInvested;
  System.out.printf("$" + "%.2f", moneyTotal);
  menu();
}

//####################################################################################################

public static void nextDay() {
  Random rand = new Random();
  currentDay++;
  System.out.println("");
  System.out.println("----------------------------------------------------------------");
  System.out.println("");
  System.out.println("'Next day' selected! It is day " + currentDay + ".");
  int randomQuoteNumber = rand.nextInt(13);
  if (randomQuoteNumber == 0) {
    System.out.println("Quote of the day: \"Sell me this pen!\" \033[3m~Jordan Belfort\033[0m");
  }
  else if (randomQuoteNumber == 1) {
    System.out.println("Quote of the day: \"The name of the game, moving the money from");
    System.out.println("the client's pocket to your pocket.\" \033[3m~Mark Hanna\033[0m");
  }
  else if (randomQuoteNumber == 2) {
    System.out.println("Quote of the day: \"Gotta pump those numbers up. Those are rookie");
    System.out.println("numbers in this racket.\" \033[3m~Mark Hanna\033[0m");
  }
  else if (randomQuoteNumber == 3) {
    System.out.println("Quote of the day: \"It's his first day on Wall Street. Give him");
    System.out.println("time.\" \033[3m~Mark Hanna\033[0m");
  }
  else if (randomQuoteNumber == 4) {
    System.out.println("Quote of the day: [throwing money at the FBI agents] \"Fun cou-");
    System.out.println("pons!\" \033[3m~Jordan Belfort\033[0m");
  }
  else if (randomQuoteNumber == 5) {
    System.out.println("Quote of the day: \"You show me a pay stub for $72,000, I quit my");
    System.out.println("job right now and work for you\" \033[3m~Donnie Azoff\033[0m");
  }
  else if (randomQuoteNumber == 6) {
    System.out.println("Quote of the day: \"The only thing standing between you and your");
    System.out.println("goal is the story you keep telling yourself as to why you can't");
    System.out.println("achieve it.\" \033[3m~Jordan Belfort\033[0m");
  }
  else if (randomQuoteNumber == 7) {
    System.out.println("Quote of the day: \"They're gonna need to send in the National");
    System.out.println("Guard to take me out cos I ain't going nowhere!\" \033[3m~Jordan Belfort\033[0m");
  }
  else if (randomQuoteNumber == 8) {
    System.out.println("Quote of the day: \"I'm gonna let you in on a little secret about");
    System.out.println("these telephones. They're not gonna dial themselves.\" \033[3m~Jordan\033[0m");
    System.out.println("\033[3mBelfort\033[0m");
  }
  else if (randomQuoteNumber == 9) {
    System.out.println("Quote of the day: \"Pick up the phone and start dialing!\" \033[3m~Jordan\033[0m");
    System.out.println("\033[3mBelfort\033[0m");
  }
  else if (randomQuoteNumber == 10) {
    System.out.println("Quote of the day: \"I want you to deal with your problems by be-");
    System.out.println("coming rich!\" \033[3m~Jordan Belfort\033[0m");
  }
  else if (randomQuoteNumber == 11) {
    System.out.println("Quote of the day: \"You wanna know what money sounds like? Go to");
    System.out.println("a trading floor on Wall street.\" \033[3m~Jordan Belfort\033[0m");
  }
  else if (randomQuoteNumber == 12) {
    System.out.println("Quote of the day: \"For a moment, I had forgotten I lived in a");
    System.out.println("world where everything was for sale.\" \033[3m~Jordan Belfort\033[0m");
  }
  else if (randomQuoteNumber == 13) {
    System.out.println("Quote of the day: \"Number one rule of Wall Street. Nobody - and");
    System.out.println("I don't care if you're Warren Buffet or if you're Jimmy Buffet - ");
    System.out.println("nobody knows if a stock is going to go up, down, sideways or in");
    System.out.println("circles.\" \033[3m~Mark Hanna\033[0m");
  }

  int aaplChangeChance = rand.nextInt(99);
  int tslaChangeChance = rand.nextInt(99);
  int amznChangeChance = rand.nextInt(99);
  int lmtChangeChance = rand.nextInt(99);
  int gmeChangeChance = rand.nextInt(99);
  double aaplMultiplyValue = 0;
  double tslaMultiplyValue = 0;
  double amznMultiplyValue = 0;
  double lmtMultiplyValue = 0;
  double gmeMultiplyValue = 0;
  int aaplPosOrNeg = 0;
  int tslaPosOrNeg = 0;
  int amznPosOrNeg = 0;
  int lmtPosOrNeg = 0;
  int gmePosOrNeg = 0;
  
  System.out.println("");//for testing

  int aaplChance = 0;
  int tslaChance = 0;
  int amznChance = 0;
  int lmtChance = 0;
  int gmeChance = 0;
  
  if (aaplChangeChance <= 4) {  //5% chance no change happens
    aaplMultiplyValue = 1;
  }
  else if (aaplChangeChance <= 29) {  //25% chance a big change ahppens
    aaplMultiplyValue = 1 + (rand.nextDouble()*0.1);
    aaplChance = 1;
  }
  else if (aaplChangeChance <= 99) { //70% chance a small change happens
    aaplMultiplyValue = 1 + (rand.nextDouble()*0.03);
    aaplChance = 2;
  }
  else {
    System.out.println("aaplChangeChance ERROR");//for testing
  }



  if (tslaChangeChance <= 4) {  //5% chance no change happens
    tslaMultiplyValue = 1;
  }
  else if (tslaChangeChance <= 29) {  //25% chance a big change ahppens
    tslaMultiplyValue = 1 + (rand.nextDouble()*0.1);
    tslaChance = 1;
  }
  else if (tslaChangeChance <= 99) { //70% chance a small change happens
    tslaMultiplyValue = 1 + (rand.nextDouble()*0.03);
    tslaChance = 2;
  }
  else {
    System.out.println("tslaChangeChance ERROR");//for testing
  }



  if (amznChangeChance <= 4) {  //5% chance no change happens
    amznMultiplyValue = 1;
  }
  else if (amznChangeChance <= 29) {  //25% chance a big change ahppens
    amznMultiplyValue = 1 + (rand.nextDouble()*0.1);
    amznChance = 1;
  }
  else if (amznChangeChance <= 99) { //70% chance a small change happens
    amznMultiplyValue = 1 + (rand.nextDouble()*0.03);
    amznChance = 2;
  }
  else {
    System.out.println("amznChangeChance ERROR");//for testing
  }



  if (lmtChangeChance <= 4) {  //5% chance no change happens
    lmtMultiplyValue = 1;
  }
  else if (lmtChangeChance <= 29) {  //25% chance a big change ahppens
    lmtMultiplyValue = 1 + (rand.nextDouble()*0.1);
    lmtChance = 1;
  }
  else if (lmtChangeChance <= 99) { //70% chance a small change happens
    lmtMultiplyValue = 1 + (rand.nextDouble()*0.03);
    lmtChance = 2;
  }
  else {
    System.out.println("lmtChangeChance ERROR");//for testing
  }



  if (gmeChangeChance <= 4) {  //5% chance no change happens
    gmeMultiplyValue = 1;
  }
  else if (gmeChangeChance <= 29) {  //25% chance a big change ahppens
    gmeMultiplyValue = 1 + (rand.nextDouble()*0.1);
    gmeChance = 1;
  }
  else if (gmeChangeChance <= 99) { //70% chance a small change happens
    gmeMultiplyValue = 1 + (rand.nextDouble()*0.03);
    gmeChance = 2;
  }
  else {
    System.out.println("gmeChangeChance ERROR");//for testing
  }


  
  String aaplPlusOrMinus = "";
  String aaplUpOrDownArrow = "";

  String tslaPlusOrMinus = "";
  String tslaUpOrDownArrow = "";

  String amznPlusOrMinus = "";
  String amznUpOrDownArrow = "";

  String lmtPlusOrMinus = "";
  String lmtUpOrDownArrow = "";

  String gmePlusOrMinus = "";
  String gmeUpOrDownArrow = "";

  
  
  aaplPosOrNeg = (int) (Math.random() * 2 + 1);
  if (aaplPosOrNeg == 1) { //price goes down
    if (aaplChance == 1) {
      aaplMultiplyValue = aaplMultiplyValue - 0.1;
    }
    else if (aaplChance == 2) {
      aaplMultiplyValue = aaplMultiplyValue - 0.03;
    }
    aaplPlusOrMinus = "-";
    aaplUpOrDownArrow = "▼";
  }
  else if (aaplPosOrNeg == 2) { //price goes up
    aaplMultiplyValue = aaplMultiplyValue;
    aaplPlusOrMinus = "+";
    aaplUpOrDownArrow = "▲";
  }
  else {
    System.out.println("aapl PosOrNeg ERROR");//for testing
  }



  tslaPosOrNeg = (int) (Math.random() * 2 + 1);
  if (tslaPosOrNeg == 1) { //price goes down
    if (tslaChance == 1) {
      tslaMultiplyValue = tslaMultiplyValue - 0.1;
    }
    else if (tslaChance == 2) {
      tslaMultiplyValue = tslaMultiplyValue - 0.03;
    }
    tslaPlusOrMinus = "-";
    tslaUpOrDownArrow = "▼";
  }
  else if (tslaPosOrNeg == 2) { //price goes up
    tslaMultiplyValue = tslaMultiplyValue;
    tslaPlusOrMinus = "+";
    tslaUpOrDownArrow = "▲";
  }
  else {
    System.out.println("tsla PosOrNeg ERROR");//for testing
  }



  amznPosOrNeg = (int) (Math.random() * 2 + 1);
  if (amznPosOrNeg == 1) { //price goes down
    if (amznChance == 1) {
      amznMultiplyValue = amznMultiplyValue - 0.1;
    }
    else if (amznChance == 2) {
      amznMultiplyValue = amznMultiplyValue - 0.03;
    }
    amznPlusOrMinus = "-";
    amznUpOrDownArrow = "▼";
  }
  else if (amznPosOrNeg == 2) { //price goes up
    amznMultiplyValue = amznMultiplyValue;
    amznPlusOrMinus = "+";
    amznUpOrDownArrow = "▲";
  }
  else {
    System.out.println("amzn PosOrNeg ERROR");//for testing
  }



  lmtPosOrNeg = (int) (Math.random() * 2 + 1);
  if (lmtPosOrNeg == 1) { //price goes down
    if (lmtChance == 1) {
      lmtMultiplyValue = lmtMultiplyValue - 0.1;
    }
    else if (lmtChance == 2) {
      lmtMultiplyValue = lmtMultiplyValue - 0.03;
    }
    lmtPlusOrMinus = "-";
    lmtUpOrDownArrow = "▼";
  }
  else if (lmtPosOrNeg == 2) { //price goes up
    lmtMultiplyValue = lmtMultiplyValue;
    lmtPlusOrMinus = "+";
    lmtUpOrDownArrow = "▲";
  }
  else {
    System.out.println("lmt PosOrNeg ERROR");//for testing
  }



  gmePosOrNeg = (int) (Math.random() * 2 + 1);
  if (gmePosOrNeg == 1) { //price goes down
    if (gmeChance == 1) {
      gmeMultiplyValue = gmeMultiplyValue - 0.1;
    }
    else if (gmeChance == 2) {
      gmeMultiplyValue = gmeMultiplyValue - 0.03;
    }
    gmePlusOrMinus = "-";
    gmeUpOrDownArrow = "▼";
  }
  else if (gmePosOrNeg == 2) { //price goes up
    gmeMultiplyValue = gmeMultiplyValue;
    gmePlusOrMinus = "+";
    gmeUpOrDownArrow = "▲";
  }
  else {
    System.out.println("gme PosOrNeg ERROR");//for testing
  }

  updatedAAPL = AAPL * aaplMultiplyValue;

  updatedTSLA = TSLA * tslaMultiplyValue;

  updatedAMZN = AMZN * amznMultiplyValue;

  updatedLMT = LMT * lmtMultiplyValue;

  updatedGME = GME * gmeMultiplyValue;

  double aaplChangeAmount = updatedAAPL - aaplYesterday;
  double aaplPercentChange = ((updatedAAPL - aaplYesterday) / aaplYesterday) * 100;

  double tslaChangeAmount = updatedTSLA - tslaYesterday;
  double tslaPercentChange = ((updatedTSLA - tslaYesterday) / tslaYesterday) * 100;

  double amznChangeAmount = updatedAMZN - amznYesterday;
  double amznPercentChange = ((updatedAMZN - amznYesterday) / amznYesterday) * 100;

  double lmtChangeAmount = updatedLMT - lmtYesterday;
  double lmtPercentChange = ((updatedLMT - lmtYesterday) / lmtYesterday) * 100;

  double gmeChangeAmount = updatedGME - gmeYesterday;
  double gmePercentChange = ((updatedGME - gmeYesterday) / gmeYesterday) * 100;

  System.out.println("Today's market:");
  System.out.println("");
  System.out.println("Symbol             Price             Change             % Change");
  
  System.out.printf("AAPL               " + "%.2f", updatedAAPL);
  System.out.printf("            " + aaplPlusOrMinus + " " + "%.2f", (Math.abs(aaplChangeAmount)));
  System.out.printf("             " + "%.2f", Math.abs(aaplPercentChange));
  System.out.print(" " + aaplUpOrDownArrow);
  
  System.out.println("");
  System.out.printf("TSLA               " + "%.2f", updatedTSLA);
  System.out.printf("            " + tslaPlusOrMinus + " " + "%.2f", (Math.abs(tslaChangeAmount)));
  System.out.printf("             " + "%.2f", Math.abs(tslaPercentChange));
  System.out.print(" " + tslaUpOrDownArrow);

  System.out.println("");
  System.out.printf("AMZN               " + "%.2f", updatedAMZN);
  System.out.printf("            " + amznPlusOrMinus + " " + "%.2f", (Math.abs(amznChangeAmount)));
  System.out.printf("             " + "%.2f", Math.abs(amznPercentChange));
  System.out.print(" " + amznUpOrDownArrow);
  
  System.out.println("");
  System.out.printf("LMT                " + "%.2f", updatedLMT);
  System.out.printf("            " + lmtPlusOrMinus + " " + "%.2f", (Math.abs(lmtChangeAmount)));
  System.out.printf("             " + "%.2f", Math.abs(lmtPercentChange));
  System.out.print(" " + lmtUpOrDownArrow);
  
  System.out.println("");
  System.out.printf("GME                " + "%.2f", updatedGME);
  System.out.printf("            " + gmePlusOrMinus + " " + "%.2f", (Math.abs(gmeChangeAmount)));
  System.out.printf("             " + "%.2f", Math.abs(gmePercentChange));
  System.out.print(" " + gmeUpOrDownArrow);
  
  aaplYesterday = updatedAAPL; //DO NOT DELETE
  tslaYesterday = updatedTSLA; //DO NOT DELETE
  amznYesterday = updatedAMZN; //DO NOT DELETE
  lmtYesterday = updatedLMT; //DO NOT DELETE
  gmeYesterday = updatedGME; //DO NOT DELETE
  
  System.out.println("");
  
  if (currentDay == 15) {
    gameEnd();
  }
  else {
    menu();
  }
}

  //####################################################################################################

public static void gameEnd() {
  if (moneyAvailable >= 6000.00) {
    gameWon();
  }
  else if (moneyAvailable < 6000.00) {
    gameLost();
  }
}
  
//####################################################################################################
  
public static void gameWon() {
  System.out.println("");
  System.out.println("----------------------------------------------------------------");
  System.out.println("");
  System.out.println("                         / GAME OVER /                          ");
  System.out.println("Congratulations! You have successfully accumulated over $6,000");
  System.out.println("in wealth. You have emerged as the ultimate MARKET MOGUL!");
}

//####################################################################################################
  
public static void gameLost() {
  double moneyNeeded = 1000.00;
  System.out.println("");
  System.out.println("----------------------------------------------------------------");
  System.out.println("");
  System.out.println("                         / GAME OVER /                          ");
  System.out.printf("Unfortunately, you have only made $%.2f. ", moneyAvailable);
  System.out.println("You were only");
  System.out.printf("$%.2f away from the goal! ", 6000.00 - moneyAvailable); 
  System.out.println("Better luck next time rookie, "); // Moved to a separate println statement
  System.out.println("and thank you for playing MARKET MOGUL!");
}
  //####################################################################################################
  
}