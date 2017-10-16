package itunes.yapo.cl.yapoitunes.mvp.views.adapter.row;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import itunes.yapo.cl.yapoitunes.mvp.R;
import itunes.yapo.cl.yapoitunes.service.model.Result;

/**
 * Created by jvalladares.
 */

public class ItemArtista {

    private View mFullView;
    public ViewHolder holder;

    public ItemArtista(LayoutInflater layout, Result result, View convertView){
        if(convertView == null){
            convertView = (View) layout.inflate(R.layout.item_artist, null);
            //Inicializar los componentes
            holder = new ViewHolder();
            holder.imageArtista = (ImageView)convertView.findViewById(R.id.iconoArtista);
            holder.title = (TextView)convertView.findViewById(R.id.titulo);
            holder.subTitle = (TextView)convertView.findViewById(R.id.subtitulo);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        this.mFullView = convertView;
        holder.title.setText(result.getCollectionName());
        holder.subTitle.setText(result.getArtistName());
        Glide.with(layout.getContext()).load(result.getArtworkUrl100()).into(holder.imageArtista);
    }

    public View getView() {
        return this.mFullView;
    }

    public static class ViewHolder {
        public ImageView imageArtista;
        public TextView title;
        public TextView subTitle;
    }
}
