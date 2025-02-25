package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
public class MainController {


    @GetMapping("/cas")
    public ModelAndView zobrazCac() {
        final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
        final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("H:mm", LOCALE);
        String time = LocalTime.now().format(TIME_FORMATTER);
        ModelAndView result = new ModelAndView("cas");
        result.addObject("cas", time);
        return result;
    }

    @GetMapping("/datum")
    public ModelAndView zobrazDatum() {
        final Locale LOCALE = Locale.forLanguageTag("cs-CZ");
        final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("d. MMMM yyyy", LOCALE);
        String date=LocalDate.now().format(DATE_FORMATTER);
        ModelAndView result = new ModelAndView("datum");
        result.addObject("datum", date);
        return result;
    }
}
