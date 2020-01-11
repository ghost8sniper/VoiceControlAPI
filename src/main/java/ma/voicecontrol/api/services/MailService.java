package ma.voicecontrol.api.services;

import ma.voicecontrol.api.interfaces.MailMetier;
import ma.voicecontrol.api.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.voicecontrol.api.repositories.MailRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MailService implements MailMetier {

    @Autowired
    private MailRepository repository;

    @Override
    public void add(Mail mail) {
        repository.save(mail);
    }

    @Override
    public boolean update(Mail mail) {
        Mail mailToUpdate = repository.getOne(mail.getId());
        mailToUpdate.setContenu(mail.getContenu());
        mailToUpdate.setSubject(mail.getSubject());
        mailToUpdate.setFromm(mail.getFromm());
        mailToUpdate.setToo(mail.getToo());
        return repository.save(mailToUpdate)!=null;
    }

    @Override
    public void delete(Mail mail) {
        repository.delete(mail);
    }

    @Override
    public Optional<Mail> findMailBySubject(String subject) {
        return repository.findBySubject(subject);
    }

    @Override
    public Optional<Mail> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Mail> findByUtilisateur(Long idUser) {
        return repository.findByUtilisateur(idUser);
    }

    @Override
    public List<Mail> findAll() {
        return repository.findAll();
    }
}
