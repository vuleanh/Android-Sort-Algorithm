package com.anvu.androidsortalgorithm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSort;
    private TextView txtUnsorted, txtSorted;
    private int[] input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = new int[]{2, 6, 8, 1, 3, 2, 9};
        btnSort = (Button) findViewById(R.id.btn_sort);
        txtSorted = (TextView) findViewById(R.id.txt_sorted);
        txtUnsorted = (TextView) findViewById(R.id.txt_unsorted);

        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(SortUtil.bubbleSort(input));
            }
        });
    }
}
