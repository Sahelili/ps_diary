package roommvvm.Dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\'\u00a8\u0006\r"}, d2 = {"Lroommvvm/Dao/NotesDao;", "", "deleteNotes", "", "id", "", "getnotes", "Landroidx/lifecycle/LiveData;", "", "Lroommvvm/model/Notes;", "insertNotes", "notes", "updateNotes", "app_debug"})
public abstract interface NotesDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Notes")
    public abstract androidx.lifecycle.LiveData<java.util.List<roommvvm.model.Notes>> getnotes();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertNotes(@org.jetbrains.annotations.NotNull
    roommvvm.model.Notes notes);
    
    @androidx.room.Query(value = "DELETE FROM Notes WHERE id=:id")
    public abstract void deleteNotes(int id);
    
    @androidx.room.Update
    public abstract void updateNotes(@org.jetbrains.annotations.NotNull
    roommvvm.model.Notes notes);
}