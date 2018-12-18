package ph.empoweringfilipinos.efwmobile;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class NewsPage extends AppCompatActivity {

    private Toolbar newsToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);

        Toolbar newsToolbar = findViewById(R.id.newsToolbar);

        setSupportActionBar(newsToolbar);
//       getSupportActionBar().setDisplayShowHomeEnabled(true);
//       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//       getSupportActionBar().setTitle("NEWS");




    }
}
