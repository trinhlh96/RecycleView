package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Product> listProduct = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        ProductAdapter productAdapter = new ProductAdapter(this,listProduct);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        RecyclerView rvProduct = findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(productAdapter);
    }

    private void initData() {
        listProduct.add(new Product("sp1","100.000",R.drawable.p1));
        listProduct.add(new Product("sp2","100.000",R.drawable.p2));
        listProduct.add(new Product("sp3","100.000",R.drawable.p3));
        listProduct.add(new Product("sp4","100.000",R.drawable.p4));
        listProduct.add(new Product("sp5","100.000",R.drawable.p5));
        listProduct.add(new Product("sp6","100.000",R.drawable.p6));
    }
}