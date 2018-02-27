import java.util.Scanner;

public class Game {
   public static void main(String[] args) {
      // Create rabbit object in Animal
      Animal snake = new Animal("snake", true);
      // Create snake object in Animal
      Animal rabbit = new Animal("rabbit", false);
      
      //sætter slangens position til 9,9
      snake.setPos(9,9); 
      //sætter kaninens startposition til 1,1
      rabbit.setPos(1,1);
      
      //Game loop, mens slangens og kaninens positioner ikke er lig med hinanden kører loop
      while(snake.getPosX() != rabbit.getPosX() || snake.getPosY() != rabbit.getPosY()) {
         
         // Moves the rabbit (Random move 1 field)
         rabbit.move();
         // Announces the rabbit position
         rabbit.printPos();
     
         //uses the snake move function (can be either random or controlled by player)
         snake.move();
         // Announces the snakes position
         snake.printPos();
         // prints an empty line for easier reading while playing
         System.out.println("");
      }
      // rabbit begs to not be eaten
      System.out.println(rabbit.beg());
      // Snake eats the rabbit.
      System.out.println(snake.eat());
   }
}

