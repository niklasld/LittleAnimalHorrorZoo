public class Animal {
   String type = "";
   int snakePosX = 9, snakePosY = 9, rabbitPosX = 1, rabbitPosY = 1;
   
   public Animal(String type) {
      this.type = type;
   }
   /*public Beg() {
   
   }*/
   
   public void move() {
      Move generator = new Move();
      int random = generator.random(2);
      if(type == "snake") {
         if(random == 0) {
            generator.setX(type);
            System.out.println(generator.snakePosX+","+generator.snakePosY);
            snakePosX = generator.snakePosX;
            System.out.println(snakePosX+","+snakePosY);
         }
         else {
            generator.setY(type);
            System.out.println(generator.snakePosX+","+generator.snakePosY);
            System.out.println(snakePosX+","+snakePosY);
         }
      }
      else {
         if(random == 0) {
            generator.setX(type);
            this.rabbitPosX = generator.rabbitPosX;
         }
         else {
            generator.setY(type);
            this.rabbitPosY = generator.rabbitPosY;
         }      
      }
   }
   /*
   public DetectSnake() {
   
   }
   
   public void snake() {
   
   }
   
   public void Rabbit() {
   
   }*/
}