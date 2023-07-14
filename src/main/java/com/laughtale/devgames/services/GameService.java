package com.laughtale.devgames.services;

import com.laughtale.devgames.dto.GameMinDTO;
import com.laughtale.devgames.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.laughtale.devgames.entities.Game;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        var dto = result.stream().map(GameMinDTO::new).toList();
        return dto;
    }

}
