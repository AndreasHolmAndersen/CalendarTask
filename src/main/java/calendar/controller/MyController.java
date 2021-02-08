package calendar.controller;

import calendar.services.DateDiff;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyController {

    @GetMapping("/calc")
    @ResponseBody
    public String dateDiff(@RequestParam int Year, int Month, int DayOfMonth){
        DateDiff dateDiff = new DateDiff(); //New object
        String result = dateDiff.calcDiff(Year, Month, DayOfMonth); //Find difference
        return result; //return to body
    }
}
