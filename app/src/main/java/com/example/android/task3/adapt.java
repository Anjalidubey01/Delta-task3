package com.example.android.task3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class adapt extends RecyclerView.Adapter<adapt.UsersViewHolder>{
    Context context;
    ArrayList<model> userListResponseData;

    public adapt(Context context, ArrayList<model> userListResponseData) {
        this.userListResponseData = userListResponseData;
       // this.userList = userListResponseData;
        this.context = context;
    }

    @Override
    public UsersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list, null);
        UsersViewHolder usersViewHolder = new UsersViewHolder(view);
        return usersViewHolder;
    }

    @Override
    public void onBindViewHolder(UsersViewHolder holder, final int position) {
        // set the data
        holder.name.setText( userListResponseData.get(position).getName());
       // holder.id.setText(userListResponseData.get(position).getId());
        // implement setONCLickListtener on itemView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Activity2.class);
                intent.putExtra("name",userListResponseData.get(position).getName());
                intent.putExtra("id",userListResponseData.get(position).getId());
                context.startActivity(intent);
                // display a toast with user name
                //Toast.makeText(context, userListResponseData.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return userListResponseData.size(); // size of the list items
    }
    public  void updateList(ArrayList<model> lis){
        userListResponseData = lis;
        notifyDataSetChanged();
    }

    class UsersViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name,id;

        public UsersViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.textView4);
            //id = (TextView)itemView.findViewById(R.id.name);
        }
    }
}

