package com.cmlbrnc.instragramclonewithparse;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PostClass extends ArrayAdapter<String> {

    private final ArrayList<String> username;
    private final ArrayList<String> userComment;
    private final ArrayList<Bitmap> userImage;
    private final Activity context;

    public PostClass( ArrayList<String> username,
                     ArrayList<String> userComment,
                     ArrayList<Bitmap> userImage,
                     Activity context) {
        super(context,R.layout.custom_view,username);

        this.username = username;
        this.userComment = userComment;
        this.userImage = userImage;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater =context.getLayoutInflater();

        View customView =layoutInflater.inflate(R.layout.custom_view,null,true);  //Custom view layout object

        //object of the elements
        TextView userNameText=customView.findViewById(R.id.txvUsernameList);
        TextView commentTExt=customView.findViewById(R.id.txvCommentList);
        ImageView imageView=customView.findViewById(R.id.imvList);


        //setting object values...

        userNameText.setText(username.get(position));
        commentTExt.setText(userComment.get(position));
        imageView.setImageBitmap(userImage.get(position));

        return customView;
    }
}
