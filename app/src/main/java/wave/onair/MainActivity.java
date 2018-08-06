package wave.onair;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar app_bar;
    private DrawerLayout drawer;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate_ids();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new status()).commit();
            navigationView.setCheckedItem(R.id.nav_item_home);
        }
    }


    private void initiate_ids() {
        app_bar = findViewById(R.id.app_bar);
        setSupportActionBar(app_bar);

        navigationView = findViewById(R.id.nav_drawer);
        navigationView.setNavigationItemSelectedListener(this);


        drawer = findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, app_bar, R.string.drawer_is_open,
                R.string.drawer_is_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_item_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new status()).commit();
                break;
            case R.id.nav_item_trend:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new trending()).commit();
                break;
            case R.id.nav_item_saved:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new saved()).commit();
                break;
            case R.id.nav_item_c_request:
                break;
            case R.id.nav_item_c_share:
                break;
            case R.id.nav_item_c_more:
                break;
        }
        drawer.closeDrawer(Gravity.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(Gravity.START)) {
            drawer.closeDrawer(Gravity.START);
        } else
            super.onBackPressed();
    }


}
