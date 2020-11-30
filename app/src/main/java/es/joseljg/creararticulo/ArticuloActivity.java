package es.joseljg.creararticulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import es.joseljg.creararticulo.clases.Articulo;

public class ArticuloActivity extends AppCompatActivity {

    TextView txt_titulo;
    TextView txt_resumen;
    TextView txt_texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo);
        txt_titulo = (TextView) findViewById(R.id.txt_titulo);
        txt_resumen = (TextView) findViewById(R.id.txt_resumen);
        txt_texto = (TextView) findViewById(R.id.txt_texto);
        Intent intent = getIntent();
        Articulo a1 = (Articulo) intent.getSerializableExtra(MainActivity.EXTRA_OBJETO_ARTICULO);
        Log.i("objetos",a1.toString());
        txt_titulo.setText(a1.getTitulo());
        txt_resumen.setText(a1.getResumen());
        txt_texto.setText(a1.getTexto());
    }
}