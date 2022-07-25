package roommvvm.Database;

import java.lang.System;

@androidx.room.Database(entities = {roommvvm.model.Notes.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lroommvvm/Database/NotesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "myNotesDao", "Lroommvvm/Dao/NotesDao;", "Companion", "app_debug"})
public abstract class NotesDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final roommvvm.Database.NotesDatabase.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Volatile
    private static volatile roommvvm.Database.NotesDatabase INSTANCE;
    
    public NotesDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract roommvvm.Dao.NotesDao myNotesDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lroommvvm/Database/NotesDatabase$Companion;", "", "()V", "INSTANCE", "Lroommvvm/Database/NotesDatabase;", "getINSTANCE", "()Lroommvvm/Database/NotesDatabase;", "setINSTANCE", "(Lroommvvm/Database/NotesDatabase;)V", "getDatabaseInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final roommvvm.Database.NotesDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable
        roommvvm.Database.NotesDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final roommvvm.Database.NotesDatabase getDatabaseInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}