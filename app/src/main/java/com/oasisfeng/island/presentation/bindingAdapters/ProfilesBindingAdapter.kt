package com.oasisfeng.island.presentation.bindingAdapters

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.oasisfeng.island.presentation.states.ProfilesDataState

@BindingAdapter("controlFilesVisibility")
fun RecyclerView.controlFilesVisibility(state: ProfilesDataState) {
    this.visibility = if (state is ProfilesDataState.Loading) {
        View.GONE
    } else {
        View.VISIBLE
    }
}