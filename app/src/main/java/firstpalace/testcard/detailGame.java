package firstpalace.testcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailGame extends AppCompatActivity {

    private String receiverID1, receiverID2;
    private String receiverID3;
    private int receiverID4;
    private TextView platx, namex;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_game);

        platx = findViewById(R.id.gamePlat);
        namex = findViewById(R.id.gameName);
        image = findViewById(R.id.gameImg);

        receiverID1 = getIntent().getExtras().get("p1").toString();
        receiverID2 = getIntent().getExtras().get("p2").toString();
        receiverID3 = getIntent().getExtras().get("p3").toString();

        receiverID4 = Integer.parseInt(receiverID3);
        platx.setText(receiverID1);
        namex.setText(receiverID2);
        image.setImageResource(receiverID4);

    }
}