package br.ulbra.appaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtv1, edtv2;
    Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir;
    TextView txtValor1, txtValor2, txtResultado;
    double v1, v2, soma, subtracao, multiplicacao, divisao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtv1 = (EditText)findViewById(R.id.edtvalor1);
        edtv2 = (EditText)findViewById(R.id.edtvalor2);
        btnSomar = (Button)findViewById(R.id.btnSomar);
        btnSubtrair = (Button)findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button)findViewById(R.id.btnMultiplicar);
        btnDividir = (Button)findViewById(R.id.btnDividir);
        txtResultado = (TextView)findViewById(R.id.txtResultado);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                soma = v1 + v2;
                txtResultado.setText("Resultado: " + soma);
            }
        });
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                subtracao = v1 - v2;
                txtResultado.setText("Resultado:" + subtracao);
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                multiplicacao = v1*v2;
                txtResultado.setText("Resultado:" + multiplicacao);
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
                divisao = v1/v2;
                txtResultado.setText("Resultado: " + divisao);
            }
        });
    }
}