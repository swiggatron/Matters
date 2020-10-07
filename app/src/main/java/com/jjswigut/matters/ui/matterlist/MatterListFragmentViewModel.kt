package com.jjswigut.matters.ui.matterlist

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjswigut.matters.database.Matter
import com.jjswigut.matters.database.MatterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MatterListFragmentViewModel @ViewModelInject constructor(
    private val repo: MatterRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val allMatters: LiveData<List<Matter>> = repo.allMatters


    fun insert(matter: Matter) = viewModelScope.launch(Dispatchers.IO) {
        repo.insert(matter)
    }

    fun delete(matter: Matter) = viewModelScope.launch(Dispatchers.IO) {
        repo.update(matter)
    }

    fun update(matter: Matter) = viewModelScope.launch(Dispatchers.IO) {
        repo.update(matter)
    }
}