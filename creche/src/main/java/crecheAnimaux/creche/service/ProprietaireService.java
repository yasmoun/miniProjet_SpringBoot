package crecheAnimaux.creche.service ;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crecheAnimaux.creche.entity.Proprietaire;
import crecheAnimaux.creche.repository.ProprietaireRepository;

/*import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import crecheAnimaux.creche.entity.Proprietaire;
import crecheAnimaux.creche.repository.ProprietaireRepository;

@Service
public class ProprietaireService implements UserDetailsService {

    @Autowired
    private ProprietaireRepository proprietaireRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Proprietaire> proprietaire = proprietaireRepository.findByEmail(email);
        if (proprietaire.isPresent()) {
            var userObj = proprietaire.get();
            return User.builder()
                    .username(userObj.getEmail())
                    .password(userObj.getPassword())
                    .roles(getRoles(userObj))
                    .build();
        } else {
            throw new UsernameNotFoundException(email);
        }
    }

    private String[] getRoles(Proprietaire proprietaire) {
        if (proprietaire.getRole() == null) {
            return new String[] { "USER" };
        }
        return proprietaire.getRole().split(",");
    }
}*/


@Service
public class ProprietaireService{
	@Autowired
    private ProprietaireRepository proprietaireRepository;
	public String getNomAndPrenomByEmail(String email) {
        Optional<Proprietaire> proprietaire = proprietaireRepository.findByEmail(email);
        if (proprietaire.isPresent()) {
            return proprietaire.get().getNomP() + " " + proprietaire.get().getPrenomP();
        } else {
            return "Proprietaire not found for email: " + email;
        }
    }
}