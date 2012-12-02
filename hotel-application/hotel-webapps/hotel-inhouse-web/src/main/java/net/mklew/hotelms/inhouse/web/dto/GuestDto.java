package net.mklew.hotelms.inhouse.web.dto;

import net.mklew.hotelms.domain.guests.Guest;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Marek Lewandowski <marek.m.lewandowski@gmail.com>
 * @since 11/30/12
 *        time 8:14 PM
 */
@XmlRootElement(name = "guestdto")
public class GuestDto
{
    // TODO add fields
    public String firstName;
    public String middleName;
    public String surname;

    public GuestDto()
    {
    }

    public static Collection<GuestDto> fromGuests(Collection<Guest> guests)
    {
        Collection<GuestDto> dtos = new ArrayList<>(guests.size());
        for (Guest guest : guests)
        {
            GuestDto dto = new GuestDto();
            dto.firstName = guest.getFirstName();
            dto.middleName = guest.getMiddleName();
            dto.surname = guest.getSurname();
            dtos.add(dto);
        }
        return dtos;
    }
}