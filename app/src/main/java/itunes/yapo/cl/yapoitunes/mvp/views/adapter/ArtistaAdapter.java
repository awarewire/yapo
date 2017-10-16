package itunes.yapo.cl.yapoitunes.mvp.views.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import itunes.yapo.cl.yapoitunes.mvp.views.adapter.row.ItemArtista;
import itunes.yapo.cl.yapoitunes.service.model.ItunesSearch;
import itunes.yapo.cl.yapoitunes.service.model.Result;

/**
 * Created by jvalladares.
 */

public
class ArtistaAdapter extends BaseAdapter {

    private final Activity activity;

    private List<Result> dataSource;

    private LayoutInflater layout;


    public ArtistaAdapter(Activity activity, ItunesSearch itunesSearch ){
        this.activity = activity;
        this.dataSource = itunesSearch.getResults();
        this.layout = (LayoutInflater) activity.getBaseContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return new Long(i);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Result result = this.dataSource.get(i);
        ItemArtista item = new ItemArtista(layout, result, view);
        return item.getView();
    }

}
