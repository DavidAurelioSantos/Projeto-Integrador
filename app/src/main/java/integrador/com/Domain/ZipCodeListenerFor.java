package integrador.com.Domain;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;

import integrador.com.ActivityCadCliDadosGerais;
import integrador.com.ActivityCadFor;
import integrador.com.Request.AddressRequestFor;

public class ZipCodeListenerFor implements TextWatcher {
    private Context context;

    public ZipCodeListenerFor(Context context ){
        this.context = context;
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

    @Override
    public void afterTextChanged(Editable editable) {
        String zipCode = editable.toString();

        if( editable.length() == 8 ){
            new AddressRequestFor( (ActivityCadFor) context ).execute();
        }
    }
}
