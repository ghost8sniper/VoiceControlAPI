package ma.voicecontrol.api.interfaces;


import ma.voicecontrol.api.model.Event;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface EventMetier {

    void add(Event event);
    boolean update(Event event);
    void delete(Event event);

    List<Event> findEventByDate(Date dateDebut, Date dateFin);
    Optional<Event> findById(Long id);
    List<Event> findByUtilisateur(Long idUser);
    List<Event> findAll();
}
