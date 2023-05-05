package com.example.dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Plant> plants = new ArrayList<Plant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list);

        PlantAdapter adapter = new PlantAdapter(this, plants);

        recyclerView.setAdapter(adapter);
    }



    private void setInitialData(){

        plants = new ArrayList<>();
        plants.add( new Plant("Кактусовые", "Семейство многолетних цветковых растений порядка Гвоздичноцветные,обитающих преимущественно в засушливых областях",
        R.drawable.img_1));
        plants.add( new Plant("Ромашка", "Род однолетних цветковых растений семейства астровые, или сложноцветные, по современной классификации объединяет около 70 видовневысоких пахучих трав",
                R.drawable.img_2));
        plants.add( new Plant("Кукуруза", "Однолетнее травянистое культурное растение, единственный культурный представитель рода",
                R.drawable.img_3));
        plants.add( new Plant("Мхи", "Отдел высших растений, насчитывающий около 13 тысяч видов, объединённых в более чем 900 родов и около 100 семейств",
                R.drawable.img_4));
        plants.add( new Plant("Авокадо", "Вечнозелёное плодовое растение; вид рода Персея семейства Лавровые, типовой вид рода",
                R.drawable.img_5));



    }
}