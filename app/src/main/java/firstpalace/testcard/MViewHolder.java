package firstpalace.testcard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MViewHolder  extends RecyclerView.ViewHolder {

    ImageView image;
    TextView platform;

    public MViewHolder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.img_cell);
        platform = itemView.findViewById(R.id.platform);
    }

    public void bind(final Game item, final MAdapter.OnItemClicklistener listener){
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                listener.onItemClick(item);
            }
        });
    }
}
