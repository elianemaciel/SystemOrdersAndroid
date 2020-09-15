package br.ucs.systemorders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        final List<Orders> orders = new ArrayList<>();
        orders.add(new Orders(1,100,1));
        orders.add(new Orders(2,101,5));
        orders.add(new Orders(3,102,3));
        orders.add(new Orders(4,103,4));

        Adapter adapter = new Adapter(orders);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}