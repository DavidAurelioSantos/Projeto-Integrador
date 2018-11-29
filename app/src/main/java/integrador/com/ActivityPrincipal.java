package integrador.com;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActivityPrincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public Intent intent;
    public Intent intentfor;
    public TextView txtTelaPrincipal;
    public Button btCliente;
    public Button btFornecedor;
    public Button btProdutos;
    public Button btOrcamento;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtTelaPrincipal = findViewById(R.id.txtTelaPrincipal);
        btCliente = findViewById(R.id.btCliente);
        btFornecedor = findViewById(R.id.btFornecedor);
        btProdutos = findViewById(R.id.btProdutos);
        btOrcamento = findViewById(R.id.btOrcamentos);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Date data = new Date();
        SimpleDateFormat dateFormat_hora = new SimpleDateFormat("HH:mm");
        Calendar  cal = Calendar.getInstance();
        cal.setTime(data);
        Date data_atual = cal.getTime();
        String hora_atual = dateFormat_hora.format(data_atual);

        txtTelaPrincipal.setText(hora_atual.toString());

        btCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityPrincipal.this, ActivityListClientes.class );
                startActivity(intent);
            }
        });

        btFornecedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityPrincipal.this,ActivityListFornecedores.class);
                startActivity(intent);
            }
        });

        btProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityPrincipal.this,ActivityCadProduto.class);
                startActivity(intent);
            }
        });

        btOrcamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityPrincipal.this, ActivityListOrcamento.class);
                startActivity(intent);
            }
        });


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //Menu do lado direito da tela de Settings. Desativei pois não vi utilidade
//    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        // Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.activity_principal, menu);
////        return true;
////    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Informar a ação de cada item do menu.
        int id = item.getItemId();

        if (id == R.id.cadCliente) {
            intent = new Intent(this, ActivityListClientes.class);
            startActivity(intent);
        } else if (id == R.id.cadFornecedor) {
            intentfor = new Intent(this, ActivityListFornecedores.class);
            startActivity(intentfor);
        } else if (id == R.id.cadProdutos) {
            intent = new Intent(this, ActivityCadProduto.class);
            startActivity(intent);
        } else if (id == R.id.sair) {
            finish();

        } else if (id == R.id.movOrcamento) {
//            Toast.makeText(ActivityPrincipal.this, "Em desenvolvimento", Toast.LENGTH_LONG).show();
            intent = new Intent(this, ActivityListOrcamento.class);
            startActivity(intent);


        }
//        else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
