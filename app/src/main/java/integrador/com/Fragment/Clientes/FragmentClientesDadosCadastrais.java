package integrador.com.Fragment.Clientes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import integrador.com.R;


public class FragmentClientesDadosCadastrais extends Fragment {

    private View convertView;

    public FragmentClientesDadosCadastrais() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.fragment_clientes_dados_cadastrais, container, false);
        }
        return convertView;
    }

}
