package com.example.jimjones.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_aula);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(MainActivity.this, VerificaActivity.class);
        EditText editText = (EditText) findViewById(R.id.nome);
        String nome = editText.getText().toString();
        editText = (EditText) findViewById(R.id.matricula);
        String matricula = editText.getText().toString();
        editText = (EditText) findViewById(R.id.nota);
        String nota = editText.getText().toString();
        Bundle extras = new Bundle();
        extras.putString("Nome",nome);
        extras.putString("Matricula",matricula);
        extras.putString("Nota",nota);
        intent.putExtras(extras);
        startActivity(intent);

    }
}
