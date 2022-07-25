package roommvvm.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u0011J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lroommvvm/ViewModel/NotesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lroommvvm/Repository/NotesRepository;", "getRepository", "()Lroommvvm/Repository/NotesRepository;", "addNotes", "", "notes", "Lroommvvm/model/Notes;", "deleteNotes", "id", "", "getNOtes", "Landroidx/lifecycle/LiveData;", "", "updateNotes", "app_debug"})
public final class NotesViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final roommvvm.Repository.NotesRepository repository = null;
    
    public NotesViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final roommvvm.Repository.NotesRepository getRepository() {
        return null;
    }
    
    public final void addNotes(@org.jetbrains.annotations.NotNull
    roommvvm.model.Notes notes) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<roommvvm.model.Notes>> getNOtes() {
        return null;
    }
    
    public final void deleteNotes(int id) {
    }
    
    public final void updateNotes(@org.jetbrains.annotations.NotNull
    roommvvm.model.Notes notes) {
    }
}