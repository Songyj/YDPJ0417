package com.example.wangjie.Page1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.wangjie.Page4.MyItemDecoration;
import com.example.wangjie.Public.MainActivity;
import com.example.wangjie.R;

import java.util.ArrayList;
import java.util.List;
public class others_EvaluationActivity extends AppCompatActivity {
    private RecyclerView recyclerView_others;
    private Context mContext;
    private ListView list_book;
    private ListView list_app;
  //  private MyAdapter<App> myAdapter1 = null;
    private MyAdapter<Book> myAdapter2 = null;
  //  private List<App> mData1 = null;
    private List<Book> mData2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_others__evaluation);
        mContext = others_EvaluationActivity.this;
        init();
        ImageButton back = (ImageButton)findViewById(R.id.Btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(others_EvaluationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void init() {

        recyclerView_others = (RecyclerView) findViewById(R.id.view_others);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView_others.setLayoutManager(layoutManager);

        List<String> typeset = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            typeset.add("医生"+(i+1));
        }



        othersadapter others = new othersadapter(others_EvaluationActivity.this,typeset);
        recyclerView_others.addItemDecoration(new MyItemDecoration(this));
        recyclerView_others.setAdapter(others);




    }
}
