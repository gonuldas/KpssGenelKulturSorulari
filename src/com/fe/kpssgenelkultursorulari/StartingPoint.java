package com.fe.kpssgenelkultursorulari;

import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends Activity {

	/*Layoutlarýn inçlere göre hangi klasöre konacaðý
	 * 
	 * layout-small  -->2 to 3.7
	 * layout-normal -->3.7 to 4.3
	 * layout-large  -->4.0 to 7.1
	 * layout-xlarge -->7.0 to 10.0
	 * 
	 * */
	
	
	private TextView baslik;
	private Button genel_kultur_cikmis_sorular;
	private Button genel_kultur_sorular;
	private Button cikis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_page);
		
		baslik = (TextView) findViewById(R.id.baslik);
		genel_kultur_cikmis_sorular = (Button) findViewById(R.id.genel_kultur_cikmis_sorular);
		genel_kultur_sorular = (Button) findViewById(R.id.genel_kultur_sorular);
		cikis = (Button) findViewById(R.id.cikis);
			
	}
}
