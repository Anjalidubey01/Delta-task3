package com.example.android.task3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class userListAdapter extends RecyclerView.Adapter<userListAdapter.UsersViewHolde>
{
    Context context;
    List<Model2> userListResponseData;
    public userListAdapter(Context context, List<Model2>userListResponseData) {
        this.userListResponseData = userListResponseData;
        this.context = context;
    }
    @Override
    public UsersViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list, null);
        UsersViewHolde usersViewHolder = new UsersViewHolde(view);
        return usersViewHolder;
    }
    @Override
public void onBindViewHolder(UsersViewHolde holder, final int position) {
    holder.name.setText( userListResponseData.get(position).getCategory());
   // holder.id.setText(userListResponseData.get(position).getId());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =  new Intent(context, crime_details.class);
            intent.putExtra("nam",userListResponseData.get(position).getCategory());
            intent.putExtra("location",userListResponseData.get(position).getLocation().getLatitude());
            intent.putExtra("persistent",userListResponseData.get(position).getPersistentId());
            intent.putExtra("locasub",userListResponseData.get(position).getLocationSubtype());
            intent.putExtra("i",userListResponseData.get(position).getMonth());
            context.startActivity(intent);
            // display a toast with user name
            //Toast.makeText(context, userListResponseData.get(position).getName(), Toast.LENGTH_SHORT).show();
        }
    });
}
    @Override
    public int getItemCount() {
   return userListResponseData.size();
    }

    class UsersViewHolde extends RecyclerView.ViewHolder {
        TextView name,id;

        public UsersViewHolde(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textView4);
           // id = (TextView)itemView.findViewById(R.id.name);
        }
    }
}
