package ma.voicecontrol.api.repositories;

import ma.voicecontrol.api.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MailRepository extends JpaRepository<Mail, Long> {

    Optional<Mail> findBySubject(String subject);

    @Query("select m from Mail m where m.utilisateur.id = ?1")
    List<Mail> findByUtilisateur(Long id);
    List<Mail> findAll();
}
