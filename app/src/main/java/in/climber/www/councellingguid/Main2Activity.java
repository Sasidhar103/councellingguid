package in.climber.www.councellingguid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {

    Button clgprdct,info;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      //  mAuth=FirebaseAuth.getInstance();
        info=findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info();
            }
        });
        clgprdct=findViewById(R.id.clgpredct);
        clgprdct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                collegepredict();
            }
        });
    }

    private void info() {

        //mAuth.signOut();
        Intent intent=new Intent(Main2Activity.this,information.class);
        startActivity(intent);
        //finish();
    }
    private void collegepredict() {

        //mAuth.signOut();
        Intent intent=new Intent(Main2Activity.this,Retreive.class);
        startActivity(intent);
        //finish();
    }
}
