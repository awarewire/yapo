package itunes.yapo.cl.yapoitunes.mvp.interactors;


import android.util.Log;

import itunes.yapo.cl.yapoitunes.mvp.interfaces.IHomeActivityInteractor;
import itunes.yapo.cl.yapoitunes.mvp.interfaces.IHomeActivityPresenter;
import itunes.yapo.cl.yapoitunes.service.ITunesServiceWS;
import itunes.yapo.cl.yapoitunes.service.UrlConnectionEnum;
import itunes.yapo.cl.yapoitunes.service.model.ItunesSearch;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by jvalladares.
 */

public class HomeActivityInteractorImpl implements IHomeActivityInteractor {

    private final IHomeActivityPresenter presenter;

    private Retrofit retrofit;

    private String resultadoText;

    public HomeActivityInteractorImpl(IHomeActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getSearchArtistItunes(String search) {
        final String url = UrlConnectionEnum.URL_DOMINIO.getUrl();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ITunesServiceWS service = retrofit.create(ITunesServiceWS.class);
        Call<ItunesSearch> call = service.getItunesSearchServices(search);

        call.enqueue(new Callback<ItunesSearch>() {
            @Override
            public void onResponse(Call<ItunesSearch> call, Response<ItunesSearch> response) {
                ItunesSearch itunesSearch = response.body();
                presenter.initList(itunesSearch);
            }

            @Override
            public void onFailure(Call<ItunesSearch> call, Throwable t) {
                Log.e("onFailure", t.toString());
            }
        });


    }
}
