package code4alltuts.fabandsnackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab;
    private CoordinatorLayout root_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root_view = (CoordinatorLayout) findViewById(R.id.root_view);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        // adding clickeListener to FAB
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DIsplaying Snackbar with Default Message
                Snackbar.make(root_view, "Floating Action Button and SnackBar", Snackbar.LENGTH_LONG).show();

                // DOne so lets run the program.
            }
        });
    }
}
