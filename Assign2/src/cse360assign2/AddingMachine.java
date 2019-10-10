package cse360assign2;

/**
* @author Gannonclark
* ClassId: 70641
* Description: program tracks add and subtract transactions and prints accordingly
* Assignment: 2
*/

public class AddingMachine {

  private int total = 0;
  private String transactions = "0";


  public static void main(String[] args) {

      AddingMachine myCalculator = new AddingMachine();


      myCalculator.add(6);
      myCalculator.subtract(4);
      myCalculator.add(6);
      myCalculator.subtract(4);
      myCalculator.subtract(2);
      myCalculator.subtract(1);


      System.out.println(myCalculator.toString());

//      System.out.println(addingMachine.getTotal());
//
//      addingMachine.clear();
//
//      System.out.println(addingMachine.toString());
//      System.out.println(addingMachine.getTotal());

  }


  public AddingMachine() {
      total = 0;  // not needed - included for clarity
  }


  /**
   * @return total
   */
  public int getTotal() {
      return total;
  }

  /**
   * @param value to add
   */
  public void add(int value) {
      total += value;
      transactions += " + " + Integer.toString(value);
  }

  /**
   * @param value to subtract
   */

  public void subtract(int value) {
      total -= value;
      transactions += " - " + Integer.toString(value);
  }

  /**
   * @return transactions of operation done
   */

  public String toString() {
      return transactions;
  }

  public void clear() {
      transactions = "";

  }
}
