package fr.efrei.pokemon.services;

import fr.efrei.pokemon.dto.CreateArena;
import fr.efrei.pokemon.models.Arena;
import jakarta.transaction.Transactional;
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

    public void save(CreateArena arenaBody) {
        Arena arena = new Arena();
        arena.setName(arenaBody.getName());
        arenaRepository.save(arena);
    }

    public Arena findById(String id) {
        return arenaRepository.findById(id).orElse(null);
    }

    @Transactional
    public void update(String id, CreateArena arenaBody) {
        Arena arenaToUpdate = findById(id);
        arenaToUpdate.setName(arenaBody.getName());
        arenaRepository.save(arenaToUpdate);
    }
}
