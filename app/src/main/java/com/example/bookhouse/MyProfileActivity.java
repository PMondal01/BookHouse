package com.example.bookhouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MyProfileActivity extends AppCompatActivity {

    private TextView u_name, u_number;
    FirebaseUser user;
    String uid;
    DatabaseReference databaseReference;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        u_name=findViewById(R.id.userName);
        u_number=findViewById(R.id.UserNumber);


        user = FirebaseAuth.getInstance().getCurrentUser();
        uid=user.getUid();

        databaseReference= FirebaseDatabase.getInstance().getReference(firebaseAuth.getUid());

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                Upload upload=dataSnapshot.getValue(Upload.class);
                u_name.setText(upload.getBookName());

                String name=dataSnapshot.child(uid).child("name").getValue(String.class);
                String email=dataSnapshot.child(uid).child("email").getValue(String.class);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });













    }
}
