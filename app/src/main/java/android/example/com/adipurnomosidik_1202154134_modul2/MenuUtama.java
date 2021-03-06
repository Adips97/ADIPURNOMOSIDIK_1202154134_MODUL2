package android.example.com.adipurnomosidik_1202154134_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class MenuUtama extends AppCompatActivity {
    RadioButton dine,taway;
    Intent pindah;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        Toast toast = null;
        toast = Toast.makeText(getApplicationContext(),"Adi Purnomo Sidik_1202154134", Toast.LENGTH_LONG); toast.show();
        dine = findViewById(R.id.in);
        taway = findViewById(R.id.away);
    }

    public void onClick(View view){
        if (view.getId()== R.id.tipe){
            if(dine.isChecked()){
                pindah = new Intent(this, DineIn.class);
                toast = Toast.makeText(getApplicationContext(),"Anda memilih menu : Dine In" , Toast.LENGTH_SHORT); toast.show();
                startActivity(pindah);
            }
            else if(taway.isChecked()){
                pindah = new Intent(this, TakeAway.class);
                toast = Toast.makeText(getApplicationContext(),"Anda memilih menu : Take Away", Toast.LENGTH_SHORT); toast.show();
            }
            startActivity(pindah);
        }
        else{
            toast = Toast.makeText(getApplicationContext(),"Silakan memilih menu", Toast.LENGTH_SHORT); toast.show();
        }
    }

}