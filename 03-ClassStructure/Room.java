
/*22.	Define a class Room that represents a hotel room. The class should contain the attributes: number, beds, occupied, and
 * guestName. Add constructors: Room(number) (creates a room with two beds) and Room(number,beds). Next, define methods for
 * room manipulation: checkin(guestName), checkout(), isOccupied(), and displayStatus(). Then write a program in which create
 * three rooms with two beds, two rooms with three beds and one room with one bed. Store all room objects in an array:
Room[] rooms = new Room[6];
Then follow the steps below:
a.	Display status of a single room (room number, number of beds, occupied, guest name). Display data in a single row.
b.	Display a report with a list of rooms (room number, number of beds, occupied, guest name)
c.	Display a report with a list of rooms, limited to rooms with the specified number of beds
d.	Display a report on how many rooms are vacant and how many are occupied
e.	Display a report on how many vacant beds are available
Create a separate static method for each report. Pass a list of rooms (an array) to the defined static methods.

23.	Modify the Room class. Define toString() method that returns information about the room status. Replace the
displayStatus()method with the defined toString() method. Tip: find out in the manual how to define and use the toString()
method. 
*/

public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    public Room(int number){
        this.number = number;
        this.beds = 2;
    }
    
    public Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }
    
    public void checkin(String name){
        
        if (occupied){
            System.out.println("The room is already occupied by"+this.guestName);
        }
        else{
        this.occupied = true;
        this.guestName = name;
    }
    }
    
    public void checkout(){
        this.occupied = false;
        
    }
    
    public boolean isOccupied(){
       return this.occupied;
    }
    
    public String toString(){
        if (isOccupied()){
        return ("Room number: "+this.number+" number of beds: "+this.beds+" occupied: yes guest name: "+this.guestName);
        }
        else{
        return ("Room number: "+this.number+" number of beds: "+this.beds+" occupied: no");
        }
}

public static void displayReport(Room[] rooms){
    
    for(Room r: rooms){
        System.out.println(r);
    }
}

public static void displayReport(Room[] rooms,int beds){
    for(Room r: rooms){
        if (r.beds==beds){
        System.out.println(r);
    }
}
}

public static void displayVacantReport(Room[] rooms){
    int numberVacant = 0;
    int numberOccupied = 0;
    for (Room r: rooms){
        if (r.isOccupied()){
            numberOccupied++;
        }
        else{
            numberVacant++;
        }
    }
    System.out.println("Number of vacant rooms: "+numberVacant+" number of occupied rooms: "+numberOccupied);
}

public static void displayVacantBeds(Room[] rooms){
    int vacantBeds = 0;
    for (Room r: rooms){
        if (!r.isOccupied()){
            vacantBeds+=r.beds;
        }
    }
    System.out.println("Number of vacant beds: "+vacantBeds);
}
/*Then follow the steps below:
a.	Display status of a single room (room number, number of beds, occupied, guest name). Display data in a single row.
b.	Display a report with a list of rooms (room number, number of beds, occupied, guest name)
c.	Display a report with a list of rooms, limited to rooms with the specified number of beds
d.	Display a report on how many rooms are vacant and how many are occupied
e.	Display a report on how many vacant beds are available
Create a separate static method for each report. Pass a list of rooms (an array) to the defined static methods.*/

public static void main(String[] args){
    Room room1 = new Room(1);
    Room room2 = new Room(2);
    Room room3 = new Room(3);
    Room room4 = new Room(4,3);
    Room room5 = new Room(5,3);
    Room room6 = new Room(6,1);
    Room[] rooms = new Room[]{room1,room2, room3, room4, room5, room6};
    
    System.out.println(room1);
    Room.displayReport(rooms);
    Room.displayReport(rooms, 3);
    Room.displayVacantReport(rooms);
    Room.displayVacantBeds(rooms);
    
}
}
