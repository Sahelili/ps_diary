package roommvvm.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lroommvvm/Repository/NotesRepository;", "", "dao", "Lroommvvm/Dao/NotesDao;", "(Lroommvvm/Dao/NotesDao;)V", "getDao", "()Lroommvvm/Dao/NotesDao;", "deleteNotes", "", "id", "", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "Lroommvvm/model/Notes;", "insertNotes", "notes", "updateNotes", "app_debug"})
public final class NotesRepository {
    @org.jetbrains.annotations.NotNull
    private final roommvvm.Dao.NotesDao dao = null;
    
    public NotesRepository(@org.jetbrains.annotations.NotNull
    roommvvm.Dao.NotesDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final roommvvm.Dao.NotesDao getDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<roommvvm.model.Notes>> getAllNotes() {
        return null;
    }
    
    public final void insertNotes(@org.jetbrains.annotations.NotNull
    roommvvm.model.Notes notes) {
    }
    
    public final void deleteNotes(int id) {
    }
    
    public final void updateNotes(@org.jetbrains.annotations.NotNull
    roommvvm.model.Notes notes) {
    }
}