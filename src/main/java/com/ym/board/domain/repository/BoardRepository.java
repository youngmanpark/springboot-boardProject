package com.ym.board.domain.repository;

import com.ym.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//boardRepository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findByTitleContaining(String keyword);

}