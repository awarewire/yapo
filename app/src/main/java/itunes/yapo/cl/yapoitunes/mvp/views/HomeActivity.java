package itunes.yapo.cl.yapoitunes.mvp.views;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;
import org.androidannotations.annotations.ViewById;

import itunes.yapo.cl.yapoitunes.mvp.R;
import itunes.yapo.cl.yapoitunes.mvp.interfaces.IHomeActivityPresenter;
import itunes.yapo.cl.yapoitunes.mvp.interfaces.IHomeActivityView;
import itunes.yapo.cl.yapoitunes.mvp.presenters.HomeActivityPresenterImpl;
import itunes.yapo.cl.yapoitunes.mvp.views.adapter.ArtistaAdapter;
import itunes.yapo.cl.yapoitunes.service.model.ItunesSearch;

@Fullscreen
@EActivity(R.layout.home_activity)
public class HomeActivity extends AppCompatActivity implements IHomeActivityView {

    @ViewById
    EditText textBuscar;

    @ViewById
    ProgressBar progress;

    @ViewById
    ListView listaArtistas;

    private IHomeActivityPresenter presenter;

    private ArtistaAdapter adapter;

    @AfterViews
    public void init() {
        presenter = new HomeActivityPresenterImpl(this);
        progress.setVisibility(View.GONE);
        textBuscar.setOnEditorActionListener(pressedEnter());
    }

    private TextView.OnEditorActionListener pressedEnter() {
        return new TextView.OnEditorActionListener(){

            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    clickBuscar();
                    return true;
                }
                return false;
            }
        };
    }


    @Override
    public void showProgress(boolean isVisible) {
        progress.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }

    @Override
    public void showError(String error) {
        textBuscar.setError(error);
        textBuscar.setText("");
        Toast.makeText(HomeActivity.this, error, Toast.LENGTH_SHORT).show();
    }

    @Click(R.id.buttonBuscar)
    public void clickBuscar() {
        Log.i("HomeActivity", "Buscar artista");
        hideKeyBoard();
        progress.setVisibility(View.VISIBLE);
        presenter.getSearchArtistItunes(textBuscar.getText().toString());
    }

    @Override
    public void initList(ItunesSearch itunesSearch) {
        adapter = new ArtistaAdapter(this, itunesSearch);
        listaArtistas.setAdapter(adapter);
    }

    @Override
    public void hideKeyBoard() {
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }

    @Override
    public void showList(Boolean isVisible) {
        this.listaArtistas.setVisibility(isVisible ? View.VISIBLE : View.GONE);
    }
}
