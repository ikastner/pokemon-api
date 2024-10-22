package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Arena;
import org.springframework.beans.factory.annotation.Autowired;
import fr.efrei.pokemon.repositories.ArenaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArenaService {
    private final ArenaRepository arenaRepository;

    @Autowired
    public ArenaService(ArenaRepository arenaRepository) {
        this.arenaRepository = arenaRepository;
    }

    public List<Arena> findAll() {
        return arenaRepository.findAll();
    }

    public void save(Arena arena) {
        arenaRepository.save(arena);
    }
}
