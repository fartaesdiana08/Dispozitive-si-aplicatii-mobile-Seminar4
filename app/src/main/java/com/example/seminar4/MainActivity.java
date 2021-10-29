package com.example.seminar4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private MeniuAdapter meniuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listview);

        meniuAdapter=new MeniuAdapter(getList());
        lv.setAdapter(meniuAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Random r=new Random(1);
                int alegere=r.nextInt();
                if(alegere%2==0){
                    meniuAdapter.updateList(getList());
                }
                else meniuAdapter.updateList(getList2());
            }
        });

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Meniu menu=meniuAdapter.getItem(position);
                Toast.makeText(getApplicationContext(), menu.toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    private List<Meniu> getList(){
        ArrayList<Meniu> lista=new ArrayList<>();

        Meniu meniu1=new Meniu("Meniu1", 20, "pulpe de pui");
        Meniu meniu2=new Meniu("Meniu2", 30, "muschi de vita");
        Meniu meniu3=new Meniu("Meniu3", 45, "cotlet de porc");

        lista.add(meniu1);
        lista.add(meniu2);
        lista.add(meniu3);

        return lista;
    }

    private List<Meniu> getList2(){
        ArrayList<Meniu> lista=new ArrayList<>();

        Meniu meniu1=new Meniu("Meniu4", 15, "cartofi prajiti");
        Meniu meniu2=new Meniu("Meniu5", 35, "pizza");
        Meniu meniu3=new Meniu("Meniu6", 34, "burger");

        lista.add(meniu1);
        lista.add(meniu2);
        lista.add(meniu3);

        return lista;
    }
}