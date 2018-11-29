package integrador.com;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import integrador.com.Domain.Util;
import integrador.com.Domain.ZipCodeListener;
import integrador.com.Pojo.Address;

public class ActivityCadCliEndereco extends AppCompatActivity {

//    public EditText txtcep;
//    private Util util;
//
//    public EditText txtEndereco;
//    public EditText txtComplemento;
//    public EditText txtNumero;
//    public EditText txtBairro;
//    public EditText txtCidade;
//    public TextView tvEsqueci;
//
//
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.dadosGerais:
//                    Intent intent = new Intent(ActivityCadCliEndereco.this,ActivityCadCliDadosGerais.class);
//                    startActivity(intent);
////                    mTextMessage.setText(R.string.cabecalho);
//                    return true;
//                case R.id.endereco:
////                    Intent intent1 = new Intent(Acitivity2.this,Activity3.class);
////                    startActivity(intent1);
////                    mTextMessage.setText(R.string.dadosadicionais);
//                    return true;
//            }
//            return false;
//        }
//    };
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tabendereco);
//
////        txtcep = findViewById(R.id.txtCep);
//
//        //Criando máscara do CEP
////        SimpleMaskFormatter CEP = new SimpleMaskFormatter("NNNNN-NNN");
////        MaskTextWatcher maskCep = new MaskTextWatcher(txtcep, CEP);
////        txtcep.addTextChangedListener(maskCep);
//
////        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationClienteEndereco);
////        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//
//        txtcep = (EditText) findViewById(R.id.txtCep);
//        txtcep.addTextChangedListener( new ZipCodeListener(this) );
//
//        Spinner spStates = (Spinner) findViewById(R.id.spEstado);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter
//                .createFromResource(this,
//                        R.array.estados,
//                        android.R.layout.simple_spinner_item);
//        spStates.setAdapter(adapter);
//
//        util = new Util(this,
//                R.id.txtCep,
//                R.id.txtEndereco,
//                R.id.txtComplemento,
//                R.id.txtNumero,
//                R.id.txtBairro,
//                R.id.txtCidade,
//                R.id.tvEsqueci);
//    }

    // Aqui acaba o onCreate


//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if( requestCode == Address.REQUEST_ZIP_CODE_CODE
//                && resultCode == RESULT_OK ){
//
//            txtcep.setText( data.getStringExtra( Address.ZIP_CODE_KEY ) );
//        }
//    }
//
////    public String getUriZipCode(){
////        return "https://viacep.com.br/ws/"+txtcep.getText()+"/json/";
////    }
//
//    public void setDataViews(Address address){
//        setField( R.id.txtEndereco, address.getLogradouro() );
//        setField( R.id.txtComplemento, address.getComplemento() );
//        setField( R.id.txtBairro, address.getBairro() );
//        setField( R.id.txtCidade, address.getLocalidade() );
//        setSpinner( R.id.spEstado, R.array.estados, address.getUf() );
//    }
//
//    private void setField( int id, String data ){
//        ((EditText) findViewById(id)).setText( data );
//    }
//
//    private void setSpinner( int id, int arrayId, String data ){
//        String[] itens = getResources().getStringArray(arrayId);
//
//        for( int i = 0; i < itens.length; i++ ){
//
//            if( itens[i].endsWith( "("+data+")" ) ){
//                ((Spinner) findViewById(id)).setSelection( i );
//                return;
//            }
//        }
//        ((Spinner) findViewById(id)).setSelection( 0 );
//    }
//
//    public void searchZipCode(View view){
//        Intent intent = new Intent(this, ZipCodeSearchActivity.class);
//        startActivityForResult( intent, Address.REQUEST_ZIP_CODE_CODE );
//    }
//
//    private String getZipCode(){
//        return txtcep.getText().toString();
//    }
//
//    public String getUriRequest(){
//        return "https://viacep.com.br/ws/"+getZipCode()+"/json/";
//    }
//
//    public void lockFields( boolean isToLock ){
//        util.lockFields( isToLock );
//    }
}
