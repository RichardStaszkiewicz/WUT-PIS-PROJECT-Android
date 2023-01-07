package com.example.android.util;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.ui.section.ConceptsViewModel;

public class ConceptsViewModelFactory implements ViewModelProvider.Factory {
	private final int sectionId;

	public ConceptsViewModelFactory(int sectionId) {
		this.sectionId = sectionId;
	}

	@Override
	public <T extends ViewModel> T create(Class<T> modelClass) {
		if (modelClass.isAssignableFrom(ConceptsViewModel.class)) {
			return (T) new ConceptsViewModel(sectionId);
		} else {
			throw new IllegalArgumentException("Unknown ViewModel class");
		}
	}
}