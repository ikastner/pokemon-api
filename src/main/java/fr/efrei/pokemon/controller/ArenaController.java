package fr.efrei.pokemon.controllers;

import fr.efrei.pokemon.models.Arena;
import fr.efrei.pokemon.services.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;
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

    // Tous les combats
    @GetMapping
    public ResponseEntity<List<Arena>> findAll() {
        List<Arena> arenas = arenaService.findAll();
        return ResponseEntity.ok(arenas);
    }

    // Créer un combat
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Arena arena) {
        arenaService.save(arena);
        return ResponseEntity.ok().build();
    }
}
