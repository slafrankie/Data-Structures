/*
drive program

*/
public class Hospital
{
   public static void main (String[] args)
   {
      HospitalEmployee vito = new HospitalEmployee ("Vito", 123);
      Doctor michael = new Doctor ("Michael", 234, "Heart");
      
      // invoke the specific methods of the objects
      vito.work();
      michael.diagnose();
      michael.work();
   }
}
