package com.gvmmpg.mediashelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {

    @GetMapping
    public String loadStatisticsPage() {
        return "main/statistics";
    }
}
