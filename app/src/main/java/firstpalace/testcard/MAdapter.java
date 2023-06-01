package firstpalace.testcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.games.Games;

import java.util.ArrayList;

public class MAdapter extends RecyclerView.Adapter {

    ArrayList<Game> games;
    Context context;
    OnItemClicklistener listener;

    public MAdapter(ArrayList<Game> games, Context context, OnItemClicklistener listener) {
        this.games = games;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mcell,parent,false);
        MViewHolder mViewHolder =new MViewHolder(view);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MViewHolder mViewHolder = (MViewHolder) holder;
        Game game = games.get(position);
        mViewHolder.image.setImageResource(game.getImage());
        mViewHolder.platform.setText(game.getPlatform());
        mViewHolder.bind(games.get(position),listener);
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public interface  OnItemClicklistener{
        void onItemClick(Game game);
    }
}
