package no.hiof.olawp.SuperhelterJson;

import no.hiof.olawp.SuperhelterJson.model.Superhelt;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    skrivSerialisertObjektTilFil();

	    lesSerialisertObjektFraFil();
    }

    private static void lesSerialisertObjektFraFil(){
        File fil = new File("superhelter.ser");

        try {
            FileInputStream fileIn = new FileInputStream(fil);

            BufferedInputStream bufferIn = new BufferedInputStream(fileIn);

            ObjectInputStream objectIn = new ObjectInputStream(bufferIn);

            ArrayList<Superhelt> superhelter = (ArrayList<Superhelt>) objectIn.readObject();

            System.out.println(superhelter);

            objectIn.close();
            bufferIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }


    private static void skrivSerialisertObjektTilFil(){
        ArrayList<Superhelt> superheltArrayList = new ArrayList<>();

        superheltArrayList.add(new Superhelt("Batman","Bruce Wayne"));
        superheltArrayList.add(new Superhelt("Hulk","Bruce Banner"));
        superheltArrayList.add(new Superhelt("Superman","Clark Kent"));

        File fil = new File("Superhelter.ser");

        try {
            FileOutputStream fileOut = new FileOutputStream(fil);
            BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut);
            ObjectOutputStream objectOut = new ObjectOutputStream(bufferOut);
            objectOut.writeObject(superheltArrayList);

            objectOut.flush();

            objectOut.close();
            bufferOut.close();
            fileOut.close();

        } catch (IOException e){
            System.out.println(e);
        }
    }
}
