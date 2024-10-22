package fr.efrei.pokemon.controllers;

import fr.efrei.pokemon.models.Combat;
import fr.efrei.pokemon.services.CombatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/combats")
public class CombatController {

    private final CombatService combatService;

    @Autowired
    public CombatController(CombatService combatService) {
        this.combatService = combatService;
    }

    // Tous les combats
    @GetMapping
    public ResponseEntity<List<Combat>> findAll() {
        List<Combat> combats = combatService.findAll();
        return ResponseEntity.ok(combats);
    }

    // Créer un combat
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Combat combat) {
        combatService.save(combat);
        return ResponseEntity.ok().build();
    }
}