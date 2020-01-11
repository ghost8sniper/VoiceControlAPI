package ma.voicecontrol.api.repositories;

import ma.voicecontrol.api.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {

    Optional<Event> findById(Long id);
    List<Event> findAll();

    @Query("select e from Event e where e.utilisateur.id = ?1")
    List<Event> findByUtilisateur(Long idUser);

    @Query("select e from Event e where e.date>= ?1 and e.date< ?2")
    List<Event> findByDate(Date dateDebut, Date dateFin);
}
