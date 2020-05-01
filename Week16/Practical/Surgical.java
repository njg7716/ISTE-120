public class Surgical extends Patient{
    private String procedure;

    /**
    * The parameterized Constructor for the Surgical Object
    *
    * @param _id        The patients identification number
    * @param _name      The patients name
    * @param _tv        If the patient has a tv or not
    * @param _procedure The name of the procedure
    * @return           A new Surgical object
    */
    public Surgical(int _id, String _name, int _tv, String _procedure){
        super(_id, _name, SURGICAL_WING, _tv);
        procedure = _procedure;
    }

    /**
    * @return       A string to print about the patient
    */
    public String toString(){
        String out = String.format("Surgical %sThe patient's procedure is %s.", super.toString(), procedure);
        return out;
    }

    /**
    * @return       The wing that patient is in
    */
    public String getWing(){return SURGICAL_WING;}
}