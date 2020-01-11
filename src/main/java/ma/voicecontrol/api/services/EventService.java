package ma.voicecontrol.api.services;

import ma.voicecontrol.api.interfaces.EventMetier;
import ma.voicecontrol.api.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.voicecontrol.api.repositories.EventRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EventService implements EventMetier {

    @Autowired
    private EventRepository repository;

    @Override
    public void add(Event event) {
        repository.save(event);
    }

    @Override
    public boolean update(Event event) {
        Event eventToUpdate = repository.getOne(event.getId());
        eventToUpdate.setIntitule(event.getIntitule());
        eventToUpdate.setDate(event.getDate());
        return repository.save(eventToUpdate)!=null;
    }

    @Override
    public void delete(Event event) {
        repository.delete(event);
    }

    @Override
    public List<Event> findEventByDate(Date dateDebut, Date dateFin) {
        return repository.findByDate(dateDebut, dateFin);
    }

    @Override
    public Optional<Event> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Event> findByUtilisateur(Long idUser) {
        return repository.findByUtilisateur(idUser);
    }

    @Override
    public List<Event> findAll() {
        return repository.findAll();
    }
}
