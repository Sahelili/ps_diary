package roommvvm.Repository


import androidx.lifecycle.LiveData
import roommvvm.Dao.NotesDao
import roommvvm.model.Notes

class NotesRepository(val dao: NotesDao) {

    fun getAllNotes(): LiveData<List<Notes>>{
        return dao.getnotes()
    }
    fun insertNotes(notes: Notes){
        dao.insertNotes(notes)
    }
    fun deleteNotes(id: Int){
        dao.deleteNotes(id)
    }
    fun updateNotes(notes: Notes){
        dao.updateNotes(notes)
   }
}