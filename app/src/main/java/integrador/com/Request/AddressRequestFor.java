package integrador.com.Request;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.lang.ref.WeakReference;

import integrador.com.ActivityCadCliDadosGerais;
import integrador.com.ActivityCadFor;
import integrador.com.Pojo.Address;

public class AddressRequestFor extends AsyncTask<Void, Void, Address> {
    private WeakReference<ActivityCadFor> activity;

    public AddressRequestFor(ActivityCadFor activity ){
        this.activity = new WeakReference<>( activity );
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        if ( activity.get() != null ) {
            activity.get().lockFields( true );
        }
    }

    @Override
    protected void onPostExecute(Address address) {
        super.onPostExecute(address);

        if( activity.get() != null ){
            activity.get().lockFields( false );

            if( address != null ){
                activity.get().setDataViews(address);
            }
        }
    }

    @Override
    protected Address doInBackground(Void... voids) {

        try{
            String jsonString = JsonRequest.request( activity.get().getUriRequest() );
            Gson gson = new Gson();

            return gson.fromJson(jsonString, Address.class);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


}
