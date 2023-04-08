package in.bushansirgur.eazynotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bushansirgur.eazynotes.entity.Note;
import in.bushansirgur.eazynotes.repository.NoteRepository;

@Service
public class NoteServiceImpl implements NotesService {
	
	@Autowired
	private NoteRepository noteRepository;

	@Override
	public List<Note> readAll() {
		return noteRepository.findAll();
	}

	@Override
	public Note saveNote(Note note) {
		return noteRepository.save(note);
	}

	@Override
	public Note readNote(Long id) {
		return noteRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Note is not present for the id "+id));
	}

	@Override
	public void removeNote(Long id) {
		Note existingNote = readNote(id);
		noteRepository.delete(existingNote);
	}

}

















