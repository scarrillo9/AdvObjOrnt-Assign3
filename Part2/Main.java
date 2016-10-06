import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /*
          Task	2:	UML	State	Machines	Implementations
           Refer to	the	state	machine	diagram	at	end	of	this	assignment	and	implement	its
           behavior	in	Java.	Events	in	the	state	machine	can	be	invoked	by	the	user (and	should
           be implemented as	public	methods).	At	any	time,	the	user	can	query	the	current
           state	of	the	state	machine
         */
        //Normal state - 1 user action
        // 1 = anomoly; goes to Recovery identification state
        //
        //Recovery identification state - 3 user actions
        // 1 = pressure; goes to press recovery state
        // 2 = temperature; temp recovery state
        // 3 = recovery failure
        //
        //Pressure recovery state - 2 user actions
        // 1 = recovery success; goes to normal state
        // 2 = recovery failure
        //
        //Temperature recovery state - 2 user actions
        // 1 = recovery success; goes to normal state
        // 2 = recovery failure

        System.out.println("Now entering normal state...");
        normalState();
    }

    public static void normalState(){ //normal state
        int anon = 0;// user input

        System.out.println("Normal state...");
        System.out.println("Only enter 1 to stay in current state...");
            try {
                anon = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("*****ANOMOLY DETECTED*****");
                System.out.println("Now Entering recovery...");
            }
    }//end of normal state
}//end
