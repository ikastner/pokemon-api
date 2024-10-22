package fr.efrei.pokemon.controllers;

import fr.efrei.pokemon.models.Combat;
import fr.efrei.pokemon.services.CombatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return new ResponseEntity<>(combats, HttpStatus.OK);
    }

    // Créer un combat
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Combat combat) {
        combatService.save(combat);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // Supprimer un combat
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id) {
        combatService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Trouver un combat
    @GetMapping("/{id}")
    public ResponseEntity<Combat> findById(@PathVariable String id) {
        Combat combat = combatService.findById(id);
        if (combat == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Combat combat) {
        combatService.update(id, combat);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}