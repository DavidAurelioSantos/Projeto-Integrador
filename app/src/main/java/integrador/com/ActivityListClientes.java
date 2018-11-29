package integrador.com;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityListClientes extends AppCompatActivity {

    public FloatingActionButton addCli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_clientes);

        addCli = findViewById(R.id.addCli);

        addCli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityListClientes.this,ActivityCadCliDadosGerais.class);
                startActivity(intent);
            }
        });
    }
}
