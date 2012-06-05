package inviqa.planning.poker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class PlanningPokerActivity extends Activity implements View.OnClickListener{
    /** Called when the activity is first created. */
	
	
	//Button Button0, Button1, Button2, Button3, Button5, Button8, Button13, Button20, Button40, Button100, ButtonQuestion, ButtonBreak,ButtonCredits;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);
        
       
    }
    
    protected void handleIntent(int i){
    	
    	Intent myIntent = new Intent(this,EstimationOutputActivity.class);
		myIntent.putExtra("valueE", i); 
		this.startActivity(myIntent);
    	
    }


	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()){
			case R.id.Button0:
				this.handleIntent(0);
				break;
			
			case R.id.Button1:
				this.handleIntent(1);
				break;
				
			case R.id.Button2:
				this.handleIntent(2);
				break;
				
			case R.id.Button3:
				this.handleIntent(3);
				break;
				
			case R.id.Button5:
				this.handleIntent(5);
				break;
				
			case R.id.Button8:
				this.handleIntent(8);
				break;
				
			case R.id.Button13:
				this.handleIntent(13);
				break;
				
			case R.id.Button20:
				this.handleIntent(20);
				break;
				
			case R.id.Button40:
				this.handleIntent(40);
				break;
				
			case R.id.Button100:
				this.handleIntent(100);
				break;
				
			case R.id.ButtonQuestion:
				this.handleIntent(101);
				break;
				
			case R.id.ButtonBreak:
				this.handleIntent(102);
				break;
				
			case R.id.ButtonCredits:
				Uri uriUrl = Uri.parse("http://www.linkedin.com/in/binayakpsilwal");
				Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);  
				startActivity(launchBrowser); 
				break;
				
				
				
		}
		
	}
    
    

    }

