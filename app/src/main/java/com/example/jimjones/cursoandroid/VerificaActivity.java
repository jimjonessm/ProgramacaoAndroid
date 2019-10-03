package com.example.jimjones.cursoandroid;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
public class VerificaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verifica);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        TextView textView = findViewById(R.id.mensagem);
       if(extras != null) {
            String nome = extras.getString("Nome"); // retrieve the data using keyName
            String matricula = extras.getString("Matricula");
            int nota = Integer.parseInt(extras.getString("Nota"));
            verifica(nome, matricula,nota);

        }else{
            textView.setTextColor(getResources().getColor(R.color.red));
            textView.setText("Erro!\nNenhum dado foi recebido!");
        }
    }
    private void verifica(String nome, String matricula, int nota){
        TextView textView = findViewById(R.id.mensagem);
        String msg;
        if(nota>=60){
            msg = "O aluno "+nome+" - "+matricula+" foi APROVADO com a nota "+ nota;
            textView.setTextColor(getResources().getColor(R.color.blue));
        }else{
            textView.setTextColor(getResources().getColor(R.color.red));
            msg = "O aluno "+nome+" - "+matricula+" foi REPROVADO com a nota "+ nota;
        }
        textView.setText(msg);
    }
}
