package in.climber.www.councellingguid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Store extends AppCompatActivity {
    EditText clg,rank,stat;
    Spinner cat,bch;
    DatabaseReference ref,childref;
    Button but,logout;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        getSupportActionBar().setTitle("STORING DETAILS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mAuth=FirebaseAuth.getInstance();
        stat=(EditText)findViewById(R.id.state);
        clg=(EditText)findViewById(R.id.clg);
        cat=(Spinner) findViewById(R.id.cat);
        bch=(Spinner) findViewById(R.id.brch);
        rank=(EditText)findViewById(R.id.rank);
        but=(Button)findViewById(R.id.button);
        logout=(Button)findViewById(R.id.logout);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(Store.this,OpenActivity.class));
            }
        });

    }
    public void store()
    {
        final String s_clg=clg.getText().toString();
        final String s_cat=cat.getSelectedItem().toString();
        final String s_bch=bch.getSelectedItem().toString();
        final String state=stat.getText().toString();
        final Object i_rank = Integer.parseInt(rank.getText().toString());
        // Toast.makeText(getApplicationContext(),"wow",Toast.LENGTH_SHORT).show();
        ref = FirebaseDatabase.getInstance().getReference();
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.hasChild(s_clg))
                {
                    ref = FirebaseDatabase.getInstance().getReference(s_clg);
                    childref=ref.child("State");
                    childref.setValue(state);
                    ref.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if(dataSnapshot.hasChild(s_cat))
                            {
                                ref=FirebaseDatabase.getInstance().getReference(s_clg+"/"+s_cat);

                                ref.addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                        if(dataSnapshot.hasChild(s_bch))
                                        {
                                            HashMap<String,Object> br = new HashMap<>();
                                            br.put(s_bch,i_rank);
                                            ref.updateChildren(br);
                                            Toast.makeText(getApplicationContext(),"already existing data,overwritten",Toast.LENGTH_SHORT).show();
                                        }
                                        else
                                        {

                                            HashMap<String,Object> br = new HashMap<>();
                                            br.put(s_bch,i_rank);
                                            ref.updateChildren(br);
                                            Toast.makeText(getApplicationContext(),"YOU HAVE SUCCESFULLY ENTERED DATA",Toast.LENGTH_SHORT).show();
                                        }
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError databaseError) {

                                    }
                                });
                            }
                            else
                            { HashMap<String,Object> br = new HashMap<>();
                                br.put(s_bch,i_rank);
                                HashMap<String ,Object> cb = new HashMap<>();
                                cb.put(s_cat,br);
                                ref.updateChildren(cb);


                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });
                }
                else
                {
                    HashMap<String,Object> br = new HashMap<>();
                    br.put(s_bch,i_rank);
                    HashMap<String ,Object> cb = new HashMap<>();
                    cb.put(s_cat,br);
                    HashMap<String,Object> cc = new HashMap<>();
                    cc.put(s_clg,cb);
                    ref.updateChildren(cc);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
       // startActivity(new Intent(this,getvalue.class));

    }
    /*private void signout(){
        mAuth.signOut();
        startActivity(new Intent(Store.this,OpenActivity.class));

    }*/
}


