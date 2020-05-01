import java.util.ArrayList;
import java.io.*;

public class Hospital {
    public final static String FILENAME = "Patients.txt";

    public static void main(String[] args){
        //Create an arraylist to hold all the patients
        ArrayList<Patient> patients = new ArrayList<Patient>();

        //Hard code the creation of these patients
        Surgical harry = new Surgical(345, "Harry T. Everyman", 2,"Bowl Resection");
        Maternity martha = new Maternity(20389, "Martha G. Biggens", 1, "Thomas");
        Surgical hannah = new Surgical(3453, "Hannah V. Watkins", 1, "Knee Replacement");
        Maternity jane = new Maternity(98234, "Jane C. Morrison", 2, "Robert");
        Surgical james = new Surgical(11923, "James X. Doherty", 1, "Hip Replacement");

        //Add all the patients to the array list
        patients.add(harry);
        patients.add(martha);
        patients.add(hannah);
        patients.add(jane);
        patients.add(james);

        //Prepare to catch exception
        try{
            File f = new File(FILENAME);
            FileWriter writer;

            //If file exists then append to the file
            if(f.exists()){
                System.out.printf("Adding to the current file %s%n", FILENAME);
                writer = new FileWriter(f, true);
            }
            //If file does not exist, create a new file
            else{
                System.out.printf("Creating a new file %s%n", FILENAME);
                f.createNewFile();
                writer = new FileWriter(f);
            }

            //vars to keep track of how many of each kind of patient
            int surgical = 0;
            int maternity = 0;

            //loop through the array list
            System.out.println("Patient report:");
            writer.write("Patient report:\n");
            for(Patient p : patients){

                //print the patient using their toString()
                System.out.println(p);
                //Add another empty line to make it look nice
                System.out.println();
                
                //Write patient info to file
                writer.write(p.toString() + "\n\n");

                //check the wing they are in to increment the appropriate counter
                if(p.getWing().equals("B")){
                    maternity++;
                }
                else if(p.getWing().equals("D")){
                    surgical++;
                }
            }

            //print out both counters
            System.out.println(String.format("Surgical patients: %d", surgical));
            System.out.println(String.format("Maternity patients: %d", maternity));
            //write counters to file
            writer.write(String.format("Surgical patients: %d%n", surgical));
            writer.write(String.format("Maternity patients: %d%n%n%n", maternity));
            
            //flush and close the file
            writer.flush();
            writer.close();
        }
        //Catch the IO exception and exit
        catch (IOException e){
            System.out.println("IOException encoutered...");
            System.exit(1);
        }
    }

}