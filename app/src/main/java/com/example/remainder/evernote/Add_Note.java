package com.example.remainder.evernote;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Add_Note extends ActionBarActivity implements View.OnClickListener{
/*    Button mCancel;*/
    com.gc.materialdesign.views.ButtonRectangle mSubmit,mCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__note);
    mSubmit=(com.gc.materialdesign.views.ButtonRectangle)findViewById(R.id.sub_but);
        mCancel=(com.gc.materialdesign.views.ButtonRectangle)findViewById(R.id.cancel_but);
    mSubmit.setOnClickListener(this);
        mCancel.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add__note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        if(R.id.sub_but==view.getId())
        {

        }
        else
        {
            finish();
        }
    }
}