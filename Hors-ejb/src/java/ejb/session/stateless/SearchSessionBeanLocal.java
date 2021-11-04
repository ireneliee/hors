/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.RoomTypeEntity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import javax.ejb.Local;
import util.exception.RateNotFoundException;

/**
 *
 * @author irene
 */
@Local
public interface SearchSessionBeanLocal {

    public Map<RoomTypeEntity, Integer> findAvailableRoomTypes(LocalDate checkIn, LocalDate checkOut);

    public BigDecimal calculatePublishedRate(LocalDate checkIn, LocalDate checkOut, RoomTypeEntity roomType) throws RateNotFoundException;

    public BigDecimal calculateNonPublishedRate(LocalDate checkIn, LocalDate checkOut, RoomTypeEntity roomType) throws RateNotFoundException;
    
}
