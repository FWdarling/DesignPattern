package DAO;

import java.io.*;
import java.util.Base64;

public class AnimalDaoImlp implements AnimalDao{
    private String filePath = new String("");

    @Override
    public Animal getAnimal() {
        try {
            FileInputStream in = new FileInputStream(filePath);
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            String str = new String(buffer, "UTF-8");
            Animal state_animal = (Animal) fromString(str);
            return state_animal;
        }catch (ClassNotFoundException | IOException e){
            return null;
        }
    }

    @Override
    public void updateAnimal(Animal animal) {

        try {
            String str=toString(animal);
            FileOutputStream fileOut = new FileOutputStream(filePath);
            fileOut.write(str.getBytes());
            fileOut.close();
            System.out.println("Animal data is saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Read the object from Base64 string. */
    private  Object fromString( String s ) throws IOException,
            ClassNotFoundException {
        byte [] data = Base64.getDecoder().decode( s );
        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(  data ) );
        Object o  = ois.readObject();
        ois.close();
        return o;
    }

    /** Write the object to a Base64 string. */
    private String toString( Serializable o ) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream( baos );
        oos.writeObject( o );
        oos.close();
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }
}
