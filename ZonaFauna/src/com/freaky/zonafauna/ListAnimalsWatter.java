package com.freaky.zonafauna;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListAnimalsWatter extends Fragment {

	public static Fragment newInstance(Context context) {
		ListAnimalsWatter f = new ListAnimalsWatter();

		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ViewGroup root = (ViewGroup) inflater
				.inflate(R.layout.layout_animals_watter, null);
		return root;
	}

}
