/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        LinearLayout linearLayout = linearLayout();
        int i;
        RelativeLayout numbersRelativeLayout = (RelativeLayout) findViewById(R.id.mainLayout);

        String[] words = new String[10];
        words[0] = "Un";
        words[1] = "Deux";
        words[2] = "Trois";
        words[3] = "Quatre";
        words[4] = "Cinq";
        words[5] = "Six";
        words[6] = "Sept";
        words[7] = "Huit";
        words[8] = "Neuf";
        words[9] = "Dix";


        for (i = 0; i <= 9; i++) {
            linearLayout.addView(textView(words[i]));
        }

        if (numbersRelativeLayout != null) {
            numbersRelativeLayout.addView(linearLayout);
        }
    }

    private TextView textView(String numberInLetter) {
        TextView textView = new TextView(this);
        textView.setPadding(8, 8, 8, 8);
        textView.setTextSize(16);
        textView.setText(numberInLetter);
        return textView;
    }

    private LinearLayout linearLayout() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        return linearLayout;
    }


}

