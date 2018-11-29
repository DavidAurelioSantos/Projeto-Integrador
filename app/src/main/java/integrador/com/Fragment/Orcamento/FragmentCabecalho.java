package integrador.com.Fragment.Orcamento;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import integrador.com.R;

public class FragmentCabecalho extends Fragment {

    private View convertView;
    private EditText txtDocumento;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;

//        txtDocumento = (EditText) getView().findViewById(R.id.txtDocumento);
    }

    public FragmentCabecalho() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.tabcabecalho, container, false);
        }
        return convertView;

    }
}
