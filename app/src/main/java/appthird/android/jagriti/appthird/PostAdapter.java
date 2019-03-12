package appthird.android.jagriti.appthird;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {
    List<Post> postList = new ArrayList<>();
    //whenever this is called we can pass list to this constructor
    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //
      View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_post,viewGroup,false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        final Post p = postList.get(position);
        myViewHolder.textViewid.setText(String.format("%s",p.id));
        myViewHolder.textViewTitle.setText(p.title);
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),p.description,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return postList.size(); //returns the size of list to show in recycle view
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewid,textViewTitle;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewid = itemView.findViewById(R.id.tv_id_vlaue);
            textViewTitle = itemView.findViewById(R.id.tv_title_value);

        }

    }
    //
}
