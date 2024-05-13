package ru.alitryel.ibsspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.alitryel.ibsspring.models.DirectionRange;
import ru.alitryel.ibsspring.services.CompassService;

import java.util.List;

@RestController
public class CompassController {
    @Autowired
    private CompassService compassService;

    @PostMapping("/setDirections")
    public void setDirections(@RequestBody List<DirectionRange> directions) {
        compassService.setDirections(directions);
    }

    @GetMapping("/getDirection")
    public String getDirection(@RequestParam int degree) {
        return compassService.getDirectionByDegree(degree);
    }
}
