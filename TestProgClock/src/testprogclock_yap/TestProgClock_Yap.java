/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogclock_yap;

/**
 *
 * @author Puyas MPC
 */
import java.util.*;

public class TestProgClock_Yap {

  static Scanner console = new Scanner(System.in);
  
    public static void main(String[] args) {
    Clock_Yap myClock = new Clock_Yap (5, 4, 30);
    Clock_Yap yourClock = new Clock_Yap();
    
    int hours;
    int minutes;
    int seconds;
    
    System.out.print("Line 6: myClock: ");
    myClock.printTime();
    System.out.println();
    
    System.out.print("Line 9: yourClock: ");
    yourClock.printTime();
    System.out.println();
    
    yourClock.setTime(5, 45, 16);
    
    System.out.print("Line 13: After setting " + "the time, yourClock: ");
    yourClock.printTime();
    System.out.println();
    
    if (myClock.equals(yourClock))
        System.out.println("Line 17: Both the " + "times are equal.");
    else
        System.out.println("Line 19: The two " + "times are not " + "equal.");
    
    System.out.print("Line 20: Enter the hours, " + "minutes, and seconds: ");
    
    hours = console.nextInt();
    minutes = console.nextInt();
    seconds = console.nextInt();
    System.out.println();
    
    myClock.setTime(hours, minutes, seconds);
    System.out.print("Line 26: New time of " + "myClock: " );
    myClock.printTime();
    System.out.println();
    
    myClock.incrementSeconds();
    
    System.out.print("Line 30: After " + "incrementing the time by " + "one seconds, myClock: ");
    myClock.printTime();
    System.out.println();
    
    yourClock.makeCopy(myClock);
    System.out.print("Line 34: After Copying " + "myClock into yourClock, " + "yourClock: ");
    yourClock.printTime();
    System.out.println();
    
    }
    
    }
    

