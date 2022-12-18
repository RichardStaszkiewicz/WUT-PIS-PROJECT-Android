package com.example.android.ui.menu;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.model.Section;
import java.util.List;

public class MenuViewModel extends ViewModel {

	private final MutableLiveData<List<Section>> sectionsLiveData = new MutableLiveData<>();

	public MenuViewModel() {
		populateSections();
	}

	public MutableLiveData<List<Section>> getSectionsLiveData() {
		return sectionsLiveData;
	}

	public void populateSections() {
		var section1 = Section.builder()
				.id(1)
				.name("SIECI KOMPUTEROWE")
				.build();

		Section section2 = Section.builder()
				.id(1)
				.name("SYSTEMY OPERACYJNE")
				.subSections(List.of(section1, section1))
				.build();

		var section3 = Section.builder()
				.id(1)
				.name("SIECI KOMPUTEROWE")
				.subSections(List.of(section1, section2, section1))
				.build();

		sectionsLiveData.setValue(List.of(section1, section1, section2, section3));
	}
}
