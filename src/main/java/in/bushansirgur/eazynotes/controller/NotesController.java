package in.bushansirgur.eazynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.eazynotes.entity.Note;
import in.bushansirgur.eazynotes.service.NotesService;

@RestController
public class NotesController {
	
	@Autowired
	private NotesService notesService;
	
	@GetMapping("/notes")
	public List<Note> getNotes() {
		return notesService.readAll();
	}
}














