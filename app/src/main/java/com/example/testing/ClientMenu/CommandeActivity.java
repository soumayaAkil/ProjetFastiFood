package com.example.testing.ClientMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.testing.CommandeFragment;
import com.example.testing.R;

public class CommandeActivity extends AppCompatActivity {

    RelativeLayout rl_commande;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);
        rl_commande=findViewById(R.id.rl_submit_command);
        rl_commande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment unFragment=null;
                unFragment= new AcceuilClientFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentplaceholder,unFragment).commit();
                Toast.makeText(CommandeActivity.this, "you paid  !", Toast.LENGTH_SHORT).show();
            }
        });
    }
}