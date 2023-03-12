package in.bushansirgur.eazynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bushansirgur.eazynotes.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
