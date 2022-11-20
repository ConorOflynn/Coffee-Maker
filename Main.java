
/*
Conor O'Flynn
CSC1060680
This program dispenses coffee from an object
10/29/22
*/
import java.util.Scanner;
      class CoffeeDispenser {
          // variables go here
          int ouncesRemaining = 128;
          int number = 0;

          // methods go here
          public void refillDispenser() {
              ouncesRemaining = 128;

          }

          public int dispense() {
              int newremaining = (ouncesRemaining - number);
              ouncesRemaining = newremaining;
              return newremaining;
          }

          public int returnOuncesRemaining() {
              return ouncesRemaining;
          }

          public static void main(String[] args) {
              CoffeeDispenser coffee = new CoffeeDispenser();
              while (coffee.ouncesRemaining>=0){
                  Scanner input = new Scanner(System.in);
                  System.out.println(coffee.returnOuncesRemaining() + " ounces Remaining");
                  System.out.println("Enter the number of ounces you want to dispense");
                  coffee.number = input.nextInt();
                  System.out.println(coffee.dispense() + " ounces Remaining");
                  if(coffee.ouncesRemaining <=0){
                  System.out.println("Refilling Dispenser!");
                  coffee.refillDispenser();}
              }
          }
      }

