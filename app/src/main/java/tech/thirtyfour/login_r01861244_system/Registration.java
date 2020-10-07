package tech.thirtyfour.login_r01861244_system;

import androidx.appcompat.app.AppCompatActivity;
import tech.thirtyfour.login_r01861244_system.MainActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    EditText firstName, lastName, DOB, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }


}