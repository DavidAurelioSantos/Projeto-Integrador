package integrador.com.Fragment.Orcamento;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import integrador.com.R;

public class FragmentListProduto extends Fragment {

    public EditText txtQtde;
    public EditText txtPrcUni;
    public TextView txtValorTotal;
    public Button botaoId;

    private View convertView;

    public FragmentListProduto() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {







        if (convertView == null) {
            convertView = inflater.inflate(R.layout.tablistproduto, container, false);
        }

//        txtQtde = (EditText)getView().findViewById(R.id.txtQtde);
//        txtPrcUni = (EditText)getView().findViewById(R.id.txtPrcUnit);
//        txtValorTotal = (TextView)getView().findViewById(R.id.txtValorTotal);
//        botaoId = (Button)getView().findViewById(R.id.botaoId);


//        botaoId.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if ( txtQtde.toString().isEmpty() || txtPrcUni.toString().isEmpty() ) {
//                    Toast.makeText(getContext(),"Entre com a QUANTIDADE e o VALOR UNITÁRIO",Toast.LENGTH_LONG).show();
//                }
//
//                String textoQtdeDigitado = txtQtde.getText().toString();
//                String textoPrcUni = txtPrcUni.getText().toString();
//
//                if ( textoQtdeDigitado.isEmpty() || textoPrcUni.isEmpty()){
//                    Toast.makeText(getContext(),"Entre com a QUANTIDADE e o VALOR UNITÁRIO",Toast.LENGTH_LONG).show();
//                } else {
//                    int qtdeDigitado = Integer.parseInt(textoQtdeDigitado);
//                    Double prcUni = Double.parseDouble(textoPrcUni);
//                    Double valorTotal = qtdeDigitado * prcUni;
//                    String total = valorTotal.toString();
//
//                    txtValorTotal.setText(total);
//
//                }
//        };
//
//
//        });
        return convertView;
    }
}
