package Utils;

import POJOs.Adventurer;
import Screens.MainForm;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManagementTools {
    
    private final Gson gson = new Gson();
    private final String locationFile = "src\\main\\java\\Files\\Characters File.json";

    public void ReadFile(ArrayList<Adventurer> adventurersList) {
        try {

            Reader reader = reader = Files.newBufferedReader(Paths.get(locationFile));
            Adventurer[] adventurers = gson.fromJson(reader, Adventurer[].class);
            reader.close();
            if (adventurers != null) {
                for (Adventurer adventurer : adventurers) {
                    adventurersList.add(adventurer);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void WriteFile(ArrayList<Adventurer> adventurersList) {

        try {
            String adventurersJsonContent = gson.toJson(adventurersList);
            Writer fileWriter = new FileWriter(locationFile);
            fileWriter.write(adventurersJsonContent);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CheckFileExist() {
        try {
            File charactersFile = new File(locationFile);
            if (!charactersFile.exists()) {
                charactersFile.createNewFile();
            }
        } catch (Exception e) {
            System.err.println("There has been an issue with the files");
        }
    }
}