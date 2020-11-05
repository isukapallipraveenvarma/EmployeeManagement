import java.util.*;

public class Employee 
{


	   public static void main(String args[])
	   {
		   sc = new Scanner(System.in);
         System.out.println("\t\t Employee Data ");
         System.out.println("\t\t 1. Insert. ");
         System.out.println("\t\t 2. Delete. ");
         System.out.println("\t\t 3. Update. ");
         System.out.println("\t\t 4. Display. ");
         System.out.println("\t\t 5. Exit. ");
         System.out.print("\t Choosse a option");

         String ch =sc.next();

         Employee db = new Employee();            
         while(true) 
         {

         switch(ch)
         {

                  case "1":
                            System.out.print("\n Enter Employee Id : ");
                            String id = sc.next();
                            System.out.print(" Employee Name : ");
                            String name =sc.next();
                            System.out.print(" ADDRESS : ");
                            String addr = sc.next();
                            System.out.print(" DOB (MM/DD/YYYY) : ");
                            String dob =sc.next();
                            System.out.print(" Phone No. : ");
                            String cell =sc.next();
                            System.out.print(" Salary : ");
                            String salary =sc.next();
                            db.insert(id, name, addr, dob, cell, salary);
                            break;
              
                  case "2":
                    System.out.print("\nEnter Employee id to delete : ");

                            id =sc.next();
                            db.delete(id);
                            break;

                  case "3":
                            System.out.print("\n Enter Employee Id : ");
                            id = sc.next();
                            System.out.print(" Employee Name : ");
                            name =sc.next();
                            System.out.print(" ADDRESS : ");
                            addr =sc.next();
                            System.out.print(" DOB (MM/DD/YYYY) : ");
                            dob =sc.next();
                            System.out.print(" Phone No. : ");
                            cell = sc.next();
                            System.out.print(" Salary : ");
                            salary = sc.next();
                            db.update(id, name, addr, dob, cell, salary);
                            break; 

                  case "4":
                            db.display();
                            break;

                  case "5":                           
                            System.exit(0);

           }        

         }      

      }





     ArrayList<String> lst=new ArrayList<>();
	private static Scanner sc;

public void insert(String id, String name, String addr, String dob, String cell, String salary)
{

         
                   lst.set(1, id);
                   lst.set(2, name);
                   lst.set(3, addr);
                   lst.set(4, dob);
                   lst.set(5, cell);
                   lst.set(6, salary);
                   System.out.println("inserted");

          }



 

public void update(String id, String name, String addr, String dob, String cell,String salary)
{

                   lst.set(1, name);
                   lst.set(2, addr);
                   lst.set(3, dob);
                   lst.set(4, cell);
                   lst.set(5, salary);
                   lst.set(6, id);
                   System.out.println(" Update");

 }



 

public void display()
{       

            System.out.println("  ID    |    NAME        |    ADDRESS   |   DOB     | PHONE     |   SALARY");
            for (int i= 0;i <lst.size();i++)
         {
          System.out.println( lst.get(1) + "\t " + lst.get(2) + "\t " +lst.get(3) + "\t " +lst.get(4) + "\t " +lst.get(5) + "\t " +lst.get(6));
          }      
}      

 

public void delete(String id) 
{
					lst.remove(id);

                   System.out.println("Deleted");
   }               

}
 

 