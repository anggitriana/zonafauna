package com.freaky.zonafauna;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListAnimalsLand extends Fragment {

	public static Fragment newInstance(Context context) {
		ListAnimalsLand f = new ListAnimalsLand();

		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ViewGroup root = (ViewGroup) inflater
				.inflate(R.layout.layout_animals_land, null);
		return root;
	}

}
