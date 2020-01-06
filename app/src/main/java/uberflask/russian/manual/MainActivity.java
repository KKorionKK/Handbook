package uberflask.russian.manual;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               Fragment selectedFragment = null;

               switch (item.getItemId()) {
                   case R.id.action_home:
                       Toast.makeText(MainActivity.this, "Домой", Toast.LENGTH_SHORT).show();
                       selectedFragment = new HomeFragment();
                       break;
                   case R.id.action_bookmarks:
                       Toast.makeText(MainActivity.this, "Закладки", Toast.LENGTH_SHORT).show();
                       selectedFragment = new BookmarksFragment();
                       break;
                   case R.id.action_settings:
                       Toast.makeText(MainActivity.this, "Настройки", Toast.LENGTH_SHORT).show();
                       selectedFragment = new SettingsFragment();
                       break;
               }
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                       selectedFragment).commit();
           return true;}
        });
    }
}
