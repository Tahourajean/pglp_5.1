/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonnelSerialization;

import fr.uvsq.Personnel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author USER
 */
public class PersDeserializable {
    
    public Personnel persoDeserialize() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        
         FileInputStream fis =new FileInputStream("C:\\Users\\USER\\Desktop\\coursM1\\s2\\PGL\\pglp_5.1\\personnel.txt");
            ObjectInputStream ois =new ObjectInputStream(fis);
            Personnel p=(Personnel) ois.readObject();
            
            ois.close();
       
        return p;
    }
    }
            
        
       
    

