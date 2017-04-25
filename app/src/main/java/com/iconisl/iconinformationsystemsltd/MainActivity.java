package com.iconisl.iconinformationsystemsltd;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Typeface constanceFont = Typeface.createFromAsset(getAssets(), "fonts/constance.ttf");
        Typeface letsEatFont = Typeface.createFromAsset(getAssets(), "fonts/lets_eat.ttf");

        Button employee = (Button) findViewById(R.id.employeeBtn);
        Button taskAssign = (Button) findViewById(R.id.asignTaskBtn);
        Button taskRceived = (Button) findViewById(R.id.taskReceivedBtn);
        Button attendence = (Button) findViewById(R.id.attendenceBtn);
        Button report = (Button) findViewById(R.id.reportBtn);

        employee.setTypeface(constanceFont);
        taskAssign.setTypeface(constanceFont);
        taskRceived.setTypeface(constanceFont);
        attendence.setTypeface(constanceFont);
        report.setTypeface(constanceFont);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_employee, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_employee_menu_btn:
                Toast.makeText(this, "Feature is comming soon", Toast.LENGTH_SHORT).show();
                break;
            /*case R.id.menuitem2:
                Toast.makeText(this, "Menu item 2 selected", Toast.LENGTH_SHORT).show();
                break;*/
        }
        return true;
    }
}
