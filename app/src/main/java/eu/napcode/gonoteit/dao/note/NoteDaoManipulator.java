package eu.napcode.gonoteit.dao.note;

import android.arch.lifecycle.LiveData;
import android.arch.paging.DataSource;

import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;

public class NoteDaoManipulator {

    private NoteDao noteDao;

    @Inject
    public NoteDaoManipulator(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    public DataSource.Factory<Integer, NoteEntity> getAllNoteEntities() {
        return noteDao.getAllNoteEntities();
    }

    public void insertNote(NoteEntity noteEntity) {

        try {
            noteDao.insertNote(noteEntity);
            Timber.d("insert note completed %s", noteEntity.getId());
        } catch (Exception e) {
            Timber.d("insert note exception %s", e.getLocalizedMessage());
        }
    }

    public void deleteAll() {

        try {
            noteDao.deleteAll();
            Timber.d("delete all completed");
        } catch (Exception e) {
            Timber.d("delete all exception %s", e.getLocalizedMessage());
        }
    }

    public void deleteNote(Long id) {

        try {
            noteDao.deleteNote(id);
            Timber.d("remove note completed %s", id.toString());
        } catch (Exception e) {
            Timber.d("remove note exception %s", e.getLocalizedMessage());
        }
    }

    public LiveData<NoteEntity> getNoteById(Long id) {
        return noteDao.getNoteById(id);
    }

    public DataSource.Factory<Integer, NoteEntity> getFavoriteNoteEntities(List<Long> ids) {
        return noteDao.getFavoriteNoteEntities(ids);
    }
}
