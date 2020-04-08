/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonnelSerialization;

import fr.uvsq.Personnel;
import fr.uvsq.Telephone;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.tools.FileObject;

/**
 *
 * @author USER
 */
public class PersSerializable {
    Personnel p = new Personnel.Builder("Simporé","Naimatou")
                .ajouterTelephone(new Telephone("75221521","0751548227" ,"72556688")).build();
    public void persoSerialize()
    {
        try {
            FileOutputStream fos 
            =new FileOutputStream("C:\\Users\\USER\\Desktop\\coursM1\\s2\\PGL\\pglp_5.1\\personnel.txt");
            ObjectOutputStream os =new ObjectOutputStream(fos);
            os.writeObject(p);
            System.out.println("objet sérialisé");
            os.close();
            
            } catch (Exception e) {
                e.printStackTrace();
        }
        
    }
    
}
