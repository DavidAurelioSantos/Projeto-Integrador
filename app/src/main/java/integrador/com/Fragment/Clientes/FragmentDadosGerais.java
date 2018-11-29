package integrador.com.Fragment.Clientes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import integrador.com.R;

public class FragmentDadosGerais extends Fragment {

    private View convertView;
    private EditText txtDocumento;
    private EditText txtDDDComercial;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;

        txtDocumento = (EditText) getView().findViewById(R.id.txtDocumento);
        txtDDDComercial = (EditText) getView().findViewById(R.id.txtDDDComercial);

        //Criando máscara do DDD
        SimpleMaskFormatter dddcomerial = new SimpleMaskFormatter("(NNNN)");
        MaskTextWatcher mtw = new MaskTextWatcher(txtDDDComercial, dddcomerial);
        txtDDDComercial.addTextChangedListener(mtw);
    }

    public FragmentDadosGerais() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.cadclientes, container, false);
        }
        return convertView;

    }
}
