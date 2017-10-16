package itunes.yapo.cl.yapoitunes.mvp.presenters;

import itunes.yapo.cl.yapoitunes.mvp.interactors.HomeActivityInteractorImpl;
import itunes.yapo.cl.yapoitunes.mvp.interfaces.IHomeActivityInteractor;
import itunes.yapo.cl.yapoitunes.mvp.interfaces.IHomeActivityPresenter;
import itunes.yapo.cl.yapoitunes.mvp.interfaces.IHomeActivityView;
import itunes.yapo.cl.yapoitunes.service.model.ItunesSearch;

/**
 * Created by jvalladares.
 */

public class HomeActivityPresenterImpl implements IHomeActivityPresenter {

    private final IHomeActivityView view;
    private final IHomeActivityInteractor interactor;

    public HomeActivityPresenterImpl(IHomeActivityView view){
        this.view = view;
        this.interactor = new HomeActivityInteractorImpl(this);
    }

    @Override
    public void showError(String error) {
        if(view != null){
            view.showProgress(false);
            view.showError(error);
        }
    }

    @Override
    public void getSearchArtistItunes(String search) {
        view.hideKeyBoard();
        if(view != null && !search.equals("")){
            view.showProgress(true);
            view.showList(false);
            interactor.getSearchArtistItunes(search);
            view.showProgress(false);
        }else{
            if(search.equals("")){
                view.showError("Favor de ingresar un artista");
            }
        }
    }

    @Override
    public void initList(ItunesSearch itunesSearch) {
        view.initList(itunesSearch);
        view.showList(true);
    }
}
