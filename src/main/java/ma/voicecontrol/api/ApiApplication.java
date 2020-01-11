package ma.voicecontrol.api;

import ma.voicecontrol.api.model.Utilisateur;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ma.voicecontrol.api.services.UtilisateurService;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(UtilisateurService utilisateurService){
        return args -> {
            utilisateurService.add(new Utilisateur());
        };
    }

}
