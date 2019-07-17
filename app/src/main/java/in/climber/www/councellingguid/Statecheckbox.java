package in.climber.www.councellingguid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Statecheckbox extends Activity {

    private CheckBox kerala,mp,up,tripura,raj,punjab;
    private Button ok;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statecheckbox);

        //addListenerOnChkIos();
        addListenerOnButton();
    }

   /* public void addListenerOnChkIos() {

        chkIos = (CheckBox) findViewById(R.id.chkIos);

        chkIos.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MyAndroidAppActivity.this,
                            "Bro, try Android :)", Toast.LENGTH_LONG).show();
                }

            }
        });

    }*/

    public void addListenerOnButton() {

       raj= (CheckBox) findViewById(R.id.raj);
        mp = (CheckBox) findViewById(R.id.mp);
        up = (CheckBox) findViewById(R.id.up);
        kerala=(CheckBox)findViewById(R.id.kerala);
        tripura=(CheckBox)findViewById(R.id.tripura);
        punjab=(CheckBox)findViewById(R.id.punjab);
        ok = (Button) findViewById(R.id.ok);

        ok.setOnClickListener(new OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {
             ArrayList<String>l1=new ArrayList<String>();
                //StringBuffer result = new StringBuffer();
               if(up.isChecked()){
                l1.add("UTTARPRADESH");
               }
                if(mp.isChecked()){
                    l1.add("MADHYAPRADESH");
                }
                if (raj.isChecked()){
                    l1.add("RAJASTHAN");
                }
                if(kerala.isChecked()){
                    l1.add("KERALA");
                }
                if(tripura.isChecked()){
                    l1.add("TRIPURA");
                }
                if(punjab.isChecked()){
                    l1.add("PUNJAB");
                }
                if(l1.isEmpty())
                {
                     
                }
                else {
                Intent in=new Intent(Statecheckbox.this,Retreive.class);
                in.putExtra("statlist",l1);
                startActivity(in);}
               // finish();
               // startActivity(new Intent(Statecheckbox.this,getvalue.class));

              //  Toast.makeText(Statecheckbox.this, result.toString(),
                       // Toast.LENGTH_LONG).show();

            }
        });

    }
}