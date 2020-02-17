package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void back(View view) {
        Intent intent = new Intent(activity_register.this,activity_login.class);
        startActivity(intent);
    }
    public void postLogin(View view) {
        Intent intent = new Intent(activity_register.this,activity_profil.class);
        startActivity(intent);
    }
}
