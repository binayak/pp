package inviqa.planning.poker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartPageActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    
    public void onClick(View v) {
    	Intent myIntent = new Intent(this,PlanningPokerActivity.class); 
		this.startActivity(myIntent);
    }
    
}
