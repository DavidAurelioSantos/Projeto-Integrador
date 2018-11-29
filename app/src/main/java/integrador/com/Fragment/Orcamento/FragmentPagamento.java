package integrador.com.Fragment.Orcamento;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import integrador.com.R;

public class FragmentPagamento extends Fragment {

    private View convertView;

    public FragmentPagamento() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.tabpagamento, container, false);
        }
        return convertView;
    }
}
