import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class CopyA{

    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Please enter 3 command line arguments. First is an input file, second is an output file, and lastly 'r' to replace or 'a' to append.");
            System.exit(1);
        }
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);
        String option = args[2].toLowerCase();
        ArrayList<String> contents = new ArrayList<String>();

        if(inputFile.exists() && inputFile.canRead()){
            try{

                FileReader reader = new FileReader(inputFile);
                Scanner scan = new Scanner(reader);
                try{
                    //Reads in file line by line and adds it to a String buffer
                    while(scan.hasNext()){
                        contents.add(scan.nextLine());
                    }
                    reader.close();
                    scan.close();
                }catch(IOException e){System.out.println(e);}

            }catch(FileNotFoundException e){System.out.println(e);}

            if(outputFile.exists()){
                if(option.equals("r")){
                    try{
                        FileWriter writer = new FileWriter(outputFile);
                        PrintWriter printWriter = new PrintWriter(writer);
                        for(String line : contents){
                            printWriter.println(line);
                        }
                        printWriter.close();
                    }catch(IOException e){System.out.println(e);}
                }
                if(option.equals("a")){
                    try{
                        FileWriter writer = new FileWriter(outputFile, true);
                        PrintWriter printWriter = new PrintWriter(writer);
                        for(String line : contents){
                            printWriter.println(line);
                        }
                        printWriter.close();
                    }catch(IOException e){System.out.println(e);}
                }
            }else{
                //Just make the file and put contents in there
                try{
                    outputFile.createNewFile();
                    FileWriter writer = new FileWriter(outputFile);
                    PrintWriter printWriter = new PrintWriter(writer);
                    for(String line : contents){
                        printWriter.println(line);
                    }
                    printWriter.close();
                }catch(IOException e){System.out.println(e);}
            }
        }
        else{
            System.out.println("Input file does not exist.");
            System.exit(1);
        }
        

    }
}