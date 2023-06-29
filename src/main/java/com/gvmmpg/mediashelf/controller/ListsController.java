package com.gvmmpg.mediashelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lists")
public class ListsController {

    @GetMapping
    public String loadListsPage() {
        return "main/lists";
    }
}
