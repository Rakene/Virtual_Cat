import java.util.Scanner;

public class cat{
  public static void response(String action){
    double r = Math.random();
    if(action.equals("help") ){
      System.out.println("\thelp  -prints out all possible commands");
      System.out.println("\tpet   -give the cat some pets");
      System.out.println("\tfeed  -give the cat some food");
      System.out.println("\ttoy   -play with the cat");
      System.out.println("\tend   -ends and exits the program");
    }else if(action.equals("pet")){
      if (r>.9){
        System.out.println("\tattacks, grabs hand, bites, and bunny kicks");
        System.out.println("\tthen licks");
      }else if (r<.2){
        System.out.println("\tstares into your eyes and meows loudly");
      }else if (r>.2 && r<.4){
        System.out.println("\trolls over and exposes belly for rubs");
      } else{
        System.out.println("\tpurrrrrs like a freight train");
      }
    }else if(action.equals("feed")){
      if (r>.9){
        System.out.println("\tdrinks from your cup of water");
      }else if (r<.2){
        System.out.println("\tstares into your eyes and meows loudly");
      }else if (r>.2 && r<.4){
        System.out.println("\tscratches at food bag");
      } else{
        System.out.println("\tmunches on kibble");
      }
    }else if(action.equals("toy")){
      if (r>.9){
        System.out.println("\ttrills in joy");
      }else if (r<.2){
        System.out.println("\trips the toy out of your hands");
        System.out.println("\truns under the bed");
      }else if (r>.2 && r<.4){
        System.out.println("\tswats in the air for the toy");
      } else{
        System.out.println("\tchases and jumps for the toy");
      }
    }else{
      System.out.println("\tlooks at you confusingly");
    }
  }
  public static void main(String[] args) {
          System.out.println("Play with the Cat");
          System.out.println("Type help for more information");
          Scanner sc = new Scanner(System.in);
          boolean end = true;
      while (end) {
          String action = sc.next();
          if (action.equals("end")){
            end = false;
          } else{
            response(action);
          }
      }
  }
}
