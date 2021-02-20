package com.kt.educ.controller;

import com.kt.educ.model.Score;
import com.kt.educ.service.ScoreService;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
public class ScoreController {

    @Resource
    ScoreService scoreService;

    @ResponseBody
    @GetMapping("/sco")
    public List<Score> get() {
        return scoreService.getScore();
    }
}
