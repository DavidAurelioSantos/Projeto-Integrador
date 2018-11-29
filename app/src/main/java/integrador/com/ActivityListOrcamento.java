package integrador.com;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ActivityListOrcamento extends AppCompatActivity {

    public CalendarView calendarInicio;
    public CalendarView calendarFim;
    public Button botaoInicio;
    public Button botaoFim;
    public EditText editDataInicio;
    public EditText editDataFim;

    public FloatingActionButton addOrc;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_orcamento);

        calendarInicio = findViewById(R.id.calendarInicio);
        calendarFim = findViewById(R.id.calendarFim);
        botaoInicio = (Button) findViewById(R.id.botaoInicio);
        botaoFim = (Button) findViewById(R.id.botaoFim);
        editDataInicio = (EditText) findViewById(R.id.editDataInicio);
        editDataFim = (EditText) findViewById(R.id.editDataFim);

//        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
//        Date dataAtu = new Date();
//        String dataFormatada = formataData.format(dataAtu);

        calendarInicio.setVisibility(View.INVISIBLE);
        calendarFim.setVisibility(View.INVISIBLE);

        botaoInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendarInicio.setVisibility(View.VISIBLE);
            }
        });

        calendarInicio.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 + "/" + (i1 + 1) + "/" + i;
                editDataInicio.setText(date);
                calendarInicio.setVisibility(View.INVISIBLE);
            }
        });

        botaoFim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendarFim.setVisibility(View.VISIBLE);
            }
        });

        calendarFim.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 + "/" + (i1 + 1) + "/" + i;
                editDataFim.setText(date);
                calendarFim.setVisibility(View.INVISIBLE);
            }
        });

        addOrc = (FloatingActionButton) findViewById(R.id.addOrc);

        addOrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(ActivityListOrcamento.this, ActivityOrcamento.class);
                startActivity(intent);
            }
        });
    }
}
