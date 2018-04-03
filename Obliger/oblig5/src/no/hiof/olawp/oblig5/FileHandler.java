package no.hiof.olawp.oblig5;

import no.hiof.olawp.oblig5.model.Film;
import no.hiof.olawp.oblig5.model.Production;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public static void readFile() {

        String fileName = "filmer.csv";
        File file = new File(fileName);
        String noe = "noe"; //Variable for testing invalid filepath

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null){
                String[]values = line.split(";");


                String title = values[0];
                int runtime = Integer.parseInt(values[2]);
                String description = values[1];
                LocalDate date = LocalDate.parse(values[3]);
                String poster = values[4];



                Film lmao = new Film(title,runtime,description,date,poster);
                MainJavaFX.mainJavaFXApplication.getAllFilms().add(lmao);

            }



        } catch (FileNotFoundException fnfe) {
            MainJavaFX.mainJavaFXApplication.showMessageBox("Error when trying to read file: " + fnfe.getMessage());
        }catch (IOException ioexc ){
            System.out.println(ioexc);
        }

    }

   public static void writeToFile(){

        File file = new File("filmer.csv");

        if (file.exists()) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for (Film aFilm : MainJavaFX.mainJavaFXApplication.getAllFilms()) {
                    bw.write(aFilm.getTitle() + ";" + aFilm.getDescription() + ";" + aFilm.getRuntime() + ";" + aFilm.getReleaseDate() + ";" + aFilm.getPosterURL());
                    bw.newLine();
                }
            }catch (IOException ioexc) {
                System.out.println(ioexc);
            }
        }
        else
            MainJavaFX.mainJavaFXApplication.showMessageBox("Error when trying to write to file");
    }
}
