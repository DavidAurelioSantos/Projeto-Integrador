package integrador.com.Fragment.Clientes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import integrador.com.R;

public class FragmentEndereco extends Fragment {

    private View convertView;
    private EditText txtDocumento;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;

//        txtDocumento = (EditText) getView().findViewById(R.id.txtDocumento);
    }

    public FragmentEndereco() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.tabendereco, container, false);
        }
        return convertView;

    }
}
