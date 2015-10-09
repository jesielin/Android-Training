package com.shawn.gettingstarted;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.shawn.tools.DebugLog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DebugLog.e("oncreate restore..");
        if (savedInstanceState != null) {
            DebugLog.e("data:" + savedInstanceState.get("DATA"));
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_search:
                Toast.makeText(this, "搜索", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when the user clicks the Send button
     */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editMessage = (EditText) findViewById(R.id.edit_message);
        String message = editMessage.getText().toString().trim();
        intent.putExtra("MESSAGE", message);
        startActivity(intent);
    }

    public void toFragment(View view) {
        Intent intent = new Intent(this, MultiFragmentActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("DATA", "DATA");
        DebugLog.e("save..");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        DebugLog.e("restore..");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DebugLog.e("destroy..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        DebugLog.e("onstart..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        DebugLog.e("onstop...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        DebugLog.e("onresume..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        DebugLog.e("onpause..");
    }
}
