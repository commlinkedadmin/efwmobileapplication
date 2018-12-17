package ph.empoweringfilipinos.efwmobile;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import com.getbase.floatingactionbutton.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.github.clans.fab.FloatingActionMenu;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class HomePage extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);




        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);




        //FAB LINKS
        com.github.clans.fab.FloatingActionButton fabNews=findViewById(R.id.fabNews);

        fabNews.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                //code here
            }
        });

        com.github.clans.fab.FloatingActionButton fabBlogs=findViewById(R.id.fabBlogs);

        fabBlogs.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                //code here
            }
        });

        com.github.clans.fab.FloatingActionButton fabCommunities=findViewById(R.id.fabCommunities);

        fabCommunities.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                //code here
            }
        });

        com.github.clans.fab.FloatingActionButton fabAboutUs=findViewById(R.id.fabAboutUs);

        fabAboutUs.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                //code here
                showToast("Test");
            }
        });







    }







    public void showToast(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };




}
