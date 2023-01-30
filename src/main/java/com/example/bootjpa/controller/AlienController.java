package com.example.bootjpa.controller;

import com.example.bootjpa.dao.AlienRepo;
import com.example.bootjpa.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @GetMapping("/aliens")
    @ResponseBody
    public List<Alien> getAlien(){
        return (List<Alien>) repo.findAll();
    }

    @GetMapping("/alien/{aid}")
    @ResponseBody
    public Optional<Alien> getAlienById(@PathVariable("aid") int aid){
        return repo.findById(aid);
    }

    @PostMapping("/alien")
    public Alien addAlien(@RequestBody() Alien alien){
        System.out.println(alien);
        repo.save(alien);
        return alien;
    }

    @DeleteMapping("/alien/{aid}")
    public Optional<Alien> deleteAlien(@PathVariable("aid") int aid){
        Optional<Alien> alien = repo.findById(aid);
         repo.deleteById(aid);
         return alien;
    }

    @PutMapping("/alien")
    public Optional<Alien> updateOrSaveAlien(@RequestBody() Alien alien){
        Optional<Alien> a = Optional.of(repo.save(alien));
        return a;
    }
}
