package ru.alitryel.ibsspring.services;

import org.springframework.stereotype.Service;
import ru.alitryel.ibsspring.models.DirectionRange;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompassService {
    private List<DirectionRange> directions = new ArrayList<>();

    public void setDirections(List<DirectionRange> directions) {
        this.directions = directions;
    }

    public String getDirectionByDegree(int degree) {
        for (DirectionRange direction : directions) {
            if (degree >= direction.getStart() && degree <= direction.getEnd()) {
                return direction.getName();
            }
        }
        return "";
    }
}
