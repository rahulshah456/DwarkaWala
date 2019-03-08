package Adapters;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dwarkawala.R;
import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mview;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mview = itemView;
    }
    public void setDetails(Context context, String title,String image){

        TextView textView = (TextView) mview.findViewById(R.id.rowTitle);
        ImageView imageView = (ImageView) mview.findViewById(R.id.rowImageView);

        textView.setText(title);
        Picasso.get().load(image).into(imageView);
    }
}
