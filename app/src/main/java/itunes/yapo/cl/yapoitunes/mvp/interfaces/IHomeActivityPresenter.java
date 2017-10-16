package itunes.yapo.cl.yapoitunes.mvp.interfaces;

import itunes.yapo.cl.yapoitunes.service.model.ItunesSearch;

/**
 * Created by jvalladares.
 */

public interface IHomeActivityPresenter {

    void showError(String error);

    void getSearchArtistItunes(String search);

    void initList(ItunesSearch itunesSearch);

}
