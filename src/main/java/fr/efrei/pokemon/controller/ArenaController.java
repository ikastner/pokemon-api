package fr.efrei.pokemon.controllers;

import fr.efrei.pokemon.dto.CreateArena;
import fr.efrei.pokemon.models.Arena;
import fr.efrei.pokemon.services.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arenas")
public class ArenaController {

    private final ArenaService arenaService;

    @Autowired
    public ArenaController(ArenaService arenaService) {
        this.arenaService = arenaService;
    }

    // Tous les Arena
    @GetMapping
    public ResponseEntity<List<Arena>> findAll() {
        List<Arena> arenas = arenaService.findAll();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Créer un Arena
    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateArena arena) {
        arenaService.save(arena);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // Trouver une arèna
    @GetMapping("/{id}")
    public ResponseEntity<Arena> findById(@PathVariable String id) {
        Arena arena = arenaService.findById(id);
        if (arena == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
