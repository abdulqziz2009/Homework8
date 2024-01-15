package com.myself223.ulanagaybotiknakotline

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface Dao {
    @Insert
    fun insertNotes(notes: Notes)

    @Query("SELECT * FROM Notes")
    fun getAllNotes() : List<Notes>



    @Delete
    fun updateUsers(vararg notes: Notes)
}