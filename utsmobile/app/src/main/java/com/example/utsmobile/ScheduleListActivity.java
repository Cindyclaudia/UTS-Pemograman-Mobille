package com.example.utsmobile;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ScheduleListActivity extends AppCompatActivity {

    ListView listViewSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_list);

        listViewSchedule = findViewById(R.id.listViewSchedule);

        String[] scheduleItems = {
                "Sarapan – 08:00 Pagi",
                "Kuliah – 10:00 Pagi",
                "Kumpulkan Tugas – 11:00 Siang",
                "Kuliah Lagi – 13:00 Siang",
                "Pulang Kuliah – 15:00 Siang",
                "Olahraga – 17:00 Sore",
                "Membaca Buku – 20:00 Malam",
                "Belajar – 21:00 Malam",
                "Nonton Film – 22:00 Malam",
                "Tidur – 23:00 Malam"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, scheduleItems);
        listViewSchedule.setAdapter(adapter);
    }
}
