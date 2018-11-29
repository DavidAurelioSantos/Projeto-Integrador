package integrador.com.Fragment.Orcamento;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import integrador.com.R;

public class FragmentDadoAdicional extends Fragment {

    private View convertView;

    public FragmentDadoAdicional() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.tabdadoadicional, container, false);
        }
        return convertView;
    }
}
