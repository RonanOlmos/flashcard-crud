package com.flashcard.crud.service;

import java.util.List;
import java.util.Optional;

import com.flashcard.crud.model.Flashcard;

public interface FlashcardService {
    List<Flashcard> listarFlashcards();
    Optional<Flashcard> obtenerFlashcardPorId(Long id);
}
