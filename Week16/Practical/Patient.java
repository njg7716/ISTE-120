
public class Patient implements Options{
    private String name;
    private int id;
    private String wing;
    private int tv;

    /**
    * Default constructor for the Patient object
    *
    * @return       a new Patient object
    */
    public Patient(){
        name = "Undefined";
        wing = "Undefined";
        id = -1;
        tv = -1;
    }

    /**
    * The parameterized Constructor for the Patient Object
    *
    * @param _id      The patients identification number
    * @param _name    The patients name
    * @param _wing    The wing that patient is in
    * @param _tv      If the patient has a tv or not
    * @return         A new Patient object
    */
    public Patient(int _id, String _name, String _wing, int _tv){
        id = _id;
        name = _name;
        wing = _wing;
        tv = _tv;
    }

    /**
    * @return       The wing that the Patient is in
    */
    public String getWing(){return wing;}

    /**
    * @return       A string to print about the patient
    */
    public String toString(){
        String output = String.format("Patient %05d:%s is in wing %s.%n", id, name, wing);
        if(tv == 1){
            output += String.format("This is a room with a TV.%n");
            return output;
        }
        if(tv == 2){
            output += String.format("This is a room without a TV.%n");
            return output;
        }
        else{
            output += String.format("It is not known if the room as a tv.%n");
            return output;
        }
    }

}