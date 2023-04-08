package in.bushansirgur.eazynotes.service;

import java.util.List;

import in.bushansirgur.eazynotes.entity.Note;

public interface NotesService {
	
	List<Note> readAll();
	
	Note saveNote(Note note);
	
	Note readNote(Long id);
	
	void removeNote(Long id);

}
