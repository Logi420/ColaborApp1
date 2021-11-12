package com.example.miprimeraapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Examples extends AppCompatActivity {

    private ListView lista;
    private TextView item;

    String[] productos={"jazban", "Shampus", "Cera", "Toallas"};
    double[] precio={15000, 192000, 29300, 90000};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examples);

        lista=findViewById(R.id.txtProducto);
        item=findViewById(R.id.lstProductos);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.menuitem,productos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                item.setText("El producto: "+productos[position]+"vale "+precio[position]);
            }
        });
    }


}