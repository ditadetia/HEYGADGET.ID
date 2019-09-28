package com.demo.seventeenmember;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMembers;
    private ArrayList<Member> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMembers = findViewById(R.id.rv_members);
        rvMembers.setHasFixedSize(true);

        list.addAll(MembersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMembers.setLayoutManager(new LinearLayoutManager(this));
        ListMemberAdapter listMemberAdapter = new ListMemberAdapter(list);
        rvMembers.setAdapter(listMemberAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.miCompose:
                Intent moveIntent = new Intent(MainActivity.this, About_Activity.class);
                startActivity(moveIntent);
                break;
        }
    }
}