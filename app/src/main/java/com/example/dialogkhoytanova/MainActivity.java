package com.example.dialogkhoytanova;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bgButton;
    public RelativeLayout relativeLayout;
    public ConstraintLayout constraintLayout;
    Context context;
    final CharSequence[] items = {
            getText(R.string.red),
            getText(R.string.yellow),
            getText(R.string.green)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton=(Button)findViewById(R.id.background_button);

        relativeLayout=(RelativeLayout)findViewById(R.id.relativelayout);
        context=MainActivity.this;
        bgButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case 0:
                        Toast.makeText(context, R.string.green,Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.redColor);
                        break;
                    case 1:
                        Toast.makeText(context, R.string.green,Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.yellowColor);
                        break;
                    case 2:
                        Toast.makeText(context, R.string.yellow,Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.greenColor);
                        break;
                }
            }
        });
    }
}