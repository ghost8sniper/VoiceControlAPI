package ma.voicecontrol.api.repositories;

import ma.voicecontrol.api.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByEmail(String email);
    Optional<Utilisateur> findById(Long id);
    List<Utilisateur> findAll();
}
