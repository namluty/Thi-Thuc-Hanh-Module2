package storage;

import model.Contacts;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteCsv {
    private static final String COMMA_DELIMITER = "\t" + "\t";
    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "fullName,phoneNumber,address,email,facebook";

    public static void main(String[] args) {
        String fileName = "contacts.csv";
        writeCsvFile(fileName);
    }

    public static void writeCsvFile(String fileName) {
        Contacts contacts1 = new Contacts("Nguyen Van Than", 123456789, "Nam Dinh", "nguyenthan@gmail.com", "Nguyen Than");
        Contacts contacts2 = new Contacts("Hoang Manh Cuong", 123452323, "Thai Binh", "hoangcuong@gmail.com", "Hoang Cuong");
        Contacts contacts3 = new Contacts("Do Xuan Van", 132326789, "Hai Duong", "xuanvan@gmail.com", "Xuan Van");

        List<Contacts> contacts = new ArrayList<>();
        contacts.add(contacts1);
        contacts.add(contacts2);
        contacts.add(contacts3);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);

            // Write the CSV file header
            fileWriter.append(FILE_HEADER);

            // Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            // Write a new Country object list to the CSV file
            for (Contacts contact : contacts) {
                fileWriter.append(String.valueOf(contact.getFullName()));
                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(contact.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(contact.getFacebook());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
}
