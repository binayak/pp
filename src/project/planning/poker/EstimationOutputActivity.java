package project.planning.poker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class EstimationOutputActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estimation);
        
       TextView es = (TextView)findViewById(R.id.estimatedPoints);
      
       int estimate = getIntent().getExtras().getInt("valueE");
       if(estimate == 102 )
    	   es.setText("Break!");
       
       else if (estimate == 101)
    	   es.setText("?");
    	   
       else
       es.setText(String.valueOf(estimate));
       
    }
};
