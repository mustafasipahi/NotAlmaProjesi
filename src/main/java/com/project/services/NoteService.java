package com.project.services;

import com.project.dao.NoteDAO;
import com.project.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService implements BaseServices<Note>{

    private NoteDAO noteDAO;
    @Autowired
    public NoteService(NoteDAO noteDAO){
        this.noteDAO=noteDAO;
    }

    @Override
    @Transactional
    public Note save(Note entity) {
        return noteDAO.save(entity);
    }

    @Override
    @Transactional
    public Note update(Note entity) {
        return null;
    }

    @Override
    @Transactional
    public void delete(Note entity) {

    }

    @Override
    public Note findById(Long id) {
        return null;
    }

    @Override
    public List<Note> findAll() {
        List<Note> notes = new ArrayList<>();
        Iterable<Note> all = noteDAO.findAll();
        while (all.iterator().hasNext()){
            Note next = all.iterator().next();
            notes.add(next);
        }
        return notes;
    }

    public List<Note> findAllByUserId(Long userId) {
        return noteDAO.findAllByUserId(userId);
    }
}
