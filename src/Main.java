import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        // task 1
        int age = -22;
        if ( age >= 18 ) {
            System.out.println("Твой возраст достиг совершеннолетия!");
        }
        else
        {
            System.out.println("твой возрат не достиг соврешеннолетия!");
        }

        // task 2

        int temperature = -5;
         if (temperature <5) {
             System.out.println("Сегодня на улице " + temperature + " градусов, лучше надеть шапку");
         }
         else  {
             System.out.println("Сегодня на улице " +temperature+ " градусов, можно идти без шапки");

         }


        //  task 3

        int speed = 60;
         if (speed > 60) {
             System.out.printf("Выша скорость " + speed + " км/ч вам придется заплатить штраф");
         }
          else  {
             System.out.printf("Выша скорость " + speed + " км/ч можете ездить спокойно");
         }


        // task 4


          int age1 = 2;
          if (age1 >= 2 && age1 <= 6)
          {System.out.printf("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в детский садик ");
          }
          if (age1 >= 7 && age1 <= 17) {
            System.out.printf("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в школу ");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.printf("Если возраст человека равен " + age1 + " лет, то ему нужно ходить в университет ");
        }
        if (age1 > 24) {
            System.out.printf("Если возраст человека равен " + age1 + " лет, то ему нужно ходить на работу ");
        }

        // task 5

 int age2 = 44;
  if (age2 < 5){
     System.out.printf("Если ребенку " + age2 + " лет, то он не может кататься на аттракционе!" );
  }
  if (age2 > 5 && age2 < 14) {
      System.out.printf("Если ребенку " + age2 + " лет, то он может кататься в сопровождении взрослого! Если взрослого нет, то кататься нельзя!");
  }
  if (age2 > 14){
      System.out.printf("Если ребенку " + age2 + " лет, то он может кататься без сопровождения взрослого!");
  }

  //  task 6

   int van = 102;
   int people = 111;

   if (van > people && people < 60) {
       System.out.printf("В вагоне есть еще сидячие места!");
   }
        if (people > 60 && people < 102) {
            System.out.printf("В вагоне есть еще стоячие места!");
        }
else if (van <= people  ){
            System.out.printf("В вагоне нет мест!");
        }

// task 7

int one = 7;
int two = 66;
int three = 66666;
if (one > two && one > three ){
    System.out.printf("Самое большое число это " + one);
}
else if (two > one && two > three) {
    System.out.printf("Самое большое число это " + two);
}
else {
    System.out.printf("Самое большое число это " + three);
}







    }
}