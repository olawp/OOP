package no.hiof.olawp.oblig5;

import no.hiof.olawp.oblig5.model.Film;
import no.hiof.olawp.oblig5.model.Production;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public static void readFile() {
        ArrayList<Film> moveieArrayList = new ArrayList<>();

        String fileName = "filmer.csv";
        File file = new File(fileName);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null){
                String[]values = line.split(";");


                String title = values[0];
                int runtime = Integer.parseInt(values[2]);
                String description = values[1];
                LocalDate date = LocalDate.parse(values[3]);



                Film lmao = new Film(title,runtime,description,date);
                //System.out.println(lmao);
                MainJavaFX.mainJavaFXApplication.getAllFilms().add(lmao);

            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
