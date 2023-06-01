package firstpalace.testcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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
                Toast.makeText(MainActivity.this, game.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(mAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
    }
}