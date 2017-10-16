package itunes.yapo.cl.yapoitunes.service;

import android.os.AsyncTask;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jvalladares.
 */

public class ConectionItunes extends AsyncTask<Void,Void,Void> {


    @Override
    protected Void doInBackground(Void... voids) {
        final String url = "https://itunes.apple.com/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return null;
    }
}
