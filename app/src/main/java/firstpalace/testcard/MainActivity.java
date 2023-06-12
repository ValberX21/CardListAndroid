package firstpalace.testcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String platform, gameName;
    int image;
    RecyclerView recyclerView;
    ArrayList<Game> games;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.mylist);

        games = new ArrayList<Game>();

        games.add(new Game(R.drawable.supermariobros,
        "Nintendo","Mario"));

        games.add(new Game(R.drawable.donkeykong,
                "Nintendo","Donkey Kong"));

        games.add(new Game(R.drawable.pacman,
                "Atari","Pac Man"));

        games.add(new Game(R.drawable.gta,
                "Playstation 2","GTA"));

        games.add(new Game(R.drawable.streetfighter,
                "Arcade","Street Fighter"));


        MAdapter mAdapter = new MAdapter(games, getApplicationContext(), new MAdapter.OnItemClicklistener(){
            @Override
            public void onItemClick(Game game){


                platform = game.getPlatform();
                gameName = game.getName();
                image = game.getImage();

                Bundle bundle1 = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle();
                Intent detCell1 = new Intent(getBaseContext(), detailGame.class);
                System.out.println("-->" + game.getImage());
                detCell1.putExtra("p1", platform);
                detCell1.putExtra("p2", gameName);
                detCell1.putExtra("p3",image);


                startActivity(detCell1, bundle1);
            }
        });

        recyclerView.setAdapter(mAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
    }
}