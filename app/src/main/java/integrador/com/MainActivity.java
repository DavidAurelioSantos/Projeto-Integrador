package integrador.com;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btEntrar;
    public Intent intent;
    ProgressDialog progressDoalog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEntrar = (Button) findViewById(R.id.btEntrar);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressDoalog = new ProgressDialog(MainActivity.this);
                progressDoalog.setMessage("Aguarde....");
                progressDoalog.show();

                intent = new Intent(view.getContext(), ActivityPrincipal.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
