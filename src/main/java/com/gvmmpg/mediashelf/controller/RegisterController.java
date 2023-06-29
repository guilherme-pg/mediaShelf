package com.gvmmpg.mediashelf.controller;

import com.gvmmpg.mediashelf.domain.book.Book;
import com.gvmmpg.mediashelf.domain.comic.Comic;
import com.gvmmpg.mediashelf.domain.game.Game;
import com.gvmmpg.mediashelf.domain.movie.Movie;
import com.gvmmpg.mediashelf.domain.movie.MovieRegister;
import com.gvmmpg.mediashelf.domain.book.BookRegister;
import com.gvmmpg.mediashelf.domain.comic.ComicRegister;
import com.gvmmpg.mediashelf.domain.music.Music;
import com.gvmmpg.mediashelf.domain.serie.Serie;
import com.gvmmpg.mediashelf.domain.serie.SerieRegister;
import com.gvmmpg.mediashelf.domain.music.MusicRegister;
import com.gvmmpg.mediashelf.domain.game.GameRegister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/register")
public class RegisterController {

    // private List<Book> books = new ArrayList<>();

    @GetMapping
    public String loadRegisterPage() {
        return "main/register";
    }

    @PostMapping("/book-register")
    public String registerBook(BookRegister data) {
        System.out.println(data);
        var book = new Book(data);
        System.out.println(book);
        //  books.add(book);
        // System.out.println(books);
        // ADD: alert to show media was inserted
        return "redirect:/register";
    }

    @PostMapping("/movie-register")
    public String registerMovie(@ModelAttribute("movieRegister") MovieRegister data) {
        var movie = new Movie(data);
        return "redirect:/";}

    @PostMapping("/music-register")
    public String registerMusic(MusicRegister data) {
        var music = new Music(data);
        return "redirect:/";}

    @PostMapping("/comic-register")
    public String registerComic(ComicRegister data) {
        var comic = new Comic(data);
        return "redirect:/";}

    @PostMapping("/serie-register")
    public String registerSerie(SerieRegister data) {
        var serie = new Serie(data);
        return "redirect:/";}

    @PostMapping("/game-register")
    public String registerGame(GameRegister data) {
        var game = new Game(data);
        return "redirect:/";}
}
