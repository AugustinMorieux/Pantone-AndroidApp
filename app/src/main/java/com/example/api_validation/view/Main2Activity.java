package com.example.api_validation.view;

import android.graphics.Bitmap;
        import android.graphics.drawable.Drawable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.graphics.Palette;
        import android.widget.Toast;

import com.example.api_validation.R;
import com.example.api_validation.model.Pokemon;
import com.google.gson.Gson;
        import com.squareup.picasso.Picasso;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import com.squareup.picasso.Target;



public class Main2Activity extends AppCompatActivity {


    public TextView  txtHeader;
    public TextView  txtFooter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView imageView = (ImageView) findViewById(R.id.main_image);
        final ViewGroup backgroundGroup = (ViewGroup) findViewById(R.id.main_background);
        final TextView titleColorText = (TextView) findViewById(R.id.main_title_text);
        final TextView bodyColorText = (TextView) findViewById(R.id.main_body_text);


        int imageDimension =
                (int) getResources().getDimension(R.dimen.image_size);



        // MAGIE AVEC GSON
        String itemJson = getIntent().getStringExtra("key");
        Gson gson = new Gson();

        final Pokemon item = gson.fromJson(itemJson, Pokemon.class);


        /*** FONCTION PICASSO ***/
        Picasso.with(Main2Activity.this)
                .load(item.getImg())
                .resize(imageDimension, imageDimension)
                .centerCrop()
                .into(new Target() {
                    @Override
                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                        assert imageView != null;
                        imageView.setImageBitmap(bitmap);
                        Palette.from(bitmap)
                                .generate(new Palette.PaletteAsyncListener() {


                                    @Override
                                    public void onGenerated(Palette palette) {
                                        Palette.Swatch textSwatch = palette.getDarkMutedSwatch();
                                        if (textSwatch == null) {
                                            Toast.makeText(Main2Activity.this, "Null swatch :(", Toast.LENGTH_SHORT).show();
                                            return;
                                        }
                                        backgroundGroup.setBackgroundColor(textSwatch.getRgb());
                                        titleColorText.setTextColor(textSwatch.getTitleTextColor());
                                        bodyColorText.setTextColor(textSwatch.getBodyTextColor());
                                        titleColorText.setText(item.getName());
                                        bodyColorText.setText(" rgb:  " +  item.getRgb());
                                    }
                                });
                    }

                    @Override
                    public void onBitmapFailed(Drawable errorDrawable) {

                    }

                    @Override
                    public void onPrepareLoad(Drawable placeHolderDrawable) {

                    }
                });

    }

}