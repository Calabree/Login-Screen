package tech.thirtyfour.login_r01861244_system;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    EditText firstName, lastName, dateOfBirth, email, psswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        firstName=(EditText) findViewById(R.id.FirstName);
        lastName=(EditText) findViewById(R.id.LastName);
        dateOfBirth=(EditText) findViewById(R.id.DateOB);
        email=(EditText) findViewById(R.id.DateOB);
        psswd=(EditText) findViewById(R.id.newPassword);
    }

    public void registerButton(View view) {

    }
}