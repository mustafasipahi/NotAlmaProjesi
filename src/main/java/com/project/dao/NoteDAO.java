package com.project.dao;

import com.project.model.Note;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteDAO extends BaseRepository<Note>{

    public List<Note> findAllByUserId(Long user_id);
}
