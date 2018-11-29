package integrador.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import integrador.com.Domain.Util;
import integrador.com.Domain.ZipCodeListener;
import integrador.com.Pojo.Address;

public class ActivityCadCliDadosGerais extends AppCompatActivity {

    public TextView txtNome;
    public TextView txtDDDComercial;
    public TextView txtTelComercial;
    public TextView txtDDDCelular;
    public TextView txtCelular;
    public TextView txtCPF;
    public EditText txtcep;
    public EditText txtRg;
    private Util util;
    public EditText txtEndereco;
    public EditText txtComplemento;
    public EditText txtNumero;
    public EditText txtBairro;
    public EditText txtCidade;
    public TextView tvEsqueci;
    public TextView btSalvar;


//    private static final String ARQUIVO_PREFERENCIA = "Clientes";
//
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            switch (item.getItemId()) {
//                case R.id.dadosGerais:
////                    Intent intent = new Intent(Acitivity2.this,MainActivity.class);
////                    startActivity(intent);
////                    mTextMessage.setText(R.string.cabecalho);
//                    return true;
//                case R.id.endereco:
//
//                    // Recebe dois parâmetros String Name e segundo parâmetro é o módulo de leitura deste arquivo. 0 (zero) arquivo privado só pode ser lido pela aplicação
//                    SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
//                    //Permite editar o arquivo
//                    SharedPreferences.Editor editor = sharedPreferences.edit();
//
//                        editor.putString("nome", txtNome.getText().toString());
//                        editor.commit();
//                        Log.i("David", txtNome.getText().toString());
//                        Intent intent1 = new Intent(ActivityCadCliDadosGerais.this,ActivityCadCliEndereco.class);
//                        startActivity(intent1);
//                        return true;
//
//
////                    Intent intent1 = new Intent(ActivityCadCliDadosGerais.this,ActivityCadCliEndereco.class);
////                    startActivity(intent1);
////                    mTextMessage.setText(R.string.dadosadicionais);
////                    return true;
//            }
//            return false;
//        }
//    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadclientes);

        txtNome = findViewById(R.id.txtNome);
        txtDDDComercial = findViewById(R.id.txtDDDComercial);
        txtTelComercial = findViewById(R.id.txtTelComercial);
        txtDDDCelular = findViewById(R.id.txtDDDCelular);
        txtCelular = findViewById(R.id.txtCelular);
        txtCPF = findViewById(R.id.txtCNPJCPF);
        txtRg = findViewById(R.id.txtRG);
        txtcep = (EditText) findViewById(R.id.txtCep);
        btSalvar = findViewById(R.id.btSalvar);

        // Ação ao clicar no botão Enviar Cadastro e verifica se os campos obrigatórios estão preenchidos
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( txtNome.getText().toString().isEmpty() ||
                        ( txtcep.getText().toString().isEmpty() ||
                                ( txtEndereco.getText().toString().isEmpty() ||
                                        ( txtNumero.getText().toString().isEmpty() ||
                                                ( txtBairro.getText().toString().isEmpty() ||
                                                        ( txtCidade.getText().toString().isEmpty() )) ))) ) {
                    msgcamposbranco(view);
                }
            }
        });

        //Criando máscara do DDD Telefone Comercial
        SimpleMaskFormatter dddcomerial = new SimpleMaskFormatter("(NN)");
        MaskTextWatcher mtw = new MaskTextWatcher(txtDDDComercial, dddcomerial);
        txtDDDComercial.addTextChangedListener(mtw);
//
//        //Criando máscara do Telefone
        SimpleMaskFormatter telcomercial = new SimpleMaskFormatter("NNNN-NNNN");
        MaskTextWatcher mtw1 = new MaskTextWatcher(txtTelComercial, telcomercial);
        txtTelComercial.addTextChangedListener(mtw1);
//
//        //Criando máscara do DDD Celular
        SimpleMaskFormatter dddcelular = new SimpleMaskFormatter("(NN)");
        MaskTextWatcher mtw2 = new MaskTextWatcher(txtDDDCelular, dddcelular);
        txtDDDCelular.addTextChangedListener(mtw2);
//
//        //Criando máscara do Telefone
        SimpleMaskFormatter celular = new SimpleMaskFormatter("NNNNN-NNNN");
        MaskTextWatcher mtw3 = new MaskTextWatcher(txtCelular, celular);
        txtCelular.addTextChangedListener(mtw3);

        //Criando máscara do CPF
        SimpleMaskFormatter cpf = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
        MaskTextWatcher mtwCpf = new MaskTextWatcher(txtCPF, cpf);
        txtCPF.addTextChangedListener(mtwCpf);

        //Criando máscara do RG
        SimpleMaskFormatter rg = new SimpleMaskFormatter("NN.NNN.NNN-N");
        MaskTextWatcher mtwRg = new MaskTextWatcher(txtRg, rg);
        txtRg.addTextChangedListener(mtwRg);


//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationCliente);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


//        //Recupera o nome salvo
//        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
//        //Criado o arquivo com a chave nome e agora recuperamos o nome digitado
//
//        if (sharedPreferences.contains("nome")) {
//            // Traz o nome gravado na chave nome e caso não tenha nada, traz o conteúdo do s1
//            String nomeUsuario = sharedPreferences.getString("nome","usuário não definido");
//            // Encontrando mostrará o nome do usuário
//            Log.i("Foi gravado o nome: ", nomeUsuario);
////        textoExibicao.setText("Olá " + nomeUsuario);
//        }


        txtcep.addTextChangedListener( new ZipCodeListener(this) );

        Spinner spStates = (Spinner) findViewById(R.id.spEstado);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter
                .createFromResource(this,
                        R.array.estados,
                        android.R.layout.simple_spinner_item);
        spStates.setAdapter(adapter);

        Spinner spRegimeTributacao = (Spinner) findViewById(R.id.spinnerRegime);
        ArrayAdapter<CharSequence> adapterRegime = ArrayAdapter
                .createFromResource(this,
                        R.array.RegimeTributacao,
                        android.R.layout.simple_spinner_item);
        spRegimeTributacao.setAdapter(adapterRegime);

        util = new Util(this,
                R.id.txtCep,
                R.id.txtEndereco,
                R.id.txtComplemento,
                R.id.txtNumero,
                R.id.txtBairro,
                R.id.txtCidade,
                R.id.tvEsqueci);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if( requestCode == Address.REQUEST_ZIP_CODE_CODE
                && resultCode == RESULT_OK ){

            txtcep.setText( data.getStringExtra( Address.ZIP_CODE_KEY ) );
        }
    }

//    public String getUriZipCode(){
//        return "https://viacep.com.br/ws/"+txtcep.getText()+"/json/";
//    }

    public void setDataViews(Address address){
        setField( R.id.txtEndereco, address.getLogradouro() );
        setField( R.id.txtComplemento, address.getComplemento() );
        setField( R.id.txtBairro, address.getBairro() );
        setField( R.id.txtCidade, address.getLocalidade() );
        setSpinner( R.id.spEstado, R.array.estados, address.getUf() );
    }

    private void setField( int id, String data ){
        ((EditText) findViewById(id)).setText( data );
    }

    private void setSpinner( int id, int arrayId, String data ){
        String[] itens = getResources().getStringArray(arrayId);

        for( int i = 0; i < itens.length; i++ ){

            if( itens[i].endsWith( "("+data+")" ) ){
                ((Spinner) findViewById(id)).setSelection( i );
                return;
            }
        }
        ((Spinner) findViewById(id)).setSelection( 0 );
    }

    public void searchZipCode(View view){
        Intent intent = new Intent(this, ZipCodeSearchActivity.class);
        startActivityForResult( intent, Address.REQUEST_ZIP_CODE_CODE );
    }

    private String getZipCode(){
        return txtcep.getText().toString();
    }

    public String getUriRequest(){
        return "https://viacep.com.br/ws/"+getZipCode()+"/json/";
    }

    public void lockFields( boolean isToLock ){
        util.lockFields( isToLock );
    }

    public void msgcamposbranco(View view) {
        Toast.makeText(this, "Os campos com " + " ( * )" + ", são de preenchimento obrigatório. Verifique !!!", Toast.LENGTH_LONG).show();
//        Snackbar.make(view, "Os campos com " + " ( * )" + ", são de preenchimento obrigatório. Verifique !!!", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();
    }

}
