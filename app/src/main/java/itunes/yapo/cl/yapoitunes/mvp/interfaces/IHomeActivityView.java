package itunes.yapo.cl.yapoitunes.mvp.interfaces;

import itunes.yapo.cl.yapoitunes.service.model.ItunesSearch;

/**
 * Created by jvalladares.
 */

public interface IHomeActivityView {

    /**
     *
     * @param isVisible
     */
    void showProgress(boolean isVisible);

    /**
     *
     * @param error
     */
    void showError(String error);

    /**
     *
     * @param itunesSearch
     */
    void initList(ItunesSearch itunesSearch);

    /**
     *
     */
    public void hideKeyBoard();

    /**
     *
     * @param isVisible
     */
    public void showList(Boolean isVisible);

}
