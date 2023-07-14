package com.laughtale.devgames.repositories;

import com.laughtale.devgames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
