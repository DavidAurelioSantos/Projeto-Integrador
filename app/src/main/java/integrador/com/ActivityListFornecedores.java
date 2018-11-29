package integrador.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivityListFornecedores extends AppCompatActivity {

    public FloatingActionButton addFor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fornecedores);

        addFor = findViewById(R.id.addFor);

        addFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityListFornecedores.this,ActivityCadFor.class);
                startActivity(intent);
            }
        });
    }
}
