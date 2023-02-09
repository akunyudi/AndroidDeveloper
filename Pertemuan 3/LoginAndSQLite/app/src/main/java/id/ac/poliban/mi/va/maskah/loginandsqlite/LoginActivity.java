package id.ac.poliban.mi.va.maskah.loginandsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import id.ac.poliban.mi.va.maskah.loginandsqlite.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    public static final String SP_FILE = "login_sp";
    private ActivityLoginBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.tvRegister.setOnClickListener(this:: doRegister);
        b.btLogin.setOnClickListener(this::doLogin);
        setContentView(R.layout.activity_login);
    }
    private void doLogin(View view) {
        if (b.etUsername.getText)
    }
}