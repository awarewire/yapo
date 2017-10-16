package itunes.yapo.cl.yapoitunes.service;

import itunes.yapo.cl.yapoitunes.service.model.ItunesSearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jvalladares on 15-10-17.
 */
public interface ITunesServiceWS {

    @GET("search")
    Call<ItunesSearch> getItunesSearchServices(@Query("term") String artist);
}
