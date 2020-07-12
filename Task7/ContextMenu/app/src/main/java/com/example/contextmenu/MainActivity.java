package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String shops[]={"Store One", "Store two","XYZ Shop","ABC Store","Store A","Store B"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,shops);
        list.setAdapter(adapter);
        registerForContextMenu(list);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.coupons){
            Toast.makeText(getApplicationContext(),"You Selected Coupons",Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.cashback){
            Toast.makeText(getApplicationContext(),"You Selected Cashback", Toast.LENGTH_LONG).show();

        }
        else if(item.getItemId()==R.id.deals){
            Toast.makeText(getApplicationContext(),"You Selected Deals",Toast.LENGTH_LONG).show();
        }else{
            return false;
        }
        return true;
    }
}