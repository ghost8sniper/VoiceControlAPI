package ma.voicecontrol.api.interfaces;

import ma.voicecontrol.api.model.Mail;

import java.util.List;
import java.util.Optional;

public interface MailMetier {

    void add(Mail mail);
    boolean update(Mail mail);
    void delete(Mail mail);

    Optional<Mail> findMailBySubject(String subject);
    Optional<Mail> findById(Long id);
    List<Mail> findByUtilisateur(Long idUser);
    List<Mail> findAll();
}
