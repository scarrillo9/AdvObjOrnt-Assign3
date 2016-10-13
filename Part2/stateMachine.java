package stateMachine;

/*
Task	2:	UML	State	Machines	Implementations
 Refer to	the	state	machine	diagram	at	end	of	this	assignment	and	implement	its
 behavior	in	Java.	Events	in	the	state	machine	can	be	invoked	by	the	user (and	should
 be implemented as	public	methods).	At	any	time,	the	user	can	query	the	current
 state	of	the	state	machine
*/
//Normal state - 1 user action
//1 = anomoly; goes to Recovery identification state
//any other input = print current state
//
//Recovery identification state - 3 user actions
//1 = pressure; goes to press recovery state
//2 = temperature; temp recovery state
//3 = recovery failure
//any other input = print curr state
//
//Pressure recovery state - 2 user actions
//1 = recovery success; goes to normal state
//2 = recovery failure
//any other input = print curr state
//
//Temperature recovery state - 2 user actions
//1 = recovery success; goes to normal state
//2 = recovery failure
//any other input = print curr state
//
import java.util.Scanner;


public class stateMachine {
public static Scanner input = new Scanner(System.in);


public enum state{
normal, recoveryIdenetification, pressureRecovery, temperatureRecovery, recoveryFailure

}

state currState;

public stateMachine(state currState) {
this.currState = currState;
}


public static void begin(){
stateMachine enter = new stateMachine(state.normal);
enter.stateTraverse();
}

public void stateInput(state currState){
int s=-1;
while(!input.hasNextInt()) {
    input.next();
}
s = input.nextInt();

if(s > 4)
   stateTraverse();

if (currState == state.normal) {
   if(s==1) {
       stateMachine r = new stateMachine(state.recoveryIdenetification);
       r.stateTraverse();
   } else{
       stateTraverse();
   }
}

if (currState == state.recoveryIdenetification) {
   if(s==2) {
       stateMachine p = new stateMachine(state.pressureRecovery);
       p.stateTraverse();
   } if(s==3) {
       stateMachine t = new stateMachine(state.temperatureRecovery);
       t.stateTraverse();
   } if(s==4) {
       stateMachine f = new stateMachine(state.recoveryFailure);
       f.stateTraverse();
   } else{
       stateTraverse();
   }

}

if (currState == state.pressureRecovery) {
   if(s==0) {
       stateMachine n = new stateMachine(state.normal);
   } if(s==4) {
       stateMachine f = new stateMachine(state.recoveryFailure);
   } else{
       stateTraverse();
   }
}

if (currState == state.temperatureRecovery) {
   if(s==0) {
       stateMachine n = new stateMachine(state.normal);
   } if(s==4) {
       stateMachine f = new stateMachine(state.recoveryFailure);
   } else{
       stateTraverse();
   }
}




}


public void stateTraverse() {
switch (currState) {
   case normal:
       System.out.println("Normal state...");
       System.out.println("Enter 1 to produce anomoly:");
       stateInput(currState);

   case recoveryIdenetification:
       System.out.println("Recovery identification state...");
       System.out.println("Enter 2 for pressure recovery state:");
       System.out.println("Enter 3 for temperature recovery state:");
       System.out.println("Enter 4 for recovery failure");
       stateInput(currState);



   case pressureRecovery:
       System.out.println("Pressure recovery state...");
       System.out.println("Enter 0 for normal state:");
       System.out.println("Enter 4 for recovery failure:");
       stateInput(currState);



   case temperatureRecovery:
       System.out.println("temperature recovery state...");
       System.out.println("Enter 0 for normal state:");
       System.out.println("Enter 4 for recovery failure:");
       stateInput(currState);
       
   case recoveryFailure:
	   System.out.println("recovery failed, bye.");
	   System.exit(0);



   default:
       System.out.println(currState + " state...");

}
}

public static void main(String[] args){
begin();
}
}//end
