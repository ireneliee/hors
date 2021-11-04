/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.GuestEntity;
import javax.ejb.Remote;
import util.exception.GuestNotFoundException;
import util.exception.InvalidLoginCredentialException;
import util.exception.UnknownPersistenceException;
import util.exception.UsernameExistException;

/**
 *
 * @author irene
 */
@Remote
public interface HorsReservationClientControllerRemote {
    
    public GuestEntity guestLogin(String username, String password) throws InvalidLoginCredentialException;

    public GuestEntity retrieveGuestByUsername(String username) throws GuestNotFoundException;

    public Long guestRegister(GuestEntity newGuestEntity) throws UsernameExistException, UnknownPersistenceException;
    
}
