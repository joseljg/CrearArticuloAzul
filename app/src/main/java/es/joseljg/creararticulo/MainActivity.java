package es.joseljg.creararticulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import es.joseljg.creararticulo.clases.Articulo;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_OBJETO_ARTICULO = "es.joseljg.MainActivity.articulo" ;
    EditText edt_titulo = null;
    EditText edt_resumen = null;
    EditText edt_texto = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_titulo = (EditText) findViewById(R.id.edt_titulo);
        edt_resumen = (EditText) findViewById(R.id.edt_resumen);
        edt_texto = (EditText) findViewById(R.id.edt_texto);
    }

    public void crear(View view) {
        String titulo = String.valueOf(edt_titulo.getText());
        String resumen = String.valueOf(edt_resumen.getText());
        String texto = String.valueOf(edt_texto.getText());
        Articulo a1 = new Articulo(titulo, resumen, texto);
        //-------------------------------------------------
        Intent intent = new Intent(this, ArticuloActivity.class );
        intent.putExtra(EXTRA_OBJETO_ARTICULO, a1);
        startActivity(intent);
    }
}