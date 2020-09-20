package com.project.servlet;

import com.project.model.Note;
import com.project.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HomePageServlet {

    private NoteService noteService;
    @Autowired
    public HomePageServlet(NoteService noteService){
        this.noteService=noteService;
    }

    @GetMapping(value = "/")
    public String home(Locale locale,Model model) {
        model.addAttribute("merhaba","MERHABA");
        return "index";
    }

    @GetMapping(value = "/detail")
    public String detail(Locale locale,Model model){
        return "detail";
    }


    @GetMapping(value = "/ekle")
    public String ekle(Locale locale,Model model){
        return "addNote";
    }

    @PostMapping(value = "/addNote")
    public ResponseEntity<String> addNote(@RequestBody Note note){
        System.out.println(note.toString());
        //noteService.save(note);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }
}
