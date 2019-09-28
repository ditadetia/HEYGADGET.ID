package com.demo.seventeenmember;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_DESC = "extra_desc";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_REALNAME = "extra_realname";
    public static final String EXTRA_PHOTO= "extra_photo";
    public static final String EXTRA_TTL= "extra_ttl";
    public static final String EXTRA_POSITION= "extra_position";
    public static final String EXTRA_HEIGHT= "extra_height";
    public static final String EXTRA_WEIGHT= "extra_weight";
    public static final String EXTRA_KARIR= "extra_karir";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvName = findViewById(R.id.membername);
        TextView tvRealName = findViewById(R.id.namaasli);
        TextView tvDesc= findViewById(R.id.desc);
        TextView tvBirth= findViewById(R.id.memberbirth);
        TextView tvPosition= findViewById(R.id.position);
        TextView tvHeight= findViewById(R.id.height);
        TextView tvWeight= findViewById(R.id.weight);
        TextView tvKarir= findViewById(R.id.karir);
        ImageView tvPhotoReceived = findViewById(R.id.photo);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);
        String birth= getIntent().getStringExtra(EXTRA_TTL);
        String realname= getIntent().getStringExtra(EXTRA_REALNAME);
        String position= getIntent().getStringExtra(EXTRA_POSITION);
        String height= getIntent().getStringExtra(EXTRA_HEIGHT);
        String weight= getIntent().getStringExtra(EXTRA_WEIGHT);
        String karir= getIntent().getStringExtra(EXTRA_KARIR);

        tvName.setText("Nama: "+ name);
        tvRealName.setText("Nama Asli: "+ realname);
        tvBirth.setText("Tempat & Tanggal Meninggal: " +birth);
        tvPosition.setText("Posisi: " +position);
        tvHeight.setText("Tinggi: " +height);
        tvWeight.setText("Berat: " +weight);
        tvDesc.setText("Deskripsi: \n" +desc);
        tvKarir.setText("Karya: \n" +karir);


        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(55, 55))
                .into(tvPhotoReceived);

    }
}

