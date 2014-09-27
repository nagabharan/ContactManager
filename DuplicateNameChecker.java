////////////////////////////////////////////////////////////////////////////////
//-------------------------DuplicateNameChecker.java--------------------------//
//                                                                            //
// This program will check for duplicate names present in the ContactList.txt //
// file. It creates a HashSet of Strings by reading the file and returns a    //
// value based on the input provided to the function saveWord().              //
//                                                                            //
// Name: Nagabharan Nagendran                                                 //
// Net ID: nxn141730                                                          //
// Date created: 09.19.2014                                                   //
// Purpose: Assignment                                                        //
// Class: CS6301.022 User Interface Design                                    //
////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class DuplicateNameChecker {
    private HashSet<String> uniqueTester = new HashSet<String>();
    private String fileLocation = "ContactList.txt";

    private static DuplicateNameChecker instance = null;

    private DuplicateNameChecker() throws IOException {
        readWordsFromFile();
    }

    public static DuplicateNameChecker getInstance() throws IOException {
        if (instance == null)
                instance = new DuplicateNameChecker();
        return instance;
    }

    public int saveWord(String word) {
        if (!uniqueTester.contains(word)) {
                uniqueTester.add(word);
                return 0;
        } else {
                return 1;
        }
    }

    private void readWordsFromFile() throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File(
                        fileLocation)));
        String line;
        while ((line = br.readLine()) != null) {
                String[] w = line.split(":");
                if ((!uniqueTester.contains(w[0]))&&(!uniqueTester.contains(w[1]))&&(!uniqueTester.contains(w[2]))) {
                        uniqueTester.add(w[0]+w[1]+w[2]);
                }
        }
    }
}