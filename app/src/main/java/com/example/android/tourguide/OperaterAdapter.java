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
package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class OperaterAdapter extends ArrayAdapter<Operater> {


    public OperaterAdapter(Context context, ArrayList<Operater> operaters, int colorResourceId) {
        super(context, 0, operaters);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Operater currentOperater = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        miwokTextView.setText(currentOperater.getDescription());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.operater_text_view);

        defaultTextView.setText(currentOperater.getOperater());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (currentOperater.hasImage()) {

            imageView.setImageResource(currentOperater.getImage());

            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);

        return listItemView;

    }
}