package lucis.classy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import lucis.classy.R;

/**
 * Created by Pin on 13-Dec-16.
 */

public class SelectModuleActivity extends AppCompatActivity {

    Intent module;
    Button button50001;
    Button button50002;
    Button button50004;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectmodule);

        button50001 = (Button) findViewById(R.id.button50001);
        button50002 = (Button) findViewById(R.id.button50002);
        button50004 = (Button) findViewById(R.id.button50004);

        module = new Intent(getApplicationContext(), ModuleActivity.class);

        button50001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                module.putExtra("Module", "50001");
                startActivity(module);
            }
        });

        button50002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                module.putExtra("Module", "50002");
                startActivity(module);
            }
        });

        button50004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                module.putExtra("Module", "50004");
                startActivity(module);
            }
        });
    }

}
