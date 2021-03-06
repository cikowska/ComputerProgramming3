
/*16.	There are many devices that can use the Internet: a personal computer,
 * laptop, tablet, smartphone, internet radio or TV.
 * Define an InternetDevice class to describe such devices.
 * The class should contain attributes: name (device name), connected
 * (whether a device is connected to the Internet), and connectedDevices
 * (the number of connected devices - static field). Add a constructor
 * InternetDevice(name) and methods for device manipulation: connect(),
 * disconnect(), isConnected(), displayStatus(), displayConnections()
 * (static method). Then write a program that creates five different
 * internet devices, three of which are connected to the Internet.
 * Display the status of each device and information about the number of
 * devices connected to the Internet. 
 */
public class InternetDevice
{
    // instance variables - replace the example below with your own
    String name;
    boolean connected = false;
    static int connectedDivices = 0;
    


    public InternetDevice(String name)
    {
        this.name = name;
    }

    
    
    public void connect()
    {
        if (!isConnected()){
        connected = true;
        connectedDivices++;
       }
       
    }  
    public void disconnect(){
        if (isConnected()){
        connected = false;
        connectedDivices--;
       }
    }
    
    public boolean isConnected(){
        if (connected){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void displayStatus(){
        if (connected) {
            System.out.println("Internet device "+name+" is connected");
        }
        else {
            System.out.println("Internet device "+name+"  is disconnected");
        }
    }
    
    public static void displayConnections(){
        System.out.println("Devices connected: "+connectedDivices);
        
    }
    
    public static void main(String[] args){
        InternetDevice device1 = new InternetDevice("Smartphon");
        InternetDevice device2 = new InternetDevice("Tablet");
        InternetDevice device3 = new InternetDevice("PC");
        InternetDevice device4 = new InternetDevice("Printer");
        InternetDevice device5 = new InternetDevice("Fridge");
        device1.connect();
        device2.disconnect();
        device3.connect();
        device4.disconnect();
        device5.connect();
        device1.displayStatus();
        device2.displayStatus();
        device3.displayStatus();
        device4.displayStatus();
        device5.displayStatus();
        displayConnections();
    }
       
    }

