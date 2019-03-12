package appthird.android.jagriti.appthird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Post> dataList = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataList.add(new Post(1,"Laptop 1","Dell"));
        dataList.add(new Post(2,"Laptop 2","Lenovo"));
        dataList.add(new Post(3,"Laptop 3","Mac "));
        dataList.add(new Post(4,"Laptop 4","Acer"));
        dataList.add(new Post(5,"Laptop 5","HP"));
        dataList.add(new Post(6,"Laptop 6","newOne"));
        dataList.add(new Post(7,"Laptop 7","newOne 1"));
        dataList.add(new Post(8,"Laptop 8","newOne 2"));
        dataList.add(new Post(9,"Laptop 9","newOne 3"));
        dataList.add(new Post(10,"Laptop 10","newOne 4"));
        recyclerView = findViewById(R.id.recycleViews);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PostAdapter postAdapter = new PostAdapter(dataList);
        recyclerView.setAdapter(postAdapter);

        /*insert query example*/
       /* AppDatabase.getAppDatabase(this).userDao().insertAll(new User(1,"xyz","3sdfds"));
        AppDatabase.getAppDatabase(this).userDao().insertAll(new User(2,"xyz11","31dfds"));
        AppDatabase.getAppDatabase(this).userDao().insertAll(new User(3,"xyz22","32fds"));*/



    }

}
