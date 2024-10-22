package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Combat;
import fr.efrei.pokemon.repositories.CombatRepository;
import jakarta.transaction.Transactional;
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

    public Combat findById(String id) {
        return combatRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        combatRepository.deleteById(id);
    }

    @Transactional
    public void update(String id, Combat combat) {
        Combat combatToUpdate = findById(id);
        combatToUpdate.setPokemon1(combat.getPokemon1());
        combatToUpdate.setPokemon2(combat.getPokemon2());
        combatToUpdate.setArena(combat.getArena());
        save(combatToUpdate);
    }

    @Transactional
    public void partialUpdate(String id, Combat combat) {
        Combat combatToUpdate = findById(id);
        if(combat.getPokemon1() != null) {
            combatToUpdate.setPokemon1(combat.getPokemon1());
        }
        if(combat.getPokemon2() != null) {
            combatToUpdate.setPokemon2(combat.getPokemon2());
        }
        if(combat.getArena() != null) {
            combatToUpdate.setArena(combat.getArena());
        }
        save(combatToUpdate);
    }




}
