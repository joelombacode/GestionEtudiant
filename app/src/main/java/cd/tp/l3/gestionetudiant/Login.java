package cd.tp.l3.gestionetudiant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
TextView inscription;
Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
    private void init(){
        inscription=findViewById(R.id.inscription);
        login_btn=findViewById(R.id.loginbtn);
        initEvent();
    }
    private void initEvent(){
        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startIntent(Inscription.class);
            }
        });
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntent(Compte.class);
            }
        });
    }
    private void startIntent(Class name){
        Intent intent= new Intent(this,name);
        startActivity(intent);
    }
}