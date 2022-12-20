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
public class Clock_Yap {
        
    private int hr; //store hours
    private int min; //store minutes
    private int sec; //seconds

    //Default constructor
    //Postcondition: hr=0; min=0;sec;=0
public Clock_Yap()
{
setTime(0, 0, 0);

}
//constructor with parameters, to set the time
//the time is set according to the paramters
//postcondition: hr=hours;min=minutes;sec=seconds
public Clock_Yap(int hours, int minutes, int seconds)
{
    setTime(hours, minutes, seconds);
}
//method to set the time
//the time is set according to the parameters
//postcondition: hr=ondition: hr=hours;min=minutes;sec=seconds
public void setTime(int hours, int minutes, int seconds)
{
    if(0 <= hours && hours < 24)
        hr = hours;
    else 
        hr = 0;
    if (0 <= minutes && minutes < 60)
        min = minutes;
    else
        min = 0;
    if (0 <= seconds && seconds < 60)
        sec = seconds;
    else
        sec = 0;            
}
//method to return the hours
//postcondition: the value of hr is returned.
public int getMinutes()
{
    return min;
}
//method to return the seconds
//postcondition: the value of sec is returned.
public int getSecond()
{
    return sec;
}
//method to print the time
public void printTime()
{
    if (hr < 10)
        System.out.print("0");
    System.out.print(hr + ":");
    
    if (min < 10)
        System.out.print("0");
    System.out.print(min + ":");
    
    if  (sec < 10)
        System.out.print("0");
     System.out.print(sec);
}
//method to increment the time by one second
//postcondition: the time is incremented by one second
//if the before-incremented time is 23:59:59, the time
// is reset to 00:00:00
public void incrementSeconds()
{
    sec++;
    if (sec > 59)
    {
        sec = 0;
        incrementMinutes();
    }
}
//method to increment the time by one minute
//postcondition: the time is incrremented by one minute.
//if the before-incremented is 23:59:53, the time
//is reset to 00:00:53.
public void incrementMinutes()
{
    min++;
    if (min > 59)
    {
        min = 0;
        incrementHours(); 
    }
}
public void incrementHours()
{
    hr++;
    if (hr > 23)
        hr =0;
            
}
//method to compare the two lines
//postcondition: returns true if the time is equal to
//otherClock; otherwise returns false.
public boolean equals(Clock_Yap otherClock)
{
    return (hr == otherClock.hr
            && min == otherClock.min
            &&
            sec == otherClock.sec); 
}
public void makeCopy(Clock_Yap otherClock)
{
    hr = otherClock.hr;
    min = otherClock.min;
    sec = otherClock.sec; 
}
public Clock_Yap getCopy()
{
Clock_Yap temp = new Clock_Yap();
temp.hr = hr;
temp.min = min;
temp.sec = sec;
return temp;
}
}