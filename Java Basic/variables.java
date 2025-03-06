

public class variables {
    public static void main(String[] args) {
        //creating a string variable

        //creating a integer variable

        //creating a variable without assigning a value

        //overwriting an existing variable value
        
        
        //create a final variable(unchangable and read -only)
        final int mynum = 15;
            //mynum =20 ; // error:cannot assign a value to final variable mynum.
        System.out.println(mynum);

        //combine a text a varible on display
        String city = "Banglore";
        System.out.println("Silicon city : "+city); 

        //add a variable to another variable
        String fname = "Inchara Manjunath";
        String lname = " Achar";
        String Fullname = fname+lname;
        System.out.println("Name : "+Fullname);

        //declare many variables of the same types with a comma-seperated list
        int x= 3,y=4,z=10;
        System.out.println("Sum="+ (x+y+z)); // x+y+z = 3410, (x+y+z)=17.
    }
}
