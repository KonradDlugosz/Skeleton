package android.example.travelsuggestion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LetMeChoose extends AppCompatActivity {

    private Button btn_example;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_let_me_choose);

        btn_example = (Button) findViewById(R.id.btnExample);
    }

    public void onClickShowExampleCoutry(View view){
        Toast.makeText(getApplicationContext(), "Its working",Toast.LENGTH_LONG).show();

    }
}
