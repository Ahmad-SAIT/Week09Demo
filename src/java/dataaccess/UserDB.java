/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import javax.persistence.EntityManager;
import models.User;

/**
 *
 * @author aalmasri
 */
public class UserDB {
    
    public User get(String owner) throws Exception {
        
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            // noteID = 123
           User user = em.find(User.class, owner);
           return user;
        } finally {
            em.close();
        }

    }
    
}
