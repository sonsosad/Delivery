package com.son.deliveryonline;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.son.deliveryonline.Model.User;

import java.util.ArrayList;

public class SignIn extends AppCompatActivity {
    MaterialEditText edtPhone, edtPassword;
    Button btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edtPassword = (MaterialEditText) findViewById(R.id.edtPassword);
        edtPhone = (MaterialEditText) findViewById(R.id.edtPhone);
        btnSignIn = findViewById(R.id.btnSignIn);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(SignIn.this,Home.class);
                               startActivity(homeIntent);
//                final ProgressDialog dialog = new ProgressDialog(SignIn.this);
//                dialog.setMessage("Chờ");
//                dialog.show();
//
//
//                table_user.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                        if (snapshot.child(edtPhone.getText().toString()).exists()) {
//                            dialog.dismiss();
//                            User user = snapshot.child(edtPhone.getText().toString()).getValue(User.class);
//                            if (user.getPassword().equals(edtPassword.getText().toString())) {
//                                //Toast.makeText(SignIn.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
//                                Intent homeIntent = new Intent(SignIn.this,Home.class);
//                                startActivity(homeIntent);
//                            } else {
//                                dialog.dismiss();
//                                Toast.makeText(SignIn.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
//                            }
//                        } else {
//                            dialog.dismiss();
//                            Toast.makeText(SignIn.this, "Tên người dùng không tồn tại", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                });
            }
        });
    }
}