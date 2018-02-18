package android.example.com.adipurnomosidik_1202154134_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MenuMakanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void NasiGoreng(View view) {
        Intent intent = new Intent(this, NasiGoreng.class);
        startActivity(intent);
    }

    public void MieRebus(View view) {
        Intent intent = new Intent(this, MieRebus.class);
        startActivity(intent);
    }

    public void mendoan(View view) {
        Intent intent = new Intent(this, Mendoan.class);
        startActivity(intent);
    }
    public void ayam(View view) {
        Intent intent = new Intent(this, AyamGoreng.class);
        startActivity(intent);
    }
    public void showMie(View view) {
        Intent intent = new Intent(this, MieRebus.class);
        startActivity(intent);
    }

    public void showMendoan(View view) {
        Intent intent = new Intent(this, Mendoan.class);
        startActivity(intent);
    }

    public void shownasiGoreng(View view) {
        Intent intent = new Intent(this, NasiGoreng.class);
        startActivity(intent);
    }

    public void showAyam(View view) {
        Intent intent = new Intent(this,AyamGoreng.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

}



