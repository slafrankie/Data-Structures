/*
Receives empName and empNumber as arguments
from main, checks directory
*/
public class HospitalEmployee
{
   //protected String name;
   //protected int number;
   private String name;
   private int number;

   public HospitalEmployee (String empName, int empNumber)
   {
      name = empName;
      number = empNumber;
   }

   public void setName (String empName)//Constructors
   {
      name = empName;
   }

   public void setNumber (int empNumber)
   {
      number = empNumber;
   }

   public String getName()
   {
      return name;
   }

   public int getNumber()
   {
      return number;
   }

   public void work()
   {
      System.out.println (name + " works for the hospital.");
   }
}
