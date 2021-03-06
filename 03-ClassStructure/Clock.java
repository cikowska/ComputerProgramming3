
/*20.	Define a class Clock that represents a digital clock.
 * It has two attributes: hour and minute. The hour value ranges from 0 to 23.
 * The minute value ranges from 0 to 59. Next, define the following
 * constructors:
a.	Clock() – initialises clock to 00:00
b.	Clock(hour,minute) – initialises clock to hour:minute
Then, define methods:
c.	setClock(hour,minute)
d.	setClock() - reset clock to 00:00
e.	displayTime()
f.	addOneMinute()
After that, write a program that:
g.	creates a clock with starting time 12:47
h.	displays time
i.	sets a clock to 18:14
j.	displays time
k.	sets a clock to 09:03
l.	displays time
m.	sets a clock to 23:58
n.	displays time
o.	adds one minute
p.	displays time
q.	adds one minute
r.	displays time

21.	Add an alarm function to the clock. Complete the class definition with the attributes: alarmHour, alarmMinute.
Add methods: setAlarm(hour, minute) and runAlarm(), which displays the "beep-beep-beep-beep !!" alarm sound. Turn on the
alarm when the alarm time is the same as the clock time(compare times in the addOneMinute() method). 

 */
public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    /**
     * Constructor for objects of class Clock
     */
    public Clock()
    {
        this.hour = 0;
        this.minute = 0;
    }
    public Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    
    public void setClock(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
        
    
    }
    
    public void setClock(){
        this.hour = 0;
        this.minute = 0;
    }
    
    public void displayTime(){
        if (hour>=0 && hour<10){
            if (minute>=0 && minute<10){
                System.out.println("time: "+"0"+hour+":0"+minute); 
                
            }
            else {
                System.out.println("time: "+"0"+hour+":"+minute); 
            }
            }
        else{
            if (minute>=0 && minute<10){
                System.out.println("time: "+hour+":0"+minute); 
                
            }
            else {
                System.out.println("time: "+hour+":"+minute); 
            }
        }
    }
    
    public void addOneMinute(){
        this.minute++;
        if (this.minute==60){
            this.minute = 0;
            this.hour++;
            if (this.hour==24){
                this.hour=0;
            }
        }
        if (this.minute == alarmMinute && this.hour ==alarmHour){
            runAlarm();
        }
    }
    
    public void setAlarm(int hour, int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
        
    }
    
 

    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }

    
    public static void main(String[] args){
        Clock clock1 = new Clock(12,42);
        clock1.setAlarm(23,59);
        clock1.displayTime();
        clock1.setClock(18,14);
        clock1.displayTime();
        clock1.setClock(9,3);
        clock1.displayTime();
        clock1.setClock(23,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
    }
}

