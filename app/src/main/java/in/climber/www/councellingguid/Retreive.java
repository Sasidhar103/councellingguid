package in.climber.www.councellingguid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class Retreive extends AppCompatActivity {
    Button submit,state,branch;
ArrayList<String> l1=new ArrayList<String>();
    EditText Rank;
    Spinner category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retreive);
        Rank = (EditText)findViewById(R.id.rank);
        state=(Button)findViewById(R.id.state);
        category=(Spinner)findViewById(R.id.spinner);
        String cat=category.getSelectedItem().toString();
        Intent i=getIntent();
         l1= i.getStringArrayListExtra("statlist");
        getSupportActionBar().setTitle("Get Colleges");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Retreive.this,Statecheckbox.class));
            }
        });

        submit= (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r=Rank.getText().toString();
                String c=category.getSelectedItem().toString();
                Intent in=new Intent(Retreive.this,getvalue.class);
                in.putExtra("Rank",r);
                in.putExtra("Category",c);
                in.putExtra("s",l1);
                System.out.println(l1);
                startActivity(in);

            }
        });

    }


}
