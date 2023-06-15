package com.aguspribadi.gelato;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // kenalkan textView ke MainClass
    TextView quantityTextView;
    Integer quantity = 0;
    String name ="Chocolate";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hubungkan quantityTextView ke object yang dideklarasikan
        quantityTextView = findViewById(R.id.quantityTextView);

        Log.d("MAIN ACTIVITY", "Callback onCreate() dipanggil, Activity dalam keadaan Created");

        if (savedInstanceState != null){
            quantity = savedInstanceState.getInt("SAVED_QUANTITY");
            Log.d("MAIN ACTIVITY", "Variabel quantity ditemukan dan ditampilkan kembali ke TextView");
            quantityTextView.setText(quantity.toString());
        }


    }
    public void substractOne(View view) {
        quantity -= 1;
        quantityTextView.setText(quantity.toString());
    }
    public void addOne(View view){
        quantity += 1;
        quantityTextView.setText(quantity.toString());
    }



    public void LaunchDetailActivity(View view){
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("QUANTITY_PACKET",name);
        intent.putExtra("QUANTITY_PACKET",quantity);

        startActivityForResult(intent,1);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK);
            {
                if (data != null) {
                    quantity = data.getIntExtra("EXTRA_ORDER", 0);
                }
                quantityTextView.setText(quantity.toString());
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MAIN ACTIVITY","Callback onStart() dipanggil,Activity dalam keadaan Started dan mulai tampil ke layar");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MAIN ACTIVITY","Callback onResume() dipanggil,Activity dalam keadaan Resumed dan mulai tampil ke layar");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MAIN ACTIVITY","Callback onPause() dipanggil,Activity dalam keadaan Paused dan mulai tampil ke layar");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MAIN ACTIVITY","Callback onStop() dipanggil,Activity dalam keadaan Stopped dan tidak kelihatan lagi di layar");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MAIN ACTIVITY","Callback onDestroy() dipanggil,Activity dalam keadaan Destroyed dan dihapus dari RAN");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("SAVED_QUANTITY",quantity);
    }
}