package ma.voicecontrol.api.services;

import ma.voicecontrol.api.interfaces.UtilisateurMetier;
import ma.voicecontrol.api.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ma.voicecontrol.api.repositories.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService implements UtilisateurMetier {

    @Autowired
    private UtilisateurRepository repository;

    @Override
    public void add(Utilisateur user) {
        repository.save(user);
    }

    @Override
    public boolean update(Utilisateur user) {
        Utilisateur utilisateur = repository.getOne(user.getId());
        utilisateur.setAddresse(user.getAddresse());
        utilisateur.setNom(user.getNom());
        utilisateur.setPassword(user.getPassword());
        utilisateur.setEmail(user.getEmail());
        utilisateur.setPrenom(user.getPrenom());
        return repository.save(user)!=null;
    }

    @Override
    public void delete(Utilisateur user) {
        repository.delete(user);
    }

    @Override
    public Optional<Utilisateur> findUserByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Optional<Utilisateur> findById(Long idUser) {
        return repository.findById(idUser);
    }

    @Override
    public List<Utilisateur> findAll() {
        return repository.findAll();
    }
}
