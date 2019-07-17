package in.climber.www.councellingguid;

import android.content.Intent;
import android.net.NetworkInfo;
import android.net.sip.SipSession;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class getvalue extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    DatabaseReference ref, ref1, ref2,childref;
    ListView listViewcollege;
    List<College> clgList;
    ArrayList<String>mylist1;
    ArrayList<String> l2;
    String c,r;
    @Override
    public void onBackPressed() {
        finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getvalue);
        getSupportActionBar().setTitle("colleges predicted");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ref = FirebaseDatabase.getInstance().getReference();
        listViewcollege = (ListView) findViewById(R.id.Listgetvalue);
        clgList = new ArrayList<>();
        Intent cintent=getIntent();
         c = cintent.getStringExtra("Category");
         r = cintent.getStringExtra("Rank");
         mylist1= cintent.getStringArrayListExtra("s");
    }

    @Override
    protected void onStart() {
        super.onStart();
        ref = FirebaseDatabase.getInstance().getReference();
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                clgList.clear();
                for (DataSnapshot SnapShot : dataSnapshot.getChildren()) {
                    final String clg = SnapShot.getKey();
                  //  System.out.println(clg);
                    ref1 = FirebaseDatabase.getInstance().getReference(clg);
                    childref= FirebaseDatabase.getInstance().getReference(clg+"/"+"State");
                    childref.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            final String state=(String)dataSnapshot.getValue();
                          // final ArrayList<String> mylist1= cintent.getStringArrayListExtra("s");
                            //System.out.println(mylist1);
                            if(mylist1.contains(state)){
                                  l2=new ArrayList<String>();
                                l2.add(clg);
                                System.out.println(l2);
                            }


                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });


                    ref1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            for (final DataSnapshot Snapshot1 : dataSnapshot.getChildren()) {
                                final String cat = Snapshot1.getKey();
//                                Intent callint=getIntent();
//                                String c = callint.getStringExtra("Category");
                                if (cat.equals(c)) {
                                    ref2 = FirebaseDatabase.getInstance().getReference(clg + "/" + cat);
                                    ref2.addValueEventListener(new ValueEventListener() {
                                        @Override
                                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                            for (DataSnapshot Snapshot2 : dataSnapshot.getChildren()) {
                                                final String bch = Snapshot2.getKey();
                                                final String rank = (String) Snapshot2.getValue().toString();
//                                                Intent callint = getIntent();
//                                                String r = callint.getStringExtra("Rank");
                                                int userrank = Integer.parseInt(r);
                                                int apprank = Integer.parseInt(rank);
                                                if ((userrank < apprank)&&(l2.contains(clg))) {
                                                    System.out.println(clg);
                                                    College c = new College(clg,bch, cat, rank);
                                                   // System.out.println(c);
                                                    clgList.add(c);
                                                   // Toast.makeText(getvalue.this, "Data Retreived",
                                                            //Toast.LENGTH_SHORT).show();
                                                }

                                            }
                                        }

                                        @Override
                                        public void onCancelled(@NonNull DatabaseError databaseError) {

                                        }
                                    });
                                }
                            }
                            calladapter(clgList);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });


                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void calladapter(List<College> clgList) {
        College_list adapter = new College_list(getvalue.this, clgList);
        listViewcollege.setAdapter(adapter);
    }
}