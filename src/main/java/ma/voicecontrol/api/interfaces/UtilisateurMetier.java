package ma.voicecontrol.api.interfaces;

import ma.voicecontrol.api.model.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurMetier {

    void add(Utilisateur user);
    boolean update(Utilisateur user);
    void delete(Utilisateur user);

    Optional<Utilisateur> findUserByEmail(String email);
    Optional<Utilisateur> findById(Long idUser);
    List<Utilisateur> findAll();
}
