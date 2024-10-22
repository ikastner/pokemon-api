package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Combat;
import fr.efrei.pokemon.repositories.CombatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombatService {
    private final CombatRepository combatRepository;

    @Autowired
    public CombatService(CombatRepository combatRepository) {
        this.combatRepository = combatRepository;
    }

    public List<Combat> findAll() {
        return combatRepository.findAll();
    }

    public void save(Combat combat) {
        combatRepository.save(combat);
    }
}
