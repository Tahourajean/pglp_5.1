/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import PersonnelSerialization.PersDeserializable;
import PersonnelSerialization.PersSerializable;
import fr.uvsq.Personnel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class PersonnelDAO  extends DAO<Personnel>{

    @Override
    public Personnel create(Personnel objet) {
        PersSerializable pers=new PersSerializable();
         objet=pers.persoSerialize();
         return objet;
    }

    @Override
    public Personnel update(Personnel objet) {
        PersDeserializable persD=new PersDeserializable();
        try {
            objet=persD.persoDeserialize();
           
        } catch (IOException ex) {
            Logger.getLogger(PersonnelDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonnelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objet;
    }

    @Override
    public Personnel delete(Personnel objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
