package tech.thirtyfour.login_r01861244_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;


public class  MainActivity extends AppCompatActivity {

    public Map<String, String> password = new HashMap<String, String>();

    EditText loginEmail, loginPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEmail = (EditText) findViewById(R.id.loginEmail);
        loginPassword = (EditText) findViewById(R.id.loginPassword);

        //
    }

    public void loginButton(View view) {
        password.put("calap@farmingdale.edu", "peter");

        String pword = loginPassword.getText().toString();
        String email = loginEmail.getText().toString();
        System.out.println("hashmap: " + password.get(email).toString());
        System.out.println("password: " + loginPassword.getText().toString());

        if (pword.equals(password.get(email))) {
            System.out.println("What the actual fuck");
        }
        if (password.get(email) == null) {
            Toast.makeText(MainActivity.this, "This email is not in our database", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!loginPassword.getText().toString().equals(password.get(loginEmail.getText().toString()))) {
            Toast.makeText(MainActivity.this, "password is incorrect", Toast.LENGTH_SHORT).show();
            return;
        } else {
            startActivity(new Intent(this, loginSuccessful.class));
            finish();
        }

    }
}