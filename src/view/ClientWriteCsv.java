package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientWriteCsv {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("contacts.csv"));

            while ((line = br.readLine()) != null) {
                printContacts(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void printContacts(List<String> contacts) {
        System.out.println(
                "Contacts[fullName= "
                        + contacts.get(0)
                        + ", phoneNumber= " + contacts.get(1)
                        + " , address=" + contacts.get(2)
                        + ", email= " + contacts.get(3)
                        + " , facebook=" + contacts.get(4)
                        + "]");
    }
}
