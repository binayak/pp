package inviqa.planning.poker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EstimationOutputActivity extends Activity{
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estimation);
        
       TextView es = (TextView)findViewById(R.id.estimatedPoints);
      
       int estimate = getIntent().getExtras().getInt("valueE");
       
       if(estimate == 102 ){
    	   es.setTextSize(50);
    	   es.setText("Break!");
       }
       
       else if (estimate == 101)
    	   es.setText("?");
    	   
       else
       es.setText(String.valueOf(estimate));
       
    }
    
    public void onClick(View v) {
    	
    	Intent myIntent = new Intent(this,PlanningPokerActivity.class); 
		this.startActivity(myIntent);
    	
    }
    
    
    
}