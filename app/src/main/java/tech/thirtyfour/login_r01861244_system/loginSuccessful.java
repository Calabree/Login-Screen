package tech.thirtyfour.login_r01861244_system;

import androidx.appcompat.app.AppCompatActivity;
import tech.thirtyfour.login_r01861244_system.MainActivity;
import android.os.Bundle;

public class loginSuccessful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_successful);
        setTitle("Welcome");
        System.out.println("hello from login: " + MainActivity.password.get("calap@farmingdale.edu"));


    }
}