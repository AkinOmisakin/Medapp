package com.frontend.medapp.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Your DermAssistant is here to help you with your skin concerns. You can ask questions about skin conditions, treatments, and more."
    }

    val text: LiveData<String> = _text
}