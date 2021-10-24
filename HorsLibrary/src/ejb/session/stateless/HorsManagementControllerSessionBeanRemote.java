/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.EmployeeEntity;
import javax.ejb.Remote;
import util.exception.InvalidLoginCredentialException;
import util.exception.UnknownPersistenceException;
import util.exception.UsernameExistException;

/**
 *
 * @author irene
 */
@Remote
public interface HorsManagementControllerSessionBeanRemote {
    
     public Long createNewEmployee(EmployeeEntity newEmployeeEntity) throws UnknownPersistenceException, UsernameExistException;
     
     public EmployeeEntity employeeLogin(String username, String password) throws InvalidLoginCredentialException;
}
