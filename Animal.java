// imports random function from java utilities to make the animals move randomly
import java.util.Random;
// scanner imported from java utilities to make the code wait for a key response to move the animals
import java.util.Scanner;
// made the public class animal 
public class Animal {
   
   // created variables for the public class animal
   private int posX, posY, oldPosX, oldPosY;
   private String name = "";
   boolean player = false;
   private int direction;
   // public Animal is an constructor without values
   public Animal() {
   
   }
   // constructor with name and player values.
   public Animal(String name, boolean player) {
      this.name = name;
      this.player = player;
      
   }  
   // int  variable that we use to randomize a number between 0 and 4
   public int random(int input) {
      // creates a new random generator object
		Random generator = new Random();
      
      // Creates an integer variable called random and puts in a new random number between 0 and input number given
      int random = generator.nextInt(input);
      
      //returns the value on the random variable.
		return random;		
   }
   // this is our set method for the position of the animal
   public void setPos(int posX, int posY){
      this.posX = posX;
      this.posY = posY;
   }
   // get  method to retrieve the x variable that the animal is placed on
   public int getPosX() {
      return posX;
   }
   // get method to retrieve the y variable that the animal is placed on
   public int getPosY() {
      return posY;
   }
   // method to print the position of the animals in text
   public void printPos(){
      System.out.println(this.name+": I moved to ("+posX+","+posY+")");
   }
   // string variable to print the text "please don't eat me!" when the snake and rabbit is on the same position
   public String beg() {
      return this.name+": Please don't eat me!";
   }
   // string variable to print the text "I'm gonna eat you, muhahaha" when the snake and rabbit is on the same position
   public String eat() {
      return this.name+": I'm gonna eat you, muhahaha";
   }
   
   // Method to move the snake as a player
   public void movePlayer(){
      System.out.println("Type Up/Down/Left/Right to move in that direction: ");
      //creates a new scanner object
      Scanner scanner = new Scanner(System.in);
      // sets the string moveDirection to be equal to the scanner input
      String moveDirection = scanner.nextLine();
      //Prints out directio chosen.
      System.out.println("Direction chosen is: " + moveDirection);
      // Creates a switch using the moveDirection as a valuable for the different cases.
      switch(moveDirection) {
         case "up": // move the snake up
         case "Up":
         case "UP":
         case "u":
         case "U":
            //sets direction to 0
            direction = 0;
            break;
         case "right": // move the snake right
         case "Right":
         case "RIGHT":
         case "r":
         case "R":
            //sets direction to 1
            direction = 1;
            break;
         case "down": // move the snake down
         case "Down":
         case "DOWN":
         case "d":
         case "D":
            //sets direction to 2
            direction = 2;
            break;
         case "left": // move the snake left
         case "Left":
         case "LEFT":
         case "l":
         case "L":
            //sets direction to 3
            direction = 3;
            break;
         case "auto": // If you are a lazy , you can make the computer move the snake for you
         case "Auto":
         case "AUTO":
         case "a":
         case "A":
            //Sets teh player variable to false and starts autogenerating the movement
            this.player = false;
            break;
         default: 
            // errors doesnt happen
            System.out.println("Error");
      }
   }
   // creates the move method
   public void move() {
      //creates a new generator from the animal class
      Animal generator = new Animal();
      // sets random variable to be between 0-4
      int random = generator.random(4);
      
      // checks if the player is playing or it should be random movement
      if(player == false) {
         //sets direction (movement) to be random since there is noone choosing direction
         this.direction = random;
      }
      else {
         // asks for player input to move
         movePlayer();
      }
      
      // Starts a switch based on the direction variable.
      switch (direction) {
         case 0:  //Move up
                  //checks if y is 10, and if it isnt move up
                  if(posY != 10){
                     posY++;
                  } 
                  else {
                     // if the y position is 10 and its the player playing print error message
                     if(player == true) {
                        System.out.println("Invalid move");
                     } 
                     // if the y pos is 10 move down
                     else {
                        posY--;
                     }
                  }
                  break;
         case 1:  //Move right
                  // checs if x is 10 
                  if(posX != 10){
                     // if not moves forward on x axis
                     posX++;
                  } 
                  else {
                     // if x is 10 and its a player print error
                     if(player == true){
                        System.out.println("Invalid move");
                     } 
                     // if x is 10 and its a randomiser draw 1 from x pos instead
                     else {
                        posX--;
                     }
                  }
                  break;
         case 2:  //Move down
                  // if the y position is 0 and its the player playing print error message
                  if(posY != 0){
                     posY--;
                  } 
                  else {
                     if(player == true){
                        System.out.println("Invalid move");
                     } 
                     else {
                        posY++;
                     }
                  }
                  break;
         case 3:  //Move left
                  // if the x position is 0 and its the player playing print error message
                  if(posX != 0){
                     posX--;
                  } 
                  else {
                     if(player == true){
                        System.out.println("Invalid move");
                     } 
                     else {
                        posX++;
                     }
                  }
                  break;
         default: //Invalid move
                  System.out.println("Invalid move");
                  break;
      }
   }
}