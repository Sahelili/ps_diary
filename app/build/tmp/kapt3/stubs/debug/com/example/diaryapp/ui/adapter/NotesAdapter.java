package com.example.diaryapp.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0012j\b\u0012\u0004\u0012\u00020\u0007`\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/example/diaryapp/ui/adapter/NotesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/diaryapp/ui/adapter/NotesAdapter$notesViewHolder;", "requireContext", "Landroid/content/Context;", "notesList", "", "Lroommvvm/model/Notes;", "(Landroid/content/Context;Ljava/util/List;)V", "getNotesList", "()Ljava/util/List;", "setNotesList", "(Ljava/util/List;)V", "getRequireContext", "()Landroid/content/Context;", "filtering", "", "newFilteredList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "notesViewHolder", "app_debug"})
public final class NotesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.diaryapp.ui.adapter.NotesAdapter.notesViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context requireContext = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<roommvvm.model.Notes> notesList;
    
    public NotesAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context requireContext, @org.jetbrains.annotations.NotNull
    java.util.List<roommvvm.model.Notes> notesList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getRequireContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<roommvvm.model.Notes> getNotesList() {
        return null;
    }
    
    public final void setNotesList(@org.jetbrains.annotations.NotNull
    java.util.List<roommvvm.model.Notes> p0) {
    }
    
    public final void filtering(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<roommvvm.model.Notes> newFilteredList) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.diaryapp.ui.adapter.NotesAdapter.notesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.diaryapp.ui.adapter.NotesAdapter.notesViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/diaryapp/ui/adapter/NotesAdapter$notesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/diaryapp/databinding/ItemDiaryBinding;", "(Lcom/example/diaryapp/databinding/ItemDiaryBinding;)V", "getBinding", "()Lcom/example/diaryapp/databinding/ItemDiaryBinding;", "app_debug"})
    public static final class notesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.diaryapp.databinding.ItemDiaryBinding binding = null;
        
        public notesViewHolder(@org.jetbrains.annotations.NotNull
        com.example.diaryapp.databinding.ItemDiaryBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.diaryapp.databinding.ItemDiaryBinding getBinding() {
            return null;
        }
    }
}