import java.util.Random;

public class Animal {
   private int posX, posY, oldPosX, oldPosY;
   private String name = "";
   
   public Animal(String name) {
      this.name = name;
   }  
   
   public int random(int input) {
      // creates a new random generator object
		Random generator = new Random();
      
      // Creates an integer variable called random and puts in a new random number between 0 and input number given
      int random = generator.nextInt(input);
      
      //returns the value on the random variable.
		return random;		
   }
   
   public void setPos(int posX, int posY){
      this.posX = posX;
      this.posY = posY;
   }
   
   public int getPosX() {
      return posX;
   }
   
   public int getPosY() {
      return posY;
   }
   public String beg() {
      
   }
   public String eat() {
   
   }
   
   public void move() {
      Animal generator = new Animal();
      
      int random = generator.random(2);
      if(random == 0) {
         if (posY == 0){
            oldPosY = posY;
            posY++;
         }
            
         else if (posY == 10){
           oldPosY = posY;
           posY--;
         }
         
         else {
            random = generator.random(2);
            
            if(random==0) {   
               oldPosY = posY;
               posY++;
            }
            
            else{
               oldPosY = posY;
               posY--;
            }
         }
      }
      else {
         if (posX == 0){
            oldPosX = posX;
            posX++;
         }
            
         else if (posX == 10){
           oldPosX = posX;
           posX--;
         }
         else {
            random = generator.random(2);
            if(random==0) {   
               oldPosX = posX;
               posX++;
            }
            else{
               oldPosX = posX;
               posX--;
            }
         }      
      }
   }
}