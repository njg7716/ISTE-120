public class Maternity extends Patient{
    private String childsName;

    /**
    * The parameterized Constructor for the Surgical Object
    *
    * @param _id            The patients identification number
    * @param _name          The patients name
    * @param _tv            If the patient has a tv or not
    * @param _childsName    The name of the child
    * @return               A new Surgical object
    */
    public Maternity(int _id, String _name, int _tv, String _childsName){
        super(_id, _name, MATERNITY_WING, _tv);
        childsName = _childsName;
    }

    /**
    *   Returns useful information about the patient as a String
    * @return       A string to print about the patient
    */
    public String toString(){
        String output = String.format("Maternity %sThe chosen name for the child is %s.", super.toString(), childsName);
        return output;
    }

    /**
    *   Returns the wing the patient is in
    * @return       the wing the patient is in
    */
    public String getWing(){return MATERNITY_WING;}
}