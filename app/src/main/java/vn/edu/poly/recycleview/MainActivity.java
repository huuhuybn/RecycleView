package vn.edu.poly.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lvList;

    private ItemAdapter itemAdapter;

    private List<Item> items;

    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvList = findViewById(R.id.lvList);


        items = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Item item = new Item();
            item.title = " Huy Nguyen " + new Random().nextInt();
            items.add(item);
        }

        linearLayoutManager = new LinearLayoutManager(this);

        itemAdapter = new ItemAdapter(this, items);

        lvList.setAdapter(itemAdapter);

        lvList.setLayoutManager(linearLayoutManager);


    }
}
