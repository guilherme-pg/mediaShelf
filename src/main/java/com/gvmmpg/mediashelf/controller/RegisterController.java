package com.gvmmpg.mediashelf.controller;

import com.gvmmpg.mediashelf.domain.book.Book;
import com.gvmmpg.mediashelf.domain.book.BookRegister;
import com.gvmmpg.mediashelf.domain.book.BookRepository;
import com.gvmmpg.mediashelf.domain.comics.Comics;
import com.gvmmpg.mediashelf.domain.comics.ComicsRegister;
import com.gvmmpg.mediashelf.domain.comics.ComicsRepository;
import com.gvmmpg.mediashelf.domain.game.Game;
import com.gvmmpg.mediashelf.domain.game.GameRegister;
import com.gvmmpg.mediashelf.domain.game.GameRepository;
import com.gvmmpg.mediashelf.domain.movie.Movie;
import com.gvmmpg.mediashelf.domain.movie.MovieRegister;
import com.gvmmpg.mediashelf.domain.movie.MovieRepository;
import com.gvmmpg.mediashelf.domain.music.Music;
import com.gvmmpg.mediashelf.domain.music.MusicRegister;
import com.gvmmpg.mediashelf.domain.music.MusicRepository;
import com.gvmmpg.mediashelf.domain.serie.Serie;
import com.gvmmpg.mediashelf.domain.serie.SerieRegister;
import com.gvmmpg.mediashelf.domain.serie.SerieRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private BookRepository bookRepository;
    private MovieRepository movieRepository;
    private MusicRepository musicRepository;
    private GameRepository gameRepository;
    private SerieRepository serieRepository;
    private ComicsRepository comicsRepository;

    @GetMapping
    public String loadRegisterPage() {
        return "main/register";
    }

    @PostMapping("/book-register")
    public String registerBook(BookRegister data) {
        var book = new Book(data);
        // ADD: alert to show media was inserted
        return "redirect:/register";
    }

    @PostMapping("/movie-register")
    public String registerMovie(MovieRegister data) {
        var movie = new Movie(data);
        return "redirect:/register";}

    @PostMapping("/music-register")
    public String registerMusic(MusicRegister data) {
        var music = new Music(data);
        return "redirect:/register";}

    @PostMapping("/comics-register")
    public String registerComics(ComicsRegister data) {
        var comic = new Comics(data);
        return "redirect:/register";}

    @PostMapping("/serie-register")
    public String registerSerie(SerieRegister data) {
        var serie = new Serie(data);
        return "redirect:/register";}

    @PostMapping("/game-register")
    public String registerGame(GameRegister data) {
        var game = new Game(data);
        return "redirect:/register";}
}
