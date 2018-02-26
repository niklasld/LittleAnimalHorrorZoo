import java.util.Scanner;

public class Game {
   public static void main(String[] args) {
      // Create rabbit object in Animal
      Animal snake = new Animal("snake");
      // Create snake object in Animal
      Animal rabbit = new Animal("rabbit");

      snake.setPos(9,9);
      rabbit.setPos(1,1);
      
      while(snake.getPosX() != rabbit.getPosX() || snake.getPosY() != rabbit.getPosY()) {
         rabbit.move();
         System.out.println("Rabbit: I moved to ("+rabbit.getPosX()+","+rabbit.getPosY()+")");         
         snake.move();
         System.out.println("Snake: I moved to ("+snake.getPosX()+","+snake.getPosY()+")");
      }

      System.out.println("Game over sucka!");
   }
}

