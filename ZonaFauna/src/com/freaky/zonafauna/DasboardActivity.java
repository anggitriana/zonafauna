package com.freaky.zonafauna;


import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

public class DasboardActivity extends FragmentActivity  implements OnClickListener {
	private ViewPager _mViewPager;
	private ViewPagerAdapter _adapter;
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dasboard);
		
		setUpView();
        setTab();
  
	}
	
	 private void setUpView(){    	
	   	 _mViewPager = (ViewPager) findViewById(R.id.viewPager);
	     _adapter = new ViewPagerAdapter(getApplicationContext(),getSupportFragmentManager());
	     _mViewPager.setAdapter(_adapter);
		 _mViewPager.setCurrentItem(0);

	 }
		
	 private void setTab(){
			_mViewPager.setOnPageChangeListener(new OnPageChangeListener(){
			    		
						@Override
						public void onPageScrollStateChanged(int position) {}
						@Override
						public void onPageScrolled(int arg0, float arg1, int arg2) {}
						@Override
						public void onPageSelected(int position) {
							// TODO Auto-generated method stub
							switch(position){
							case 0:
								findViewById(R.id.first_tab).setVisibility(View.VISIBLE);
								findViewById(R.id.second_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.third_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.fourth_tab).setVisibility(View.INVISIBLE);
								break;
								
							case 1:
								findViewById(R.id.first_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.second_tab).setVisibility(View.VISIBLE);
								findViewById(R.id.third_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.fourth_tab).setVisibility(View.INVISIBLE);
								break;
								
							case 2:
								findViewById(R.id.first_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.second_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.third_tab).setVisibility(View.VISIBLE);
								findViewById(R.id.fourth_tab).setVisibility(View.INVISIBLE);
								break;
							
							case 3:
								findViewById(R.id.first_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.second_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.third_tab).setVisibility(View.INVISIBLE);
								findViewById(R.id.fourth_tab).setVisibility(View.VISIBLE);
								break; 
							}
						}
						
					});

 }
	 
	 
	 
	 @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_dasboard, menu);
		
		
		
		return true;
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

}
