public class Main
{
   public static void main (String[] args)
   {
      System.out.println ("Testing the APLine class...");
   
      APLine line1 = new APLine (5, 4, -17);
      double slope1 = line1.getSlope();
      boolean onLine1 = line1.isOnLine (5, -2);
      
      printInfo ("AP Line #1", slope1, onLine1);
      printInfo ("Expected Results", -1.25, true);
      
      System.out.println ("================================");
      APLine line2 = new APLine (-25, 40, 30);
      double slope2 = line2.getSlope();
      boolean onLine2 = line2.isOnLine (5, -2);
      
      printInfo ("AP Line #2", slope2, onLine2);
      printInfo ("Expected Results", 0.625, false);
      
      // Add a testcase for 7x+3y-29=0
      System.out.println ("================================");
      APLine line3 = new APLine (7, 3, -29);
      double slope3 = line3.getSlope();
      boolean onLine3 = line3.isOnLine (11, -5);

      printInfo ("AP Line #3", slope3, onLine3);
      printInfo ("Expected Results", -0.233, false);
      // Add a testcase that uses a point other than (5, -2)...
      System.out.println ("================================");
            
      // Have every person in the group add a different test case
     //12x+6y+24=0
           APLine line4 = new APLine (12, 6, 24);
      double slope4 = line4.getSlope();
      boolean onLine4 = line4.isOnLine (-1, -2);

      printInfo ("AP Line #4", slope4, onLine4);
      printInfo ("Expected Results", -2, true);
      System.out.println ("================================");    

     //2x-2y+5=0
     APLine line5 = new APLine (2, -2, 5);
      double slope5 = line5.getSlope();
      boolean onLine5 = line5.isOnLine (-2, 2);

      printInfo ("AP Line #5", slope5, onLine5);
      printInfo ("Expected Results", 1, false);
      
      System.out.println 
("================================");

     //x+4y-25=0
     APLine line6 = new APLine (1, 4, -25);
      double slope6 = line6.getSlope();
      boolean onLine6 = line6.isOnLine (1, 6);

      printInfo ("AP Line #6", slope6, onLine6);
      printInfo ("Expected Results", -0.25, true);
      System.out.println ("================================");    
              
   }
   
   public static void printInfo (String message, double slope, boolean isOnLine)
   {
      System.out.print (message + ":  Slope = " + slope + ", isOnLine returns ");
      if (isOnLine)
         System.out.println ("true");
      else
         System.out.println ("false");
   }
}
