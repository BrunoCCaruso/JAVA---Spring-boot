package com.example.exercisesito.controller;


import com.example.exercisesito.entity.Alumn;
import com.example.exercisesito.service.AlumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
@RequestMapping("/alumns")
public class AlumnController {

    @Autowired
    private AlumnService alumnService;

    @GetMapping
    public ModelAndView getAlumns(){
        ModelAndView vistaConTabla = new ModelAndView("alumn-table");
        vistaConTabla.addObject("alumnos", alumnService.getAll());
        return vistaConTabla;
    }

    @GetMapping("/form")
    public ModelAndView getForm(){
        ModelAndView vistaConFormulario = new ModelAndView("form-create");
        vistaConFormulario.addObject("alumno", new Alumn());
        return vistaConFormulario;
    }

    @GetMapping("/form/{id}")
    public ModelAndView getForm(@PathVariable Integer id){
        ModelAndView vistaConFormulario = new ModelAndView("form-update");
        vistaConFormulario.addObject("alumno", alumnService.getById(id));
        return vistaConFormulario;
    }

    @PostMapping("/create")
    public RedirectView create(Alumn alumn){
        alumnService.create(alumn);
        return new RedirectView("/alumns");
    }

    @PostMapping("/update")
    public RedirectView update(Alumn alumn){
        alumnService.update(alumn);
        return new RedirectView("/alumns");
    }





}
